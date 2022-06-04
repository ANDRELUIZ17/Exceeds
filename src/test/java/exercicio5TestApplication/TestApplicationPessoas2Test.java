package exercicio5TestApplication;

import br.comgft.mainprincipal.Exercicio5.Pessoas2;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestApplicationPessoas2Test {
    Pessoas2 pessoas = new Pessoas2();

    @BeforeAll
    static void setup() {
        System.out.println("Executando metodo @BeforeAll.");
    }
    @AfterAll
    static void cleanup() {
        System.out.println("Executando o médoto @AfterALL.");
    }
    @BeforeEach
    void beforeEachTestMetodo() {
        Pessoas2 pessoas = new Pessoas2();
        System.out.println("Executando o método @BeforeEach");
    }
    @AfterEach
    void afterEachTestMethod(){
        System.out.println("Executando o método AfterEach");
    }
    @Test
    void testIdadePessoas() {
        int idade = pessoas.getIdade();
        String nome = pessoas.getNome();
        assertEquals(idade, 0);
        pessoas.setNome("João");
        assertEquals(nome, null);
        String nome2 = "João";
        assertEquals(nome2, "João");
    }
}