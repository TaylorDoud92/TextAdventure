package world;

import java.util.Random;

import mainCharacter.MainCharacter;
import support.BaseRoom;
import support.CharacterBase;

public class TrapRoom extends BaseRoom 
{

	private String description;
	
	public TrapRoom(String name, String description, boolean southDoor, boolean northDoor, boolean westDoor,
			Boolean eastDoor) {
		super(name, description, southDoor, northDoor, westDoor, eastDoor);
	}

	public void activate(boolean activated, MainCharacter player){
		if(activated == true){
			Random rand = new Random();
			player.damageCharacter(rand.nextInt(50));
			
			
		}
	}
}
