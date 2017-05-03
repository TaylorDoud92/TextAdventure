package world;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import support.RoomBase;

public class World implements Serializable {

	private static final long serialVersionUID = 252160056106244943L;

	private RoomBase[][] RoomList;
	private final String starterDescription = "Welcome to the Caverns of Kanak, You've come seeking treasures most grand but all you'll find is death. Enter if you dare!";

	public World() {

	}

	public void generateWorld() {
		Random rng = new Random();
		int randNumber = rng.nextInt(10);

		RoomList = new RoomBase[rng.nextInt(10)][rng.nextInt(10)];

		StartRoom startroom = new StartRoom("Start Room", starterDescription, true, true, true, true);
		
		int startSeed1 = rng.nextInt(10);
		int startSeed2 = rng.nextInt(10);
		
		if(startSeed1 == 0 && startSeed2 == 0){
			startroom.setNorthDoor(false);
			startroom.setWestDoor(false);
		} else if(startSeed2 == 0){
			startroom.setWestDoor(false);
		} else if(startSeed1 == RoomList.length){
			startroom.setEastDoor(false);
		} else if(startSeed1 == RoomList.length && startSeed2 == RoomList.length){
			startroom.setEastDoor(false);
			startroom.setSouthDoor(false);
		}
		RoomList[startSeed1][startSeed2] = startroom;
	}

}
