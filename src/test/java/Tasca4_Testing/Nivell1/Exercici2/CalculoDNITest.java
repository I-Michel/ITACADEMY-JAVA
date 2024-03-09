package Tasca4_Testing.Nivell1.Exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDNITest {

    /* DNIs utilitzats com a prova:
    * 49644234E, 55894258A, 90876554N, 85546798T, 53868498Z
    * 91970697E, 71610962W, 20096197Q, 52794949J, 38380972K */

    @ParameterizedTest
    @CsvSource(value = {"49644234:E", "55894258:A", "90876554:N", "85546798:T", "53868498:Z",
                        "91970697:E", "71610962:W", "20096197:Q", "52794949:J", "38380972:K"},
                        delimiter = ':')
    @DisplayName("Comprovem si calcula correctament la lletra de 10 DNI predefinits.")
    public void calcularLletraTest(int num, char lletraEsperada) {

        CalculoDNI dni = new CalculoDNI(num);
        Assertions.assertEquals(lletraEsperada, dni.calcularLletra());

    }

    @ParameterizedTest
    @CsvSource(value = {"49644234:X", "55894258:X", "90876554:X", "85546798:X", "53868498:X",
                        "91970697:X", "71610962:X", "20096197:X", "52794949:X", "38380972:X"},
                        delimiter = ':')
    @DisplayName("Comprovem forma invertida canviant totes les lletres per X fent 10 DNI erronis.")
    public void calcularLletraTestError(int num, char lletraIncorrecta) {
        CalculoDNI dni = new CalculoDNI(num);
        Assertions.assertNotEquals(lletraIncorrecta, dni.calcularLletra());
    }

}