package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	private MarshmallowMonster()
	{
		
	}

	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, boolean monsterBellyButton, double monsterLegs, double monsterHair)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
	}

	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs and it's name is " + monsterName + ". It has " + monsterEyes + " eyes, the answer of wether or not he has a belly button is " + monsterBellyButton + ", ";
		
		return monsterInfo;
	}
}