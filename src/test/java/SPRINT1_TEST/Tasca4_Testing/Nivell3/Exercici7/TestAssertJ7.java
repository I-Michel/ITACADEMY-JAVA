package SPRINT1_TEST.Tasca4_Testing.Nivell3.Exercici7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Optional;

public class TestAssertJ7 {

    @Test
    public void testOptional() {
        Optional<String> optionalBuit = Optional.empty();

        Assertions.assertThat(optionalBuit).isEmpty();
    }
}
