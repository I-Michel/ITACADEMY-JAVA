package Sprint1.Tasca3_Java_Collections.Nivell1.Exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Juego {

    public static HashMap<String, String> generarMapa() {

        HashMap<String, String> mapaPaises = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/countries.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {                  // Leemos una línea y la guardamos en String (mientras no sea null)
                String[] divisor = linea.split(" ", 2);    // Dividimos la línea en dos valores
                if (!linea.isEmpty()) {                               // Comprobamos que se han almacenado correctamente y que no esté vacío
                    String llave = divisor[0].replace("_", " ");      // Asignamos el primer valor a la llave del futuro Hashmap (quito guiones)
                    String valor = divisor[1].replace("_", " ");      // Asignamos el segundo valor al valor del futuro Hashmap (quito guiones)
                    mapaPaises.put(llave, valor);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return mapaPaises;
    }

    public static String generarPaisRandom(HashMap<String, String> mapaPaises) {
        int random = (int) (Math.random() * mapaPaises.size());        // No le sumo 1 porque también interesa que salga el 0 al ser una posición de Array
        String pais = (String) mapaPaises.keySet().toArray()[random];

        return pais;
    }

    public static void guardar(String player, int puntuacion) {
        try (FileWriter fw = new FileWriter("src/main/resources/classificacio.txt", true)) {
            String linea = "Jugador: " + player + " - " + puntuacion + " puntos\n";
            fw.write(linea);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void jugar() {

        Scanner sc = new Scanner(System.in);
        int puntuacion = 0;

        HashMap<String, String> mapaPaises = generarMapa();

        if(mapaPaises.isEmpty()) {
            System.out.println("No se ha podido inicializar el juego.");
            return;
        }

        System.out.println("¡Bienvenid@ al juego de acertar capitales! Inserta tu nombre:");
        String player = sc.nextLine();
        System.out.println("Perfecto, " + player + ". Recuerda que jugaremos en INGLÉS." +
                "\nPor cada capital acertada, sumarás 1 punto. ¡Empezamos!\n");

        for (int i = 10; i != 0; i--) {
            String paisRandom = generarPaisRandom(mapaPaises);
            String capitalCorrecta = mapaPaises.get(paisRandom);
            System.out.println("- Introduce la capital de " + paisRandom + " en INGLÉS:");
            String capital = sc.nextLine();
            if (capital.equalsIgnoreCase(capitalCorrecta)) {
                System.out.println("¡Respuesta correcta!\n");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta. La capital de " + paisRandom +
                        " es " + capitalCorrecta + ".\n");
            }
            mapaPaises.remove(paisRandom);
        }
        guardar(player, puntuacion);
        System.out.println("Puntuación final de " + player + ": " + puntuacion + " puntos. Has tenido " +
                (10 - puntuacion) + " fallos.\n¡Hasta la próxima!");
    }
}
