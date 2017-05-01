package mainCharacter;

import java.io.Serializable;
import java.util.ArrayList;

import exceptions.ItemMissingException;
import items.BaseItem;
import support.CharacterBase;

public class MainCharacter extends CharacterBase implements Serializable {

	private static final long serialVersionUID = -9214972243707344043L;
	
	private ArrayList<BaseItem> inventory; 
	
	public MainCharacter(String name, double health){
		super(name,health);
		inventory = new ArrayList<BaseItem>();
	}
	
	public BaseItem addToInventory(BaseItem item){
		inventory.add(item);
		return item;
	}
	
	public BaseItem removeFromInventory(BaseItem item){
		inventory.remove(item);
		return item;
	}
	
	public BaseItem getFromInventory(BaseItem item){
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
	
	public ArrayList<BaseItem> getInventory(){
		return inventory;
	}
	
	public void displayInventory(){
		for(int i=0;i<inventory.size();i++){
			System.out.println(inventory.get(i));
		}
	}
	
}
