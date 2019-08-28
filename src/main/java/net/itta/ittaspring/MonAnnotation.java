
package net.itta.ittaspring;


import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
public @interface MonAnnotation{
     
    String[] value() default  {};
}
