package SPRINT1_TEST.Tasca4_Testing.Nivell3.Exercici4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestAssertJ4 {
    @Test
    public void testArrayListOrdenat() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("日本語");
        arrayList.add(2);
        arrayList.add('東');
        arrayList.add(2.2);

        Assertions.assertThat(arrayList).containsExactly("日本語", 2, '東', 2.2);
    }

    @Test
    public void testArrayListConte() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("日本語");
        arrayList.add(2);
        arrayList.add('東');
        arrayList.add(2.2);

        Assertions.assertThat(arrayList).contains("日本語", 2, '東', 2.2);
    }

    @Test
    public void testArrayListFrequenciaNoConte() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("日本語");
        arrayList.add(2);
        arrayList.add('東');

        Assertions.assertThat(Collections.frequency(arrayList, "日本語")).isEqualTo(1);
        Assertions.assertThat(arrayList).doesNotContain(2.2);
    }
}
