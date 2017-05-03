package mainCharacter;

import java.io.Serializable;
import java.util.ArrayList;

import exceptions.ItemMissingException;
import support.ItemBase;
import support.CharacterBase;

public class MainCharacter extends CharacterBase implements Serializable {

	private static final long serialVersionUID = -9214972243707344043L;
	
	private ArrayList<ItemBase> inventory; 
	
	public MainCharacter(String name, double health){
		super(name,health);
		inventory = new ArrayList<ItemBase>();
	}
	
	public ItemBase addToInventory(ItemBase item){
		inventory.add(item);
		return item;
	}
	
	public ItemBase removeFromInventory(ItemBase item){
		inventory.remove(item);
		return item;
	}
	
	public ItemBase getFromInventory(ItemBase item){
		int index = inventory.indexOf(item);
		if(index == -1){
			try {
				throw new ItemMissingException("That item isn't in the inventory");
			} catch (ItemMissingException e) {
				e.printStackTrace();
			}
		} else {
			return inventory.get(inventory.indexOf(item));
		}
		return null;
	}
	
	public ArrayList<ItemBase> getInventory(){
		return inventory;
	}
	
	public void displayInventory(){
		for(int i=0;i<inventory.size();i++){
			System.out.println(inventory.get(i));
		}
	}
	
}
