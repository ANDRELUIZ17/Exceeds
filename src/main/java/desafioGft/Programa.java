package desafioGft;

import java.util.Map;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContadorDeNotas contador = new ContadorDeNotas();
        int valor = 0;
        try {
            System.out.println("Qual o valor do saque?");
            valor = sc.nextInt();

        } catch (SaldoInsulficienteException e) {
            System.out.println("Saldo insulficiente");
        }

        double soma = 0;
        for (Map.Entry<Integer, Integer> nota : contador.getNotas(valor).entrySet()) {
            soma += nota.getKey() * nota.getValue();
            System.out.println("Resultado Esperado: " +  "Entregar 1 nota de  R$"+ nota.getKey() + " : " + nota.getValue());
            System.out.println("Total valor: " + soma + " reais");


        }
    }

}
