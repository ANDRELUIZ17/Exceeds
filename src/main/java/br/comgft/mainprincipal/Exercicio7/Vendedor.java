package br.comgft.mainprincipal.Exercicio7;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(String nome, int idade, double salario, double comissao) {
        super(nome, idade, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public Vendedor setComissao(double comissao) {
        this.comissao = comissao;
        return this;
    }

    @Override
    public double bonificacao() {
        return this.getSalario() + this.getComissao();
    }
}

