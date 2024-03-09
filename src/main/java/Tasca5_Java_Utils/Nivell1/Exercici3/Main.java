package Tasca5_Java_Utils.Nivell1.Exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

            iniciarPrograma();

    }

    public static void iniciarPrograma() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del directorio que quieres ordenar:");
        File directorio = new File(sc.nextLine());

        if (directorio.isDirectory()) {
            System.out.println("Ruta válida: " + directorio.getAbsolutePath() +
                    "\n\n*****************************************************" +
                    "\n*** Ordenando y generando arbol de directorios... ***" +
                    "\n*****************************************************");
            generarArbol(directorio);
            System.out.println("\nARCHIVO .TXT CREADO CON ÉXITO.");
        } else {
            System.out.println("Ruta no válida.");
        }
        sc.close();
    }

    public static void generarArbol(File directorio) throws IOException {

        File[] arbolDirectorios = directorio.listFiles();
        String resultado = "";
        if (arbolDirectorios == null || arbolDirectorios.length == 0) {
            resultado = ("   ** El directorio " + directorio.getName().toUpperCase() +
                    " está vacío y no contiene ningún archivo o carpeta. **");
            guardar(resultado);
        } else {
            Arrays.sort(arbolDirectorios);
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            for (int i = 0; i < arbolDirectorios.length; i++) {
                File arbolDirectorio = arbolDirectorios[i];
                if (arbolDirectorio.isDirectory()) {
                    resultado = ("\n" + arbolDirectorio.getName().toUpperCase() + " (Directorio - Última fecha de modificación: " +
                            fecha.format(arbolDirectorio.lastModified()) + ")");
                    guardar(resultado);
                    generarArbol(arbolDirectorio);
                } else {
                    resultado = ("   - " + arbolDirectorio.getName() + " (Archivo - Última fecha de modificación: " +
                            fecha.format(arbolDirectorio.lastModified()) + ")");
                    guardar(resultado);
                }
            }
        }
    }

    public static void guardar(String resultado) throws IOException {

        File f = new File("arbolDirectorios.txt");
        if (!f.exists()) {
            f.createNewFile();
        }

        try (FileWriter fw = new FileWriter("arbolDirectorios.txt", true)) {
            fw.write(resultado + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}