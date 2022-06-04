package desafioGft;

import java.io.Serial;

public class SaldoInsulficienteException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public SaldoInsulficienteException() {
        super("Saldo insulficiente");
    }
}
