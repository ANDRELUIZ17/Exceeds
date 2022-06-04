package exercicio4TestApplication;

import br.comgft.mainprincipal.Exercicio4.Pessoas;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TestApplicationClassePessoaTest {
    Pessoas pessoas = new Pessoas();

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
        Pessoas pessoas = new Pessoas();
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