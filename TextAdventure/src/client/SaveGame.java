package client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import mainCharacter.MainCharacter;
import world.World;

public class SaveGame {

	
	private final String SERIAL_FILE = "res/save.ser";
	private ObjectOutputStream oos;
	
	public SaveGame(MainCharacter mainCharacter, World world)
	{
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE));
			oos.writeObject(mainCharacter);
			oos.writeObject(world);
			oos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
