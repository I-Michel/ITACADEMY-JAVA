package Tasca4_Testing.Nivell3.Exercici2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAssertJ2 {
    @Test
    public void testReferenciaIgual() {
        Object obj1 = new Object();
        Object obj2 = obj1;

        Assertions.assertThat(obj1).isEqualTo(obj2);
    }

    @Test
    public void testReferenciaDesigual() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Assertions.assertThat(obj1).isNotEqualTo(obj2);
    }
}
