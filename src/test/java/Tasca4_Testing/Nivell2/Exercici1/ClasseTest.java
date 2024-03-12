package Tasca4_Testing.Nivell2.Exercici1;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

public class ClasseTest {
    @Test // Aquest test sortirà bé.
    public void testLongitudString6() {
        MatcherPersonalitzat matcher6 = new MatcherPersonalitzat(is(6));
        MatcherAssert.assertThat("Mordor", matcher6);
    }

    @Test // Aquest test donarà error.
    public void testLongitudString8() {
        MatcherPersonalitzat matcher8 = new MatcherPersonalitzat(is(8));
        MatcherAssert.assertThat("Mordor", matcher8);
    }
}                                                                                  