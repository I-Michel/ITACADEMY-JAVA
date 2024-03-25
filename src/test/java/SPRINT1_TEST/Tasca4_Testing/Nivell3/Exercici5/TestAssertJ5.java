package SPRINT1_TEST.Tasca4_Testing.Nivell3.Exercici5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestAssertJ5 {
    @Test
    public void testMapa() {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Hola!", "こんにちは!");
        mapa.put("Adeu!", "さようなら!");
        mapa.put("Com estàs?", "お元気ですか。");
        mapa.put("Moltes gràcies!", "どうもありがとうございます。");

        Assertions.assertThat(mapa).containsKey("Com estàs?");
    }
}
