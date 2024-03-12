package Tasca4_Testing.Nivell3.Exercici3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAssertJ3 {
    @Test
    public void testArraysIguals() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        Assertions.assertThat(array1).isEqualTo(array2);
    }
}
