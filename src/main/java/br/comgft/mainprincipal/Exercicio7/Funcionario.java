package br.comgft.mainprincipal.Exercicio7;

public class Funcionario {
    private String nome;
    private Integer idade;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdade() {
        return idade;
    }

    public Funcionario setIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public Double getSalario() {
        return salario;
    }

    public Funcionario setSalario(Double salario) {
        this.salario = salario;
        return this;
    }

    public double bonificacao(){
        return this.salario * 0.10;
    }
}
