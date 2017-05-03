package utilities;

import java.util.Random;

import support.CharacterBase;
import support.ItemBase;
import support.TrapBase;

public class DescriptionGenerator {

	private String description;

	public DescriptionGenerator() {
		description = null;
	}

	public String generateDescription(ItemBase item, TrapBase trap, CharacterBase monster){
			
		Random rand = new Random();
		
		switch(rand.nextInt(4)){
		case 1: description = "You've entered what seems to be a library. Shelves upon shelves adorn the walls with books as far as the eye can see.";
			break;
		case 2: description = "You've entered a cavernous room. Mold paints the walls and a foul stench permeates the room.";
			break;
		case 3: description = "You've entered a magic room. Its so full of magic.";
			break;
		case 4: description = "You've entered a ball room. Its so full of balls.";
			break;
			default:
		}
		
		if(item!=null){
			description += "There is a "+item.getName()+" sitting in the middle of the room.";	
		};
		
		if(trap!=null){
			description += "There is a "+monster.getName()+" standing in the middle of the room.";
		}; 
		
		if(monster!=null){
			description += "You notice a "+trap.getName()+" is blocking your path forward.";
		};
		return description;
	}
}
