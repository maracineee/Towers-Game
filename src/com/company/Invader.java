package com.company;

public class Invader {
    private Path path;
    private int pathStep=0;
    private MapLocation location;
    private int health;
    public boolean isNeutralized(){
        return this.health<=0;
    }
    public boolean hasScored(){
        return pathStep>=path.getLength();
    }

    public MapLocation getLocation(){
        return path.getLocationAt(pathStep);
    }
    public void Move(){
        this.pathStep++;

    }

    public boolean isActive(){
        return !(!isNeutralized()||hasScored());
    }

    public Invader(Path path){
        this.path=path;
    }

    public void decreaseHealth(int damage){
        this.health=this.health-damage;
    }


    public void setPath(Path path){
        this.path=path;
    }
    public Path getPath(){
        return this.path;
    }




    public void setLocation(MapLocation mapl){
        this.location=mapl;
    }

    public void setHealth(int health){
        this.health=health;
    }

    public int getHealth(){
        return  this.health;
    }






}
