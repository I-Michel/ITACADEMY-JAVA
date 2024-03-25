package SPRINT1.Tasca6_Generics.Nivell3.Exercici1;

public class Generic {

    public static <T extends Phone> void genericPhone(T phone) {
        phone.call();
        // The takePictures() method cannot be invoked from here.
    }

    public static <T extends Smartphone> void genericSmartphone(T smartphone) {
        smartphone.call();
        smartphone.takePictures();
    }
}
