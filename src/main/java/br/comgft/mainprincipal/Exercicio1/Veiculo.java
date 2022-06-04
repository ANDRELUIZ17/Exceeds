package br.comgft.mainprincipal.Exercicio1;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private Float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;

    public Veiculo(String marca, String modelo, String placa, String cor, Float km,
                   boolean isLigado, int litrosCombustivel, int velocidade, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public Veiculo setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getPlaca() {
        return placa;
    }

    public Veiculo setPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Veiculo setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public Float getKm() {
        return km;
    }

    public Veiculo setKm(Float km) {
        this.km = km;
        return this;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public Veiculo setLigado(boolean ligado) {
        isLigado = ligado;
        return this;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public Veiculo setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
        return this;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Veiculo setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        return this;
    }

    public Double getPreco() {
        return preco;
    }

    public Veiculo setPreco(Double preco) {
        this.preco = preco;
        return this;
    }

    public void acelerar() {
        this.velocidade += 20;
    }
    public void abastecer(int combustivel) {
        if (combustivel > 60) {
            System.out.println("Utrapassou a capacidade do tanque! ");
        }
        this.litrosCombustivel = combustivel;
    }
    public void frear() {
        if (velocidade == 0) {
            System.out.println("O veículo está parado! ");
        }
        this.velocidade -= 20;
    }
    public void pintar (String cor) {
        this.cor = cor;
    }
    public void ligar() {
        if (isLigado){
            System.out.println("Veiculo ligado! ");
        }
        else if (isLigado) {
            System.out.println("Desligado! ");
        }
        else {
            this.isLigado = true;
        }
    }
    public void desligar() {
        if (isLigado == false && velocidade == 0) {
            System.out.println("Pode desligar! ");
            this.isLigado = false;
        }
        else if (isLigado == false && velocidade > 0) {
            System.out.println("Veiculo esta ligado, não pode desligar! ");
            this.isLigado = true;
        }
    }
}
