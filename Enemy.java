package com.mycompany.project;

/**
 *
 * @author jayja
 */
public class Enemy extends Character {

    int playerXP;

    public Enemy(String name, int playerXP) {
        super(name, (int) (Math.random() * playerXP + playerXP / 2 + 5), (int) (Math.random() * (playerXP / 3 + 2) + 2));
        //assigning variable
        this.playerXP = playerXP;
    }

    //enemy specific attack and defend calculations
    @Override
    public int attack() {
        if (playerXP > 0) {
            return (int) (Math.random() * (playerXP / 3 + 2) + 2);
        }
        if (xp <= 0) {
            return (int) (Math.random() * (xp / 3 + 2));
        }
        return 0;
    }//end attack

    @Override
    public int defend() {
        if (playerXP > 0) {
            return (int) (Math.random() * (playerXP / 3 + 2) + 5);
        }
        if (xp <= 0) {
            return (int) (Math.random() * (xp / 3 + 5));
        }
        return 0;
    }//end defend
}//end Enemy