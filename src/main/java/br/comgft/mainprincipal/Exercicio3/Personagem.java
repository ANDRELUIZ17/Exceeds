package br.comgft.mainprincipal.Exercicio3;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private Float xp;
    private int inteligencia;
    private int forca;
    private int level;

    public Personagem(String nome, int vida, int mana, Float xp, int inteligencia, int forca, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
    }

    public Personagem() {

    }

    public String getNome() {
        return nome;
    }

    public Personagem setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getVida() {
        return vida;
    }

    public Personagem setVida(int vida) {
        this.vida = vida;
        return this;
    }

    public int getMana() {
        return mana;
    }

    public Personagem setMana(int mana) {
        this.mana = mana;
        return this;
    }

    public Float getXp() {
        return xp;
    }

    public Personagem setXp(Float xp) {
        this.xp = xp;
        return this;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public Personagem setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }

    public int getForca() {
        return forca;
    }

    public Personagem setForca(int forca) {
        this.forca = forca;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Personagem setLevel(int level) {
        this.level = level;
        return this;
    }
    public void lvlUp(){

    }
}
