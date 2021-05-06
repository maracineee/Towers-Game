package com.company;
import com.company.Map.*;
public class MapLocation extends Point {

    public MapLocation(int a, int b, Map map) throws OutOfBoundsException {

        super(a,b);
        try {
            if (!map.onMap(this)) {

                throw new OutOfBoundsException(this.getX() + "," + this.getY() + " is outside the bounderies of the map");
            }
        }
        catch(OutOfBoundsException x){

            System.out.println("Andrei invata programare");

        }

    }

    public  boolean inRangeOf(MapLocation location,int range){
        return distanceTo(location)<=range;
    }

}
