package com.mycompany.project;

/**
 *
 * @author jayja
 */
public abstract class Character {

    //Variables and Attributes all character have
    public String name;
    public int maxHP, hp, xp;

    //constructor for character
    public Character(String name, int maxHP, int xp) {
        this.name = name;
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.xp = xp;
    }

    //methods every character has 
    public abstract int attack();
    public abstract int defend();

}//end Character