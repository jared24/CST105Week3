package edu.gcucst105.week3.week3.tuesday;

import java.util.Random;
import java.util.Scanner;

public class Arena {

	Hero getterman = new Hero();
	Villian setterman = new Villian();
	Scanner sc = new Scanner(System.in);
	int round = 1;
	
	public static void main(String[] args) {
		Arena talkingStick = new Arena();
		talkingStick.nameCharacters();
		talkingStick.talkCharacters();
		talkingStick.doBattle(talkingStick);
		
	}
	
	
	private void doBattle(Arena talkingStick) {
		
		while (getterman.getHealth() > 0 && setterman.getHealth() > 0) {
		talkingStick.getCharactorAction();
		talkingStick.calculateHealth();
		}
		System.out.println("There is a wiiner!");
	}

	private void calculateHealth() {
		int damage;
		if (getterman.getAction() == 'F')
		{
			damage = rand_generator(10);
			System.out.println(setterman.getName() + " receievs Damage of " + damage);
			setterman.setHealth(setterman.getHealth() - damage);
			setterman.displayHealth();
		}
		else {
		
			damage = rand_generator(5);
			System.out.println(getterman.getName() + " receievs Healing for " + damage);
			getterman.setHealth(getterman.getHealth() + damage);
			getterman.displayHealth();
			
		}
		if (setterman.getAction() == 'F')
		{
			damage = rand_generator(10);
			System.out.println(getterman.getName() + " receievs Damage of " + damage);
			getterman.setHealth(setterman.getHealth() - damage);
			getterman.displayHealth();
		}
		else {
			damage = rand_generator(5);
			System.out.println(setterman.getName() + " receievs Healing for " + damage);
			setterman.setHealth(setterman.getHealth() + damage);
			setterman.displayHealth();
			
		}
	}
	
	private int rand_generator(int threshold) {
		Random rand = new Random();
		return rand.nextInt(threshold);
	}

	private void nameCharacters() {
		getterman.setName("Thor");
		setterman.setName("Loki");
		getterman.setHealth(rand_generator (25)+25);
		setterman.setHealth(rand_generator (25)+25);	
		setterman.displayHealth();
		getterman.displayHealth();
	}
	private void talkCharacters() {
		getterman.talk("By the power of Asgard");
		setterman.talk("Talking Trash");
	
	}
	
	private void getCharactorAction() {
		System.out.println("Round " + round ++);
		System.out.println("What should " + getterman.getName() + " do?");
		System.out.println("F = Fight | H = Heal");
		getterman.setAction(sc.nextLine().toUpperCase().charAt(0));
		
		System.out.println("What should " + setterman.getName() + " do?");
		System.out.println("F = Fight | H = Heal");
		setterman.setAction(sc.nextLine().toUpperCase().charAt(0));
		
		
	}
}
