package Tasca4_Testing.Nivell3.Exercici1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class TestAssertJ1 {
    @Test
    public void testIntIguals() {
        Integer a = 2;
        Integer b = 2;
       Assertions.assertThat(a).isEqualTo(b);
    }

    @Test
    public void testIntDesiguals() {
        Integer a = 2;
        Integer b = 4;
        Assertions.assertThat(a).isNotEqualTo(b);
    }
}
