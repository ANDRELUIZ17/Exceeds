package br.comgft.mainprincipal.Exercicio2;

import java.util.Objects;
public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isLigado;

    public VideoGame(String nome, Double preco, Integer quantidade, String marca, String modelo, boolean isLigado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isLigado = isLigado;
    }

    public VideoGame() {

    }

    public String getMarca() {
        return marca;
    }

    public VideoGame setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public VideoGame setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public VideoGame setLigado(boolean ligado) {
        isLigado = ligado;
        return this;
    }

    @Override
    public double calcularImposto() {
         if (Objects.equals(getModelo(), "Usado")) {
                return getPreco() + calcularImposto() * 0.25;
          }
          else {
                return getPreco() * 0.45;
          }
    }
}
