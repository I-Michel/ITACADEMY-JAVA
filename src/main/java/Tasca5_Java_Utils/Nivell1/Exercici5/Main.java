package Tasca5_Java_Utils.Nivell1.Exercici5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        iniciarPrograma();

    }

    public static void iniciarPrograma() throws IOException {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.println("¡Bienvenido!");

        do {
            System.out.println("\nEscoge una opción:" +
                    "\n1. Guardar en un archivo .txt un listado ordenado de un árbol de directorios" +
                    "\n2. Leer un archivo.txt" +
                    "\n3. Serializar un archivo o directorio en un archivo .ser" +
                    "\n4. Desserializar un archivo .ser" +
                    "\n5. Salir");

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    ordenar();
                    break;
                case 2:
                    leer();
                    break;
                case 3:
                    serializar();
                    break;
                case 4:
                    desserializar();
                    break;
                case 5:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Error. Debes elegir una opción entre 1 y 5:");

            }
        } while (opc != 5);

        sc.close();
        /* Solo cierro el Scanner aquí porque es donde acaba el programa y si lo cierro
         * en los demás métodos este Scanner también se cierra antes de tiempo. */
    }

    public static void ordenar() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del directorio que quieres ordenar:");
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
                leer();
            } else {
                throw new RutaNoValidaException("Error: ruta no válida.");
            }
        } catch (RutaNoValidaException e) {
            System.out.println(e.getMessage());
        }
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

        try (FileWriter fw = new FileWriter("arbolDirectorios.txt", true)) {
            fw.write(resultado + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leer() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo .txt que quieres leer:");
        String ruta = sc.nextLine();
        File directorio = new File(ruta);

        try {
            if (directorio.isFile()) {
                System.out.println("Ruta válida: " + directorio.getAbsolutePath() +
                        "\n\n*** Leyendo e imprimiendo archivo... ***\n");
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
            } else {
                throw new RutaNoValidaException("Error: ruta no válida.");
            }
        } catch (RutaNoValidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void serializar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo o directorio que quieres serializar:");
        String ruta = sc.nextLine();
        File directorio = new File(ruta);

        try {
            if (directorio.isFile() || directorio.isDirectory()) {
                SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy (HH:mm:ss)");
                String tipo = directorio.isDirectory() ? "Directorio" : "Archivo";
                Registro registro = new Registro(directorio.getName(), tipo, fecha.format(directorio.lastModified()));
                try {
                    FileOutputStream file = new FileOutputStream("output/registroSerializado.ser");
                    ObjectOutputStream out = new ObjectOutputStream(file);
                    out.writeObject(registro);
                    System.out.println("Se ha creado un archivo .ser con el objeto serializado.");

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                throw new RutaNoValidaException("Error: ruta no válida.");
            }
        } catch (RutaNoValidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void desserializar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo .ser que quieres desserializar:");
        String ruta = sc.nextLine();
        File archivo = new File(ruta);

        try {
            if (archivo.isFile()) {
                try {
                    FileInputStream file = new FileInputStream(archivo);
                    ObjectInputStream in = new ObjectInputStream(file);
                    Registro registro = (Registro) in.readObject();
                    System.out.println("Se ha desserializado el registro:\n" + registro);

                } catch (IOException | ClassNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                throw new RutaNoValidaException("Error: ruta no válida.");
            }
        } catch (RutaNoValidaException e) {
            System.out.println(e.getMessage());
        }
    }
}