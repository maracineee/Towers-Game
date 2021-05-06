package com.company;

import java.util.ArrayList;

public class Path {
   private ArrayList<MapLocation> path;
   private int length;
   public int getLength(){
       return this.length;
   }
    public Path(ArrayList<MapLocation> pathh){
        this.path=pathh;
        length=this.path.size();
    }
    public MapLocation getLocationAt(int x){
            return path.get(x);



    }
}
