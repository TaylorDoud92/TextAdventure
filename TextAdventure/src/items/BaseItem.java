package items;

public abstract class BaseItem {

	protected String name;
	
	protected String description;
	
	public BaseItem(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}
	
	protected abstract void action();
	
}
