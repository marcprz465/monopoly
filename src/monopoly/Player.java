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
public void displayPlayer()
{
	System.out.println("Your name: "+this.name);
	System.out.println("Your cash = $"+this.cash);
	if(jailCard)
		System.out.println("Jail Free Cards: 1");
	else
		System.out.println("Jail Free Cards: 0");
	System.out.println("You are now at "+this.position+". field");
}
public void playGame(Board _board) throws IOException
{
	System.out.println("Player "+this.name+", cash = $"+this.cash);
	char choice, choice2;
	Scanner sc=new Scanner(System.in);
	boolean done=false;
	System.out.println("Press '2' to roll a dice, '9' to check your status");
	do
	{
		choice=sc.next().charAt(0);
		if(Character.isDigit(choice))
		{
		switch(choice)
		{
		case '2':
			int rolled=_board.dice.rollDice();
			int tempPosition=position+rolled;
			if(tempPosition>39)
			{
				position=position+rolled-40;
			}
			else
			{
			position+=rolled;
			}
			System.out.println("Rolled "+rolled+", you are on ["+position+1+"] "+_board.fields.get(position).name+" now. It's $"+_board.fields.get(position).price+".");
			System.out.println();
			
			System.out.println("Press '1' to continue, '3' to buy this field (if enough cash)");
			choice2=sc.next().charAt(0);
			if(Character.isDigit(choice2))
			{
			switch(choice2)
			{
			case '1':
				break;
			case '3':
				if(this.cash>=_board.fields.get(position).price&&!_board.fields.get(position).isOwned()&&_board.fields.get(position).price!=0)
				{
				_board.fields.get(position).buyField(this);
				System.out.println("You are a new owner now!");
				System.out.println("Cash left = $"+this.cash);
				}
				else if(this.cash<_board.fields.get(position).price)
				{
					System.err.println("Not enough money.");
				}
				else if(_board.fields.get(position).isOwned())
				{
					System.err.println("This field is owned.");
				}
				else
				{
					System.err.println("This field can't be bought.");
				}
				break;
				default:
					System.err.println("Wrong input");
				break;
			}
			}
			done=true;
			break;
		case '9':
			this.displayPlayer();
			System.out.println();
			System.out.println("Press '2' to roll a dice");
			break;
		default:
			System.err.println("Wrong input");
			break;
		}
		}
	} while(!done);
}
}
