package monopoly;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
String name;
int cash;
int position;
boolean jailCard;
public Player(String n)
{
	this.name=n;
	this.cash=1500;
	this.position=0;
	this.jailCard=false;
}
public Player getPlayer()
{
	return this;
}
public void playGame(Board _board, BufferedReader b) throws IOException
{
	boolean done=false;
	System.out.println("Press 'l' to roll a dice");
	do
	{
	if((char)b.read()=='l')
	{
	int rolled=_board.dice.rollDice();
	position+=rolled;
	System.out.println("Rolled "+rolled+", you are on "+_board.fields.get(position).name+" now.");
	done=true;
	}
	} while(!done);
}
}
