package Tasca4_Testing.Nivell1.Exercici3;

import Sprint1.Tasca4_Testing.Nivell1.Exercici3.MainT4_N1_Ex3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainT4_N1_Ex3Test {

    @Test
    @DisplayName("Comprovem si es llança l'excepció.")
    public void llancemExceptionTest() {

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, MainT4_N1_Ex3::llancemException);

    }
}