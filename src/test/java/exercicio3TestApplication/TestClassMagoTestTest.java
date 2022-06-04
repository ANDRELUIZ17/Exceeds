package exercicio3TestApplication;

import br.comgft.mainprincipal.Exercicio3.Guerreiro;
import br.comgft.mainprincipal.Exercicio3.Mago;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TestClassMagoTestTest {
    Mago mago = new Mago();
    @BeforeAll
    static void setup() {
        System.out.println("Executando metodo @BeforeAll.");
    }
    @BeforeEach
    void beforeEachTestMetodo() {
        System.out.println("Executando o método @BeforeEach");
    }
    @Test
    void testNomePesonagem() {
        String nome = "Tarzan";
        assertEquals("Tarzan", mago.setNome("Tarzan").getNome());
    }
    @Test
    void tesVidaPesonagem() {
        int vida = 100;
        assertEquals(100, mago.setVida(100).getVida());
    }
    @Test
    void testAtaquePesonagem() {
        Random numeroRandomico = new Random();
        int forca = numeroRandomico.nextInt(100);
        for (int i = 0; i > forca; i++) {
            mago.setForca(forca);
            assertEquals(forca, mago.getInteligencia());
            assertEquals(12, mago.getMagias());
        }
    }
    @Test
    void TestNivelPesonagem() {
        int level = 1;
        assertEquals(1, mago.setLevel(1).getLevel());
    }
}