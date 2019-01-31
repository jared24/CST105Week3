package edu.gcucst105.week3.week3.tuesday;

public class Hero extends Character implements moves{

	private int morals = 75; 
	
	public int fight(String move) {
		return 0;
	}

	public int heal(String move) {
		return 0;
	}

	@Override
	public void talk(String catchPhrase) {
		System.out.print(this.getName() + " says, ");
		System.out.print("\"" + catchPhrase + "\"");
		System.out.println(" , with a smile");
		
	}

	public int getMorals() {
		return morals;
	}

	public void setMorals(int morals) {
		this.morals = morals;
	}

}
