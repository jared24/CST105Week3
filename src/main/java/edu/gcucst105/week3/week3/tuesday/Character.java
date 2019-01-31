package edu.gcucst105.week3.week3.tuesday;

public abstract class Character {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private char action;
	public char getAction() {
		return action;
	}
	public void setAction(char action) {
		this.action = action;
	}
	
	private int health;
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	private boolean isAlive = true;
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public abstract void talk(String catchPhrase);
	
	public void displayHealth() {
		System.out.println(this.getName() + " has " + this.getHealth() + " health points.");
		
	}
	
	

}
