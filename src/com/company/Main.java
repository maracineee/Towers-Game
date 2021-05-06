package com.company;

import java.util.ArrayList;

public class Main {
	/**
	 *
	 * @param args
	 * @throws OutOfBoundsException
	 */
    public static void main(String[] args) throws OutOfBoundsException {
    Map map=new Map(8,8);
	MapLocation mapl1=new MapLocation(1,3,map);
	MapLocation mapl2=new MapLocation(2,2,map);
	MapLocation mapl3=new MapLocation(3,3,map);
	MapLocation mapl4=new MapLocation(4,2,map);
	ArrayList<MapLocation> mapls=new ArrayList<>();
	mapls.add(mapl1);
	mapls.add(mapl2);
	mapls.add(mapl3);
	mapls.add(mapl4);

	Path path=new Path(mapls);
	Invader invader1=new Invader(path);
	Invader invader2=new Invader(path);
	Invader invader3=new Invader(path);
	ArrayList<Invader> invaders=new ArrayList<>();
	invaders.add(invader1);
	invaders.add(invader2);
	invaders.add(invader3);
	MapLocation maplt1=new MapLocation(2,3,map);
	MapLocation maplt2=new MapLocation(3,2,map);
	MapLocation maplt3=new MapLocation(4,3,map);
	Tower tower1=new Tower(maplt1);
	Tower tower2=new Tower(maplt2);
	Tower tower3=new Tower(maplt3);
	ArrayList<Tower> towers=new ArrayList<>();
	towers.add(tower1);
	towers.add(tower2);
	towers.add(tower3);
	Level level1=new Level(invaders,towers);
		System.out.println(level1.Play());





	}
}
