package Tasca4_Testing.Nivell3.Exercici6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAssertJ6 {

    @Test
    public void testExcepcio() {
        Assertions.assertThatThrownBy(Prova::provocarExcepcio).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
