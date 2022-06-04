package br.comgft.mainprincipal.Exercicio4;

public class Pessoas {
    private String nome;
    private int idade;

        public Pessoas() {
        }

        public Pessoas(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public Pessoas setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public int getIdade() {
            return idade;
        }

        public Pessoas setIdade(int idade) {
            this.idade = idade;
            return this;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + " Idade: " + idade;
        }
}
