package SPRINT1.Tasca5_Java_Utils.Nivell1.Exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
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

        try {
            if (directorio.isDirectory()) {
                System.out.println("Ruta válida: " + directorio.getAbsolutePath() +
                        "\n\n*****************************************************" +
                        "\n*** Ordenando y generando arbol de directorios... ***" +
                        "\n*****************************************************");
                generarArbol(directorio);
            } else {
                throw new RutaNoValidaException("Error: ruta no válida.");
            }
        } catch (RutaNoValidaException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static void generarArbol(File directorio) {

        File[] arbolDirectorios = directorio.listFiles();

        try {
        if (arbolDirectorios == null || arbolDirectorios.length == 0) {
            throw new DirectorioVacioException("** El directorio " + directorio.getName().toUpperCase() +
            " está vacío y no contiene ningún archivo o carpeta. **");
        } else {
            Arrays.sort(arbolDirectorios);
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            for (int i = 0; i < arbolDirectorios.length; i++) {
                File arbolDirectorio = arbolDirectorios[i];
                if (arbolDirectorio.isDirectory()) {
                    System.out.println("\n" + arbolDirectorio.getName().toUpperCase() + " (Directorio - Última fecha de modificación: " +
                            fecha.format(arbolDirectorio.lastModified()) + ")");
                    generarArbol(arbolDirectorio);
                } else {
                    System.out.println("   - " + arbolDirectorio.getName() + " (Archivo - Última fecha de modificación: " +
                            fecha.format(arbolDirectorio.lastModified()) + ")");
                }
            }
        }
        } catch (DirectorioVacioException e) {
            System.out.println(e.getMessage());
        }
    }
}