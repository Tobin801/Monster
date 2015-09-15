package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster tobinMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "Blargitharion";
		int eyes = 5;
		int noses = 1;
		double legs= 2.5;
		double hair = 4.0;
		boolean hasBellyButton = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		tobinMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(tobinMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + tobinMonster.toString());
	}

	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one!");
		String newMonsterName = monsterScanner.next();
		tobinMonster.setMonsterName(newMonsterName);
		System.out.println("Give me a new number of noses!");
		int updatedNoses = monsterScanner.nextInt();
		tobinMonster.setMonsterNoses(updatedNoses);
		System.out.println("How many legs does it have?");
		double updatedLegs = monsterScanner.nextInt();
		tobinMonster.setMonsterLegs(updatedLegs)
		System.out.println("How many strands of hair should it have?");
		double updatedHair = monsterScanner.nextInt();
		
		System.out.println("Almost done! Can you please tell me how many eyes it should have?");
		int updatedEyes = monsterScanner.nextInt();
		
	}
}