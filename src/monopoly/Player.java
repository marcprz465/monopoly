package monopoly;

import java.io.IOException;
import java.util.Scanner;

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
public void playGame(Board _board) throws IOException
{
	int choice;
	Scanner sc=new Scanner(System.in);
	boolean done=false;
	System.out.println("Press '2' to roll a dice");
	do
	{
		choice=sc.nextInt();
		switch(choice)
		{
		case 2:
			int rolled=_board.dice.rollDice();
			position+=rolled;
			System.out.println("Rolled "+rolled+", you are on "+_board.fields.get(position).name+" now.");
			System.out.println();
			done=true;
			break;
		}
	} while(!done);
}
}
