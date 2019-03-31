package monopoly;

import java.util.Random;

public class Dice {
int x,y=0;
public Dice()
{
	
}
public int rollDice()
{
	this.x=this.y=0;
	Random rand=new Random();
	this.x=rand.nextInt(6)+1;
	this.y=rand.nextInt(6)+1;
	return x+y;
}
}
