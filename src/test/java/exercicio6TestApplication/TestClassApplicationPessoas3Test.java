package exercicio6TestApplication;

import br.comgft.mainprincipal.Exercicio5.Pessoas2;
import br.comgft.mainprincipal.exercicio6.Pessoas3;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestClassApplicationPessoas3Test {
    Pessoas3 pessoas = new Pessoas3();


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