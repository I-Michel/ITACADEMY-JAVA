package SPRINT1.Tasca7_Annotations.Nivell2.Exercici1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Serialitzador {
    String nomArxiu() default "Objecte.json";
    String directori();
}
