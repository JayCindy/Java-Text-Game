package com.mycompany.project;

import static com.mycompany.project.Plotline.readInt;

/**
 *
 * @author jayja
 */
public class Player extends Character {

    public String[] weaponChoice = {"Oscar P Duck Call", "Horn of Helm Hammerhand", "Glowing Elvish Sword", "Spit-ball Shooter"};

    int toiletPaper, naps, kits;
    int healthFirstAidChance;//percentage
//player specific constructor

    public Player(String name) {
        super(name, 200, 0);
        this.toiletPaper = 7;
        this.naps = 2;
        this.kits = 0;
        this.healthFirstAidChance = 50;
        chooseWeapon();
    }

    @Override
    public int attack() {
        if (xp > 0) {
            return (int) (Math.random() * (xp / 3 + 2) + 2);
        }
        if (xp <= 0) {
            return (int) (Math.random() * (xp / 3 + 2));
        }
        return 0;
    }//end attack

    @Override
    public int defend() {
        if (xp > 0) {
            return (int) (Math.random() * (xp / 3 + 2) + 5);
        }
        if (xp <= 0) {
            return (int) (Math.random() * (xp / 3 + 5));
        }
        return 0;
    }//end defend

    public final void chooseWeapon() {
        Plotline.whiteSpace();
        System.out.println("Choose a weapon");
        System.out.println(">1 " + weaponChoice[0]);
        System.out.println(">2 " + weaponChoice[1]);
        System.out.println(">3 " + weaponChoice[2]);
        System.out.println(">4 " + weaponChoice[3]);
        int input = readInt("->", 4);
        switch (input) {
            case 1: {
                System.out.println("You have chosen the Oscar P Duck Call");
                break;
            }
            case 2: {
                System.out.println("You have chosen the Horn of Helm Hammerhand");
                break;
            }
            case 3: {
                System.out.println("You have chosen the Glowing Elvish Sword");
                break;
            }
            case 4: {
                System.out.println("You have chosen the Spit-ball Shooter");
                break;
            }
        }//end switch

        if (input < 1 || input > 4) {
            System.out.println("Invalid number. Please choose a number 1 - 4.\n");
        }//end switch
        Plotline.anything();
    }//end chooseWeapons        
}