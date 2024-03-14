package Tasca5_Java_Utils.Nivell2.Exercici1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

            iniciarPrograma();

    }

    public static void iniciarPrograma() throws IOException {

        Properties propiedades = new Properties();
        propiedades.load(Main.class.getResourceAsStream("/config.properties"));
        String rutaDirectorio = propiedades.getProperty("directorioT5N2");

        File directorio = new File(rutaDirectorio);

        if (directorio.isDirectory()) {
            System.out.println("Ruta válida: " + directorio.getAbsolutePath() +
                    "\n\n*****************************************************" +
                    "\n*** Ordenando y generando arbol de directorios... ***" +
                    "\n*****************************************************");
            generarArbol(directorio, propiedades);
            System.out.println("\nARCHIVO .TXT CREADO CON ÉXITO.");
        } else {
            System.out.println("Ruta no válida.");
        }
    }

    public static void generarArbol(File directorio, Properties propiedades) throws IOException {

        File[] arbolDirectorios = directorio.listFiles();
        String resultado = "";
        if (arbolDirectorios == null || arbolDirectorios.length == 0) {
            resultado = ("   ** El directorio " + directorio.getName().toUpperCase() +
                    " está vacío y no contiene ningún archivo o carpeta. **");
            guardar(resultado, propiedades);
        } else {
            Arrays.sort(arbolDirectorios);
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            for (int i = 0; i < arbolDirectorios.length; i++) {
                File arbolDirectorio = arbolDirectorios[i];
                if (arbolDirectorio.isDirectory()) {
                    resultado = ("\n" + arbolDirectorio.getName().toUpperCase() + " (Directorio - Última fecha de modificación: " +
                            fecha.format(arbolDirectorio.lastModified()) + ")");
                    guardar(resultado, propiedades);
                    generarArbol(arbolDirectorio, propiedades);
                } else {
                    resultado = ("   - " + arbolDirectorio.getName() + " (Archivo - Última fecha de modificación: " +
                            fecha.format(arbolDirectorio.lastModified()) + ")");
                    guardar(resultado, propiedades);
                }
            }
        }
    }

    public static void guardar(String resultado, Properties propiedades) throws IOException {

        File f = new File(propiedades.getProperty("directorioGuardar"), propiedades.getProperty("nombreTxt"));
        if (!f.exists()) {
            f.createNewFile();
        }

        try (FileWriter fw = new FileWriter(f, true)) {
            fw.write(resultado + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}