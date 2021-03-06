package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import marshmallows.view.MonsterPopupDisplay;
import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster tobinMonster; //Declares a Monster called tobinMonster.
	private MarshmallowMonster userMonster;
	private MonsterDisplay myDisplay;
	private MonsterPopupDisplay myPopups;
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
		myPopups = new MonsterPopupDisplay();
		tobinMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(tobinMonster.toString());
		this.createUserMonster();
		myDisplay.displayInfo("User monster info: " + userMonster.toString());
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
		tobinMonster.setMonsterLegs(updatedLegs);
		System.out.println("How many strands of hair should it have?");
		double updatedHair = monsterScanner.nextInt();
		
		System.out.println("Almost done! Can you please tell me how many eyes it should have?");
		int updatedEyes = monsterScanner.nextInt();
		
	}
	/**
	 * Creates a MarshmallowMonster instance from user input.
	 */
	private void createUserMonster()
	{
		//Step one Gather user information.
		System.out.println("What is your monster's name?");
		String userName;
		userName = monsterScanner.nextLine();
		System.out.println("How many legs will it have? This is a decimal value because java sucks. :/");
		double userLegs = monsterScanner.nextDouble();
		System.out.println("How many strands of hair should it have? Another decimal value.");
		double userHair = monsterScanner.nextDouble();
		System.out.println("Does it have a bellybutton (true or false)?");
		boolean userBellyButton = monsterScanner.nextBoolean();
		System.out.println("How many eyes will it have?");
		int userEyes = monsterScanner.nextInt();
		System.out.println("How many noses?");
		int userNoses = monsterScanner.nextInt();
		
		//Step two: Build the monster using the constructor.
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userBellyButton, userHair, userLegs);
	}
	
	private void makeMonsterFromGui()
	{
		
			String name = myPopups.getAnswer("Type in the monster's name");
			
			myPopups.displayResponse("You typed in " + name);
			
			int eyes;
			String tempEyes = myPopups.getAnswer("How many eyes does it have?");
			if (isInteger(tempEyes))
			{
				eyes = Integer.parseInt(tempEyes);
			}
			else
			{
				eyes = 1;
			}
			myPopups.displayResponse("It will have " + eyes + "eyes.");
			
			int noses;
			String tempNoses = myPopups.getAnswer("How many noses should it have?");
			if (isInteger(tempNoses))
			{
				noses = Integer.parseInt(tempNoses);
			}
			
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch (NumberFormatException error)
		{
			myPopups.displayResponse("You typed in an invalid integer, blame Tobin");
		}
		return isInt;
	}
	
	
}
