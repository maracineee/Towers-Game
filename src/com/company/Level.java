package com.company;

import java.util.ArrayList;

public class Level {
    private ArrayList<Invader> invaders;
    private ArrayList<Tower> towers;

    public Level(ArrayList<Invader> inv, ArrayList<Tower> tow){
        this.invaders=inv;
        this.towers=tow;
    }
    public boolean Play() {

        int remainingInvaders = invaders.size();

        while (remainingInvaders > 0) {
            for (Tower tower : towers) {
                tower.fireOnInvaders(invaders);
            }


            remainingInvaders = 0;
            for (Invader invader : invaders) {
                if (invader.isActive()) {
                    invader.Move();
                    if (invader.hasScored()) {
                        return false;
                    }

                    remainingInvaders++;
                }
            }
        }

        return true;

    }

}
