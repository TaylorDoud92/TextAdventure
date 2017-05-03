package world;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import support.RoomBase;

public class World implements Serializable{

	private static final long serialVersionUID = 252160056106244943L;
	
	RoomBase[][] horizontalRoomList;
	RoomBase[] verticalRoomList;
	
	
	public World()
	{
		
	}

	public void generateWorld(){
		Random rng = new Random();
		int randNumber = rng.nextInt(10);
		
		horizontalRoomList = new RoomBase[randNumber][];
		
		for(int i=0;i<randNumber;i++){
			verticalRoomList = new RoomBase[randNumber];
		
			
			
			
			horizontalRoomList[i] = verticalRoomList;
		}
		
	}
	
}
