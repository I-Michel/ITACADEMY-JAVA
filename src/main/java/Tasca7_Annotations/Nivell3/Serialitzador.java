package Tasca7_Annotations.Nivell3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
// Aquí és on ja havia complert una part del nivell 3.
@Serialitzador

public @interface Serialitzador {
    String nomArxiu() default "Objecte.json";
    String directori() default "output";
}
