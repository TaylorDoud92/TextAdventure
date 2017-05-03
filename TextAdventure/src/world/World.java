package world;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import support.BaseRoom;

public class World implements Serializable{

	private static final long serialVersionUID = 252160056106244943L;
	
	BaseRoom[][] horizontalRoomList;
	BaseRoom[] verticalRoomList;
	
	
	public World()
	{
		
	}

	public void generateWorld(){
		Random rng = new Random();
		int randNumber = rng.nextInt(10);
		
		horizontalRoomList = new BaseRoom[randNumber][];
		
		for(int i=0;i<randNumber;i++){
			verticalRoomList = new BaseRoom[randNumber];
		
			
			
			
			horizontalRoomList[i] = verticalRoomList;
		}
		
	}
	
}
