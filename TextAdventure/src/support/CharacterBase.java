package support;

public abstract class CharacterBase {

	protected String name;
	
	protected double totalHealth;
	
	protected double currentHealth;
	
	public CharacterBase(String name,double totalHealth) {
		this.name = name;
		this.totalHealth = totalHealth;
		this.currentHealth = totalHealth;
	}
	
	protected double getTotalHealth() {
		return totalHealth;
	}
	
	protected void setTotalHealth(double totalHealth) {
		this.totalHealth = totalHealth;
	}
	
	protected double getCurrentHealth() {
		return currentHealth;
	}
	
	protected void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}
	
	protected double damageCharacter(double damage){
		currentHealth=-damage;
		return currentHealth;
	}
	
	protected double healCharacter(double heal){
		currentHealth=+heal;
		return currentHealth;
	}
}
