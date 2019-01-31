package edu.gcucst105.week3.week3.monday;

public class Apples extends Fruit{
	private String color;

	@Override
	public void rot(int days) {
		
		if (days > 4) {
    		System.out.println("This apple is ripe.");	
	}
    		else if (days < 10) {
    		System.out.println("This apple may be bad.");
    		}	
		else {
			System.out.println("Apple is bad.");
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}
