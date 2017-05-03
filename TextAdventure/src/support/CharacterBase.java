package support;

public abstract class CharacterBase {

	private String name;
	
	private double totalHealth;
	
	private double currentHealth;
	
	public CharacterBase(String name,double totalHealth) {
		this.name = name;
		this.totalHealth = totalHealth;
		this.currentHealth = totalHealth;
	}
	
	public double getTotalHealth() {
		return totalHealth;
	}
	
	public void setTotalHealth(double totalHealth) {
		this.totalHealth = totalHealth;
	}
	
	public double getCurrentHealth() {
		return currentHealth;
	}
	
	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}
	
	public double damageCharacter(double damage){
		currentHealth=-damage;
		return currentHealth;
	}
	
	public double healCharacter(double heal){
		currentHealth=+heal;
		return currentHealth;
	}
}
