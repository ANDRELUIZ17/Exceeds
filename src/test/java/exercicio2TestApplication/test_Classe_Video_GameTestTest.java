package exercicio2TestApplication;

import br.comgft.mainprincipal.Exercicio2.VideoGame;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class test_Classe_Video_GameTestTest {
    VideoGame videoGame = new VideoGame();

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
        System.out.println("Teste Finalizado");
    }
    @Test
    void testarNomeVideGame(){

        String nome = "PS4";
        videoGame.setNome(nome);
        assertEquals(nome, videoGame.getNome());
    }
    @Test
    void testarPrecoVideoGame(){
        double preco = 1800.0;
        videoGame.setPreco(preco);
        assertEquals(preco, videoGame.getPreco());
    }
    @Test
    void  testQuantidadeVideoGame(){
        int quantidade = 40;
        videoGame.setQuantidade(quantidade);
        assertEquals(quantidade, videoGame.getQuantidade());
    }
    @Test
    void testarMarcaVideGame(){

        String marca = "SONY";
        videoGame.setMarca(marca);
        assertEquals(marca, videoGame.getMarca());
    }

    @Test
    void testarModeloVideoGame(){
        String modelo = "PS4";
        videoGame.setModelo(modelo);
        assertEquals(modelo, videoGame.getModelo());
    }
    @Test
    void testIsligadoVideoGame(){
        boolean isLigado = false;
        videoGame.setLigado(isLigado);
        assertFalse(isLigado);
    }

}