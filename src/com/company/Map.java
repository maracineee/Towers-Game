package com.company;
import com.company.Point.*;
public class Map {
    private int width;
    private int height;

    public void setWidth(int width){
        this.width=width;

    }
    public void setHeight(int height){
        this.height=height;

    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public Map(int w, int h){
        this.height=h;
        this.width=w;
    }
    public boolean onMap(Point p){

        return  p.getX()>=0&&p.getX()<width&&
                p.getY()>=0&&p.getY()<height;
    }
    }

