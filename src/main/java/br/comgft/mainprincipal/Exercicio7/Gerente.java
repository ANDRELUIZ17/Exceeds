package br.comgft.mainprincipal.Exercicio7;

public class Gerente extends Funcionario {
    private double gratificacao;

    public Gerente() {
    }

    public Gerente(String nome, int idade, double salario, double gratificacao) {
        super(nome, idade, salario);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public Gerente setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
        return this;
    }

    @Override
    public double bonificacao() {
        return this.getSalario() + this.getGratificacao();
    }
}

