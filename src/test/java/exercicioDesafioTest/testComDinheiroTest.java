package exercicioDesafioTest;
import desafioGft.CaixaEletronico;
import desafioGft.SaldoInsulficienteException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class testComDinheiroTest {

    @BeforeAll
    static void setUpClass() {
    }
    @Test
    void testComDinheiro() {
        CaixaEletronico caixa = new CaixaEletronico(100);
        assertEquals(100d, caixa.getSaldoAtual(), 0.001);
    }

    @Test
    public void testDepoisDoSaque_SemDinheito() {
        CaixaEletronico caixa = new CaixaEletronico(100);
        caixa.saque(100);
        assertEquals(0d, caixa.getSaldoAtual(), 0.001);
    }

    @Test
    public void testDepoisDoSaque_ComDinheito() {
        CaixaEletronico caixa = new CaixaEletronico(250);
        caixa.saque(100);
        assertEquals(150d, caixa.getSaldoAtual(), 0.001);
    }
    @Test
    void testSaldoInsuficiente() {
        CaixaEletronico caixa = new CaixaEletronico(100);
        try {
            caixa.saque(200);
        } catch (SaldoInsulficienteException e) {
            assertEquals("Saldo insulficiente", e.getMessage());
        }
    }

}