package items;

import support.ItemBase;
import support.CharacterBase;

public class potion extends ItemBase {
	
	public potion() {
		super("potion", "this is a potion!");
	}

	@Override
	public CharacterBase action(CharacterBase character) {
		character.healCharacter(50);
		if(character.getTotalHealth()<character.getCurrentHealth()){
			character.setCurrentHealth(character.getTotalHealth());
		}
		return character;
	}
}
