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
	
	public String getMonsterSring()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int monsterNoses()
	{
		return monsterNoses;
	}
	
	public double monsterLegs()
	{
		return monsterLegs;
	}
	
	public double monsterHair()
	{
		return monsterHair;
	}
	
	public boolean monsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setmonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setmonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setmonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setmonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setmonsterHair
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs and it's name is " + monsterName + ". It has " + monsterEyes + " eyes, the answer of wether or not he has a belly button is " + monsterBellyButton + ",  ";
		
		return monsterInfo;
	}
}