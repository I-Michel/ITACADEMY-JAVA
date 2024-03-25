package SPRINT1.Tasca5_Java_Utils.Nivell1.Exercici4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        iniciarPrograma();

    }

    public static void iniciarPrograma() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del directorio que quieres ordenar o leer:");
        String ruta = sc.nextLine();
        File directorio = new File(ruta);

        try {
            if (directorio.isDirectory()) {
                System.out.println("Ruta válida: " + directorio.getAbsolutePath() +
                        "\n\n*****************************************************" +
                        "\n*** Ordenando y generando arbol de directorios... ***" +
                        "\n*****************************************************");
                generarArbol(directorio);
                System.out.println("\nARCHIVO .TXT CREADO CON ÉXITO.");
            } else if (directorio.isFile()) {
                System.out.println("Ruta válida: " + directorio.getAbsolutePath() +
                        "\n\n*** Leyendo e imprimiendo archivo... ***\n");
                leer(ruta);
            } else {
                throw new RutaNoValidaException("Error: ruta no válida.");
            }
        } catch (RutaNoValidaException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static void generarArbol(File directorio) throws IOException {

        File[] arbolDirectorios = directorio.listFiles();
        String resultado = "";

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
        } catch (DirectorioVacioException e) {
            System.out.println(e.getMessage());
            resultado = e.getMessage();
            guardar(resultado);
        }
    }

    public static void guardar(String resultado) throws IOException {

        File f = new File("output", "arbolDirectorios.txt");
        if (!f.exists()) {
            f.createNewFile();
        }

        try (FileWriter fw = new FileWriter(f, true)) {
            fw.write(resultado + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leer(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {    // Leemos una línea y la guardamos en String (mientras no sea null)
                if (!linea.isEmpty()) {                  // Comprobamos que se han almacenado correctamente y que no esté vacío
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}