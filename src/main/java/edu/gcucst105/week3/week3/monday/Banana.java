package edu.gcucst105.week3.week3.monday;

public class Banana extends Fruit{
	private String color;

	@Override
	public void rot(int days) {
		
		if (days > 3) {
    		System.out.println("This banana is green.");	
	}
    		else if (days < 10) {
    		System.out.println("This is yellow and yummy.");
    		}	
		else {
			System.out.println("This bananais perfect for banana bread.");
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}


