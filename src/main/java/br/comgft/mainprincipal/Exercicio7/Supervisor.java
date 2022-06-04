package br.comgft.mainprincipal.Exercicio7;

public class Supervisor extends Funcionario {
    private double bonus;

    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public Supervisor setBonus(double bonus) {
        this.bonus = bonus;
        return this;
    }

    @Override
    public double bonificacao() {
        return this.getSalario() + this.getBonus();
    }
}

