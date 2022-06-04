package br.comgft.mainprincipal.Exercicio5;

public class Pessoas2 {
    private String nome;
    private int idade;

    public Pessoas2() {
    }

    public Pessoas2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Pessoas2 setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoas2 setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade;
    }
}

