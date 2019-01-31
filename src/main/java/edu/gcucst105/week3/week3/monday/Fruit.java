package edu.gcucst105.week3.week3.monday;

public abstract class Fruit {
	//Class or instance attributes
	private boolean isSweet;

		//getter and setter for data hiding
		//encapsulation pieces
	public boolean isSweet() {
		return isSweet;
	}

	public void setSweet(boolean isSweet) {
		this.isSweet = isSweet;
	}
	//do not define the method body for abstract methods 
	//the whole class needs to be abstract because of this method being abstract
	public abstract void rot(int days);
	
	public String toString () {
		return "The fruit is sweet: " + this.isSweet();
	}
	
}
