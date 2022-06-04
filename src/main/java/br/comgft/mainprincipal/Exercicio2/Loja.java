package br.comgft.mainprincipal.Exercicio2;


import java.util.List;


public class Loja  {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGame;

    public Loja(){
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGame = videoGame;
    }

    public String getNome() {
        return nome;
    }

    public Loja setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Loja setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Loja setLivros(List<Livro> livros) {
        this.livros = livros;
        return this;
    }

    public List<VideoGame> getVideoGame() {
        return videoGame;
    }

    public Loja setVideoGame(List<VideoGame> videoGame) {
        this.videoGame = videoGame;
        return this;
    }
    public void listaLivros() {
        if (!livros.isEmpty()) {
            System.out.println("A Loja Americas possui este livro para a venda!");
            for(Livro livro : livros) {
                System.out.println("Título: " + livro.getNome() + "\n" + "Preço: "
                        + livro.getPreco() + "\n" + "Quantidade: " + livro.getQuantidade());
            }

        }
        else {
            System.out.println("A loja não tem o livro no seu estoque. ");
        }
    }
    public void listaVideoGame() {
        if (!videoGame.isEmpty()) {
            System.out.println();
            System.out.println("A loja Americanas possui estes video games para venda: ");
            for (VideoGame videoGame : videoGame) {
                System.out.println("Nome: " + videoGame.getNome() + "\n" + "Preço: "   + videoGame.getPreco() + "\n"
                        + "Quantidade: " + videoGame.getQuantidade());
            }
        }
        else {
            System.out.println("A loja não tem video games no estoque. ");
        }
    }
    public double calcularPatrimonio () {
        double soma = 0;
        for (Livro livro : livros) {
            soma += livro.getPreco() * livro.getQuantidade();
        }
        for (VideoGame videoGame : videoGame) {
            soma += videoGame.getPreco() * videoGame.getQuantidade();
        }
        return soma;
    }

}

