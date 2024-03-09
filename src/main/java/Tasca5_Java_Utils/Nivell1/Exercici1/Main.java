package Tasca5_Java_Utils.Nivell1.Exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            iniciarPrograma();
    }

    public static void iniciarPrograma() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del directorio que quieres ordenar:");
        File directorio = new File(sc.nextLine());

        if (directorio.isDirectory()) {
            System.out.println("Ruta válida: " + directorio.getAbsolutePath() +
                    "\n\n*******************************" +
                    "\n*** Ordenando directorio... ***" +
                    "\n*******************************\n");
            ordenarDirectorio(directorio);
        } else {
            System.out.println("Ruta no válida.");
        }

        sc.close();
    }

    public static void ordenarDirectorio(File directorio) {
        File[] directorios = directorio.listFiles();
        Arrays.sort(directorios);

        for (File directoriox : directorios) {
            System.out.println("- " + directoriox.getName());
        }
    }
}