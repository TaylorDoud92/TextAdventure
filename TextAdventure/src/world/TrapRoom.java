package world;

import java.util.Random;

import mainCharacter.MainCharacter;
import support.RoomBase;
import support.CharacterBase;

public class TrapRoom extends RoomBase 
{

	private String description;
	
	public TrapRoom(String name, String description, boolean southDoor, boolean northDoor, boolean westDoor,
			Boolean eastDoor) {
		super(name, description, southDoor, northDoor, westDoor, eastDoor);
	}

	public MainCharacter activate(boolean activated, MainCharacter player){
		if(activated == true){
			Random rand = new Random();
			player.damageCharacter(rand.nextInt(50));	
		}
		return player;
	}
}
