package desafioGft;

import java.util.HashMap;
import java.util.Map;

public final class ContadorDeNotas {
    private static final Integer[] NOTAS = {100, 50, 20, 10, 5, 2, 1};
    public Map<Integer, Integer> getNotas(int valor) {
        final Map<Integer, Integer> notas = geraNotas(valor);

        return notas;
    }

    private Map<Integer, Integer> geraNotas(int valor) {
        final Map<Integer, Integer> notas = new HashMap<>();

        for (Integer nota : NOTAS) {
            while (valor > 0) {
                if (valor < nota) {
                    break;
                }

                Integer qtde = notas.get(nota);

                if (qtde == null) {
                    qtde = 0;
                }

                qtde++;

                notas.put(nota, qtde);

                valor -= nota;
            }
        }
        return notas;
    }

    }

