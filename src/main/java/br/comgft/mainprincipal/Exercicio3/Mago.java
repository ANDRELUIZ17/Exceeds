package br.comgft.mainprincipal.Exercicio3;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
    private List<String> magias;
    public static final Random numeroRandomico = new Random();
    public Mago(String nome, int vida, int mana, Float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public Mago() {
        super();
    }

    public List<String> getMagias() {
        return magias;
    }

    public Mago setMagias(List<String> magias) {
        this.magias = magias;
        return this;
    }
    @Override
    public void lvlUp() {
        setMana(getMana() + 1);
        setInteligencia(getInteligencia() + 1);
        super.lvlUp();
    }
    public String attack() {
        setForca(getForca()/ 2 * (getInteligencia() * getLevel()) + numeroRandomico.nextInt(180));
        magias.add(" Inteligencia: " + getInteligencia() + " Level: " + getLevel());
        return "Inteligencia: " + getInteligencia() + " Level: " + getLevel() + " Forca: " + getForca();
    }
    public String aprenderMagia(String magia) {
        System.out.println("Magias");
        while (getMana() <= 1) {
            setMana(getMana() - magia.length());
            setInteligencia(getInteligencia() + magia.length());
            System.out.println(magia);
        }
        return "Mana: " + getMana() + " Inteligencia: " + getInteligencia();
    }
}
