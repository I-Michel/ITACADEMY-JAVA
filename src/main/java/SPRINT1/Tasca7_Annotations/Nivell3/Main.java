package SPRINT1.Tasca7_Annotations.Nivell3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        /* És exactament el mateix que he fet al nivell 2 (sense saber que després el que es demanava
         * al nivell 3, ja era el que havia fet). Assenyalo amb un comentari les parts adients. */

        Paraula paraula = new Paraula("你好", "Xinès");

        serialitzadorJson(paraula);
    }

    public static void serialitzadorJson(Object object) {
        try {
            Class<?> classe = object.getClass();
            if (classe.isAnnotationPresent(Serialitzador.class)) {
                Serialitzador anotacio = classe.getAnnotation(Serialitzador.class);
                // Aquí és on ja havia complert una part del nivell 3.

                String nomArxiu = anotacio.nomArxiu();
                String directori = anotacio.directori();
                Gson gson = new GsonBuilder().create();

                String paraulaJson = gson.toJson(object);

                File f = new File(directori, nomArxiu);
                FileWriter fw = new FileWriter(f, true);
                if (!f.exists()) {
                    f.createNewFile();
                }
                fw.write(paraulaJson);
                fw.close();

                System.out.println("L'objecte \"" + object.toString() + "\" s'ha serialitzat en un arxiu JSON.");
            } else {
                System.out.println("L'objecte proporcionat no té l'annotació necessària a la seva classe.");
            }
        } catch (Exception e) {
            System.out.println("Error: no s'ha pogut serialitzar l'objecte \"" + object.toString() +
                    "\" en un arxiu JSON.\n" + e.getMessage());
        }
    }
}