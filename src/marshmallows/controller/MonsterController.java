package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;


public class MonsterController 
{
	private MarshmallowMonster tobinMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "Blargitharion";
		int eyes = 5;
		int noses = 1;
		double legs= 2.5;
		double hair = 4.0;
		boolean hasBellyButton = true;
	
		myDisplay = new MonsterDisplay();
		tobinMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(tobinMonster.toString());
	}

}