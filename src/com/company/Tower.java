package com.company;

import java.util.ArrayList;

public class Tower {
    Invader invader;
    private int range=4;
    private int power=1;
    private double accuracy=.75;
    private MapLocation location;
    public boolean isSuccesfulShot(){
        return Math.random()<accuracy;
    }

    public Tower(MapLocation mapl){
        this.location=mapl;
    }
    public void fireOnInvaders(ArrayList<Invader> invaders){

       for(Invader invader :invaders){

           if(invader.isActive()&&location.inRangeOf(invader.getLocation(),range)){
                if(isSuccesfulShot()){
                    invader.decreaseHealth(power);
                    System.out.println("Shot at and hit an invader");
                    if(invader.isNeutralized()) {
                        System.out.println("Neutralized an invader");
                    }
                }
                else {
                    System.out.println("The invader was missed!");
                }
                break;
           }else{
               ;
           }
       }
    }
}
