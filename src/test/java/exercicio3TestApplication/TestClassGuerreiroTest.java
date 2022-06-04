package exercicio3TestApplication;

import br.comgft.mainprincipal.Exercicio3.Guerreiro;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TestClassGuerreiroTest {
    Guerreiro guerreiro = new Guerreiro();
    @BeforeAll
    static void setup() {
        System.out.println("Executando metodo @BeforeAll.");
    }
    @BeforeEach
    void beforeEachTestMetodo() {
        Guerreiro guerreiro = new Guerreiro();
        System.out.println("Executando o método @BeforeEach");
    }
    @Test
    void testNomePesonagem() {
        String nome = "Tarzan";
        assertEquals("Tarzan", guerreiro.setNome("Tarzan").getNome());
    }
    @Test
    void tesVidaPesonagem() {
        int vida = 100;
        assertEquals(100, guerreiro.setVida(100).getVida());
    }
    @Test
    void testAtaquePesonagem() {
        Random numeroRandomico = new Random();
        int forca = numeroRandomico.nextInt(100);
        for (int i = 0; i > forca; i++) {
            guerreiro.setForca(forca);
            assertEquals(forca, guerreiro.getForca());
            assertEquals(12, guerreiro.getAtaque());
        }
    }
    @Test
    void TestNivelPesonagem() {
        int level = 1;
        assertEquals(1, guerreiro.setLevel(1).getLevel());
    }

}