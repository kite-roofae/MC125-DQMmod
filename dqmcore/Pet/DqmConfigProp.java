package net.minecraft.src.dqmcore.Pet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD})
public @interface DqmConfigProp
{

String name() default "";

String info() default "";
}
