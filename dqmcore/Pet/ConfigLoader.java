package net.minecraft.src.dqmcore.Pet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class ConfigLoader
{
    private boolean updateFile = false;
    private File dir;
    private String fileName;
    private Class configClass;
    private LinkedList configFields;

    public ConfigLoader(Class var1, File var2, String var3)
    {
        if (!var2.exists())
        {
            var2.mkdir();
        }

        this.dir = var2;
        this.configClass = var1;
        this.configFields = new LinkedList();
        this.fileName = var3 + ".cfg";
        Field[] var4 = this.configClass.getDeclaredFields();
        Field[] var5 = var4;
        int var6 = var4.length;

        for (int var7 = 0; var7 < var6; ++var7)
        {
            Field var8 = var5[var7];

            if (var8.isAnnotationPresent(ConfigProp.class))
            {
                this.configFields.add(var8);
            }
        }
    }

    public void loadConfig()
    {
        try
        {
            File var1 = new File(this.dir, this.fileName);
            HashMap var2 = new HashMap();
            Iterator var3 = this.configFields.iterator();

            while (var3.hasNext())
            {
                Field var4 = (Field)var3.next();
                ConfigProp var5 = (ConfigProp)var4.getAnnotation(ConfigProp.class);
                var2.put(!var5.name().isEmpty() ? var5.name() : var4.getName(), var4);
            }

            if (var1.exists())
            {
                HashMap var9 = this.parseConfig(var1, var2);
                Iterator var10 = var9.keySet().iterator();
                String var11;

                while (var10.hasNext())
                {
                    var11 = (String)var10.next();
                    Field var6 = (Field)var2.get(var11);
                    Object var7 = var9.get(var11);

                    if (!var7.equals(var6.get((Object)null)))
                    {
                        var6.set((Object)null, var7);
                    }
                }

                var10 = var2.keySet().iterator();

                while (var10.hasNext())
                {
                    var11 = (String)var10.next();

                    if (!var9.containsKey(var11))
                    {
                        this.updateFile = true;
                    }
                }
            }
            else
            {
                this.updateFile = true;
            }
        }
        catch (Exception var8)
        {
            this.updateFile = true;
            System.err.println(var8.getMessage());
        }

        if (this.updateFile)
        {
            this.updateConfig();
        }

        this.updateFile = false;
    }

    private HashMap parseConfig(File var1, HashMap var2) throws Exception
    {
        HashMap var3 = new HashMap();
        BufferedReader var4 = new BufferedReader(new FileReader(var1));
        String var5;

        while ((var5 = var4.readLine()) != null)
        {
            if (!var5.startsWith("#") && var5.length() != 0)
            {
                int var6 = var5.indexOf("=");

                if (var6 > 0 && var6 != var5.length())
                {
                    String var7 = var5.substring(0, var6);
                    String var8 = var5.substring(var6 + 1);

                    if (!var2.containsKey(var7))
                    {
                        this.updateFile = true;
                    }
                    else
                    {
                        Object var9 = null;
                        Class var10 = ((Field)var2.get(var7)).getType();

                        if (var10.isAssignableFrom(String.class))
                        {
                            var9 = var8;
                        }
                        else if (var10.isAssignableFrom(Integer.TYPE))
                        {
                            var9 = Integer.valueOf(Integer.parseInt(var8));
                        }
                        else if (var10.isAssignableFrom(Short.TYPE))
                        {
                            var9 = Short.valueOf(Short.parseShort(var8));
                        }
                        else if (var10.isAssignableFrom(Byte.TYPE))
                        {
                            var9 = Byte.valueOf(Byte.parseByte(var8));
                        }
                        else if (var10.isAssignableFrom(Boolean.TYPE))
                        {
                            var9 = Boolean.valueOf(Boolean.parseBoolean(var8));
                        }
                        else if (var10.isAssignableFrom(Float.TYPE))
                        {
                            var9 = Float.valueOf(Float.parseFloat(var8));
                        }
                        else if (var10.isAssignableFrom(Double.TYPE))
                        {
                            var9 = Double.valueOf(Double.parseDouble(var8));
                        }

                        if (var9 != null)
                        {
                            var3.put(var7, var9);
                        }
                    }
                }
                else
                {
                    this.updateFile = true;
                }
            }
        }

        return var3;
    }

    public void updateConfig()
    {
        System.out.println("Update Config " + this.fileName);
        File var1 = new File(this.dir, this.fileName);

        try
        {
            if (!var1.exists())
            {
                var1.createNewFile();
            }

            BufferedWriter var2 = new BufferedWriter(new FileWriter(var1));
            Iterator var3 = this.configFields.iterator();

            while (var3.hasNext())
            {
                Field var4 = (Field)var3.next();
                ConfigProp var5 = (ConfigProp)var4.getAnnotation(ConfigProp.class);

                if (var5.info().length() != 0)
                {
                    var2.write("#" + var5.info() + "\n");
                }

                String var6 = !var5.name().isEmpty() ? var5.name() : var4.getName();

                try
                {
                    var2.write(var6 + "=" + var4.get((Object)null).toString() + "\n");
                    var2.write("\n");
                }
                catch (IllegalArgumentException var8)
                {
                    var8.printStackTrace();
                }
                catch (IllegalAccessException var9)
                {
                    var9.printStackTrace();
                }
            }

            var2.close();
        }
        catch (IOException var10)
        {
            var10.printStackTrace();
        }
    }
}
