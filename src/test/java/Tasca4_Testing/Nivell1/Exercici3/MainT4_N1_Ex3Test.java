package Tasca4_Testing.Nivell1.Exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Tasca4_Testing.Nivell1.Exercici3.MainT4_N1_Ex3.llancemException;
import static org.junit.jupiter.api.Assertions.*;

class MainT4_N1_Ex3Test {

    @Test
    @DisplayName("Comprovem si es llança l'excepció.")
    public void llancemExceptionTest() {

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, MainT4_N1_Ex3::llancemException);

    }
}