package br.comgft.mainprincipal.exercicio6;

public class Pessoas3 {
    private String nome;
    private int idade;

    public Pessoas3() {
    }

    public Pessoas3(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Pessoas3 setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoas3 setIdade(int idade) {
        this.idade = idade;
        return this;
    }
}
