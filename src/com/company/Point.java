package com.company;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
     public int distanceTo(int x, int y){


        return  (int)Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));

     }

     public int distanceTo(Point z){
        return  this.distanceTo(z.getX(),z.getX());
     }

}
