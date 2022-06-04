package exercicio2TestApplication;

import br.comgft.mainprincipal.Exercicio2.Produto;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class test_Classe_ProdutoTestTest {
    private Produto produto;

    @BeforeAll
    static void setUp(){
    }
    @AfterAll
    static void tearDown(){
    }
    @BeforeEach
    void setUpEach(){
        System.out.println("Teste Iniciado");
    }
    @AfterEach
    void tearDownEach(){
        System.out.println("Test Finalizado");
    }
    @Test
    void testPreco(){
        // não consegui testar quando a clase é abstrata
    }
}