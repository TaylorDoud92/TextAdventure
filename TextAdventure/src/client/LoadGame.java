package client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import mainCharacter.MainCharacter;
import world.World;

public class LoadGame {

	//Attributes
	private final String SERIAL_FILE = "res/save.ser";
	private ObjectInputStream ois;
	private World world;
	private MainCharacter mainCharacter;
	
	/**
	 * Constructor called to load the game.
	 * 
	 * Precondition: A game be saved in a save.ser file in the res folder.
	 * 
	 * Postcondition: A game is loaded from the save.ser file and the MainCharacter and World objects are instantiated.
	 * 
	 */
	public LoadGame()
	{
		try
		{
			ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE));
			mainCharacter = (MainCharacter) ois.readObject();
			world = (World) ois.readObject();
			ois.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public World getWorld()
	{
		return world;
	}
	
	public MainCharacter getMainCharacter()
	{
		return mainCharacter;
	}
}
