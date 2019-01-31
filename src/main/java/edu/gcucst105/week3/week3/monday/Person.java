package edu.gcucst105.week3.week3.monday;

public class Person {

	public static void main(String[] args) {
		//cannot make object of abstract classes
		//Fruit banana = new Fruit();
		
		Apples redDelicious = new Apples();
		redDelicious.setColor("red");
		redDelicious.setSweet(true);
		redDelicious.rot(100);
		System.out.println(redDelicious.toString());
		
		Banana yummy = new Banana();
		yummy.setColor("red");
		yummy.setSweet(true);
		yummy.rot(100);
		System.out.println(yummy.toString());
	}

}
