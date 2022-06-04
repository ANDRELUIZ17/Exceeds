package desafioGft;

public final class CaixaEletronico {

    private int saldoAtual;

    public CaixaEletronico(final int saldoInicial) {
        this.saldoAtual = saldoInicial;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void saque(final int valor) throws SaldoInsulficienteException {
        if (valor > saldoAtual) {
            throw new SaldoInsulficienteException();
        }
        saldoAtual -= valor;
    }
}
