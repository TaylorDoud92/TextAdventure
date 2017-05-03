package support;

import java.net.NoRouteToHostException;
import java.util.ArrayList;

public abstract class RoomBase {

	private String name;

	private String description;

	private ArrayList<ItemBase> itemsInRoom;

	private boolean southDoor, northDoor, eastDoor, westDoor;

	public RoomBase(String name, String description, boolean southDoor, boolean northDoor, boolean westDoor,
			Boolean eastDoor) {
		this.name = name;
		this.description = description;
		this.northDoor = northDoor;
		this.southDoor = southDoor;
		this.eastDoor = eastDoor;
		this.westDoor = westDoor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<ItemBase> getItemsInRoom() {
		return itemsInRoom;
	}

	public void setItemsInRoom(ArrayList<ItemBase> itemsInRoom) {
		this.itemsInRoom = itemsInRoom;
	}

	public boolean isSouthDoor() {
		return southDoor;
	}

	public void setSouthDoor(boolean southDoor) {
		this.southDoor = southDoor;
	}

	public boolean isNorthDoor() {
		return northDoor;
	}

	public void setNorthDoor(boolean northDoor) {
		this.northDoor = northDoor;
	}

	public boolean isEastDoor() {
		return eastDoor;
	}

	public void setEastDoor(boolean eastDoor) {
		this.eastDoor = eastDoor;
	}

	public boolean isWestDoor() {
		return westDoor;
	}

	public void setWestDoor(boolean westDoor) {
		this.westDoor = westDoor;
	}

}
