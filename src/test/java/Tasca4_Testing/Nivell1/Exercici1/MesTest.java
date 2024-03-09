package Tasca4_Testing.Nivell1.Exercici1;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

class MesTest {

    private ArrayList<Mes> mesosTest;

    @BeforeEach
    public void setUp() {
        mesosTest = new ArrayList<Mes>();
        Mes.generarLlistaMesos(mesosTest);
    }

    @DisplayName("Comprovem si l'ArrayList mesos té 12 posicions.")
    @Test
    public void teDotzePosicions() {
       Assertions.assertEquals(12, mesosTest.size());
    }

    @DisplayName("Comprovem que l'ArrayList mesos NO sigui Null.")
    @Test
    public void noEsNull() {
        Assertions.assertNotNull(mesosTest);
    }

    @DisplayName("Comprovem que el mes 8 de l'ArrayList sigui agost.")
    @Test
    public void posicioAgost() {
        Assertions.assertEquals("agost", mesosTest.get(7).getNom());
        // Poso posició 7 perquè com l'ArrayList comença per 0, la posició real d'agost es el 7
    }

}