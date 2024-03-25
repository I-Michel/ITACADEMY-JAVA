package Sprint1.Tasca1_Herencia_i_Polimorfisme.Nivell3.Exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    private static ArrayList<Redactor> redactors = new ArrayList<Redactor>();

    public static void iniciarPrograma() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.println("¡Benvingut!");

        do {
            System.out.println("\nEscull una opció, si us plau:" +
                    "\n1. Introduir redactor." +
                    "\n2. Eliminar redactor." +
                    "\n3. Introduir notícia a un redactor." +
                    "\n4. Eliminar notícia." +
                    "\n5. Mostrar tots els redactors." +
                    "\n6. Mostrar totes les notícies per redactor." +
                    "\n7. Calcular puntuació de la notícia." +
                    "\n8. Calcular preu-notícia." +
                    "\n9. Sortir.");

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    introduirRedactor();
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introduirNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarRedactors();
                    break;
                case 6:
                    mostrarNoticies();
                    break;
                case 7:
                    calcularPuntuacioNoticia();
                    break;
                case 8:
                    calcularPreuNoticia();
                    break;
                case 9:
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Error. Has d'escollir una opció entre l'1 i el 8:");
            }
        } while (opc != 9);

        sc.close();
    }

    public static void introduirRedactor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quin és el nom del nou redactor o redactora?");
        String nom = sc.nextLine();
        System.out.println("Quin és el DNI del nou redactor o redactora?");
        String dni = sc.nextLine();
        redactors.add(new Redactor(nom, dni));
        System.out.println("S'ha introduït el nou redactor/a " + nom + ".");
    }

    public static void eliminarRedactor() {
        Scanner sc = new Scanner(System.in);
        int indexRedactor = trobarRedactor();
        int opc = 0;

        if (indexRedactor != -1) {
            do {
                System.out.println("Segur que vols eliminar el redactor/a " +
                        redactors.get(indexRedactor).getNom() + "?\nEscull una opció" +
                        "\n1. Sí" +
                        "\n2. No");
                opc = sc.nextInt();
                sc.nextLine();
                if (opc == 1) {
                    redactors.remove(indexRedactor);
                    System.out.println("S'ha eliminat el redactor/a.");
                } else if (opc == 2) {
                    System.out.println("Operació cancel·lada.");
                } else {
                    System.out.println("Error. Has d'escollir una opció vàlida.");
                }
            } while (opc != 1 && opc != 2);
        }
    }

    public static void introduirNoticia() {
        Scanner sc = new Scanner(System.in);
        String missatge = "Notícia introduïda amb èxit.";
        int index = trobarRedactor();

        System.out.println("Confirmes que vols introduir una noticia pel redactor/a " +
                redactors.get(index).getNom() +
                "?\nEscull una opció, si us plau:" +
                "\n1. Sí." +
                "\n2. No.");
        int opc = sc.nextInt();
        sc.nextLine();
        if (opc == 1) {
            System.out.println("Quin és el titular de la notícia?");
            String titular = sc.nextLine();
            do {
                System.out.println("Quin tipus de notícia és? Escull una opció, si us plau:" +
                        "\n1. Futbol." +
                        "\n2. Bàsquet." +
                        "\n3. Tenis." +
                        "\n4. F1." +
                        "\n5. Motociclisme." +
                        "\n6. Cancel·lar.");
                opc = sc.nextInt();
                sc.nextLine();

                switch (opc) {
                    case 1:
                        redactors.get(index).getNoticies().add(Futbol.noticiaFutbol(redactors.get(index), titular));
                        break;
                    case 2:
                        redactors.get(index).getNoticies().add(Basquet.noticiaBasquet(redactors.get(index), titular));
                        break;
                    case 3:
                        redactors.get(index).getNoticies().add(Tenis.noticiaTenis(redactors.get(index), titular));
                        break;
                    case 4:
                        redactors.get(index).getNoticies().add(F1.noticiaF1(redactors.get(index), titular));
                        break;
                    case 5:
                        redactors.get(index).getNoticies().add(Motociclisme.noticiaMotociclisme(redactors.get(index), titular));
                        break;
                    case 6:
                        missatge = "S'ha cancel·lat l'operació.";
                        break;
                    default:
                        System.out.println("Error. Has d'escollir una opció entre l'1 i el 5:");
                }
            } while (opc < 1 || opc > 6);
        } else if (opc == 2) {
            missatge = "S'ha cancel·lat l'operació.";
        } else {
            missatge = "Error: opció no vàlida.";
        }
        System.out.println(missatge);
    }

    public static void eliminarNoticia() {
        Scanner sc = new Scanner(System.in);
        int indexRedactor = trobarRedactor();
        int indexNoticia = trobarNoticia(indexRedactor);
        if (indexNoticia != -1) {
            redactors.get(indexRedactor).getNoticies().remove(trobarNoticia(indexRedactor));
            System.out.println("S'ha eliminat la notícia.");
        }
    }

    public static void mostrarRedactors() {

        if (redactors.isEmpty()) {
            System.out.println("Encara no hi ha cap redactor enllistat.");
        } else {
            System.out.println("Llistat actual de redactors:");
            for (Redactor redactor : redactors) {
                System.out.println("- " + redactor);
            }
        }
    }

    public static void mostrarNoticies() {
        if (redactors.isEmpty()) {
            System.out.println("Encara no hi ha cap redactor enllistat.");
        } else {
            System.out.println("Llistat actual de notícies per redactors:");
            for (Redactor redactor : redactors) {
                System.out.println("** Redactor/a " + redactor.getNom() + " **");
                if (redactor.getNoticies().isEmpty()) {
                    System.out.println("Aquest redactor/a encara no té cap notícia.");
                }
                for (Noticia noticia : redactor.getNoticies()) {
                    System.out.println("- " + noticia);
                }
                System.out.println();
            }
        }
    }

    public static int trobarRedactor() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean valid = false;
        int index = -1;

        if (redactors.isEmpty()) {
            System.out.println("Error: encara no hi ha cap redactor enllistat.");
        } else {

            do {
                System.out.println("Quin és el redactor/a? Escull un número:");
                int contador = 0;
                for (Redactor redactor : redactors) {
                    contador++;
                    System.out.println(contador + ". " + redactor);
                }
                opc = sc.nextInt();
                sc.nextLine();
                if (opc >= 1 && opc <= redactors.size()) {
                    index = opc - 1;
                    valid = true;
                } else {
                    System.out.println("Error. Has d'escollir un nombre vàlid.");
                }
            } while (!valid);
        }
        return index;
    }

    public static int trobarNoticia(int indexRedactor) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int contador = 0;
        boolean valid = false;
        int indexNoticia = -1;

        if (indexRedactor != -1) {
            if (redactors.get(indexRedactor).getNoticies().isEmpty()) {
                System.out.println("Aquest redactor encara no té cap notícia.");
            } else {
                do {
                    System.out.println("Quina és la notícia que busques? Escull un número:");
                    for (Noticia noticia : redactors.get(indexRedactor).getNoticies()) {
                        contador++;
                        System.out.println(contador + ". " + noticia);
                    }
                    opc = sc.nextInt();
                    sc.nextLine();
                    if (opc >= 1 && opc <= redactors.get(indexRedactor).getNoticies().size()) {
                        valid = true;
                    } else {
                        System.out.println("Error. Has d'escollir un nombre vàlid.");
                    }
                } while (!valid);
                indexNoticia = opc - 1;
            }
        }
        return indexNoticia;
    }

    public static void calcularPuntuacioNoticia() {
        int indexRedactor = trobarRedactor();
        int indexNoticia = trobarNoticia(indexRedactor);

        if (indexNoticia != -1) {
            int punts = redactors.get(indexRedactor).getNoticies().get(indexNoticia).getPuntuacio();
            System.out.println("La puntuació d'aquesta notícia és de " + punts + " punts.");
        }
    }

    public static void calcularPreuNoticia() {
        int indexRedactor = trobarRedactor();
        int indexNoticia = trobarNoticia(indexRedactor);

        if (indexNoticia != -1) {
            float preu = redactors.get(indexRedactor).getNoticies().get(indexNoticia).getPreu();
            System.out.println("El preu d'aquesta notícia és de " + preu + " €.");
        }
    }
}