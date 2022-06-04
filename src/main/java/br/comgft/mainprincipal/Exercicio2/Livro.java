package br.comgft.mainprincipal.Exercicio2;


public class Livro extends Produto implements Imposto{
    private String autor;
    private String tema;
    private int quantidadeAPagar;

    public Livro(String nome, Double preco, Integer quantidade, String autor, String tema, int quantidadeAPagar) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.tema = tema;
        this.quantidadeAPagar = quantidadeAPagar;
    }

    public Livro() {

    }

    public String getAutor() {
        return autor;
    }

    public Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String getTema() {
        return tema;
    }

    public Livro setTema(String tema) {
        this.tema = tema;
        return this;
    }

    public int getQuantidadeAPagar() {
        return quantidadeAPagar;
    }

    public Livro setQuantidadeAPagar(int quantidadeAPagar) {
        this.quantidadeAPagar = quantidadeAPagar;
        return this;
    }

    @Override
    public double calcularImposto() {

            if (tema.equals("Educativo")) {
                return 0;
            }
            else {
            quantidadeAPagar = (int) (quantidadeAPagar + getPreco() * 0.1);
            return getPreco() * 0.1;
            }
    }
}
