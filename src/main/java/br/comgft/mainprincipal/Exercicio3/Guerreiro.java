package br.comgft.mainprincipal.Exercicio3;

import br.comgft.mainprincipal.Exercicio4.Pessoas;

import java.util.List;

import static br.comgft.mainprincipal.Exercicio3.Mago.numeroRandomico;

public class Guerreiro extends Personagem{
    private List<String> habilidades;
    public Guerreiro(String nome, int vida, int mana, Float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public Guerreiro() {
        super();
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public Guerreiro setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
        return this;
    }
    @Override
    public void lvlUp() {
        setVida(getVida() + 1);
        setForca(getForca() + 1);
        super.lvlUp();
    }
    public String attack() {
        setForca(getForca()/ 2 * (getForca() * getLevel()) + numeroRandomico.nextInt(180));

        habilidades.add(" Força: " + getForca() + " Level: " + getLevel());
        return "Inteligencia: " + getHabilidades() + " Level: " + getLevel();
    }
    public String aprenderHabilidade(String habilidade) {
        System.out.println("Habilidades");
        if (getMana() <= 1) {
            setMana(getMana() - habilidade.length());
            setInteligencia(getInteligencia() + habilidade.length());
            System.out.println(habilidade);
        }
        return "Mana: " + getMana() + " Inteligencia: " + getInteligencia();
    }

    public int getAtaque() {
        return getForca()/ 2 * (getForca() * getLevel()) + numeroRandomico.nextInt(180);
    }

    public void setAtaque(int i) {
    }

    public void setDefesa(int i) {
    }

    public void setArma(String espada) {
    }

    public void setArmadura(String armadura) {
    }

    public int ataque() {
        return getAtaque();
    }

    public String getNomePesonagem() {
        return getNome();
    }

}
