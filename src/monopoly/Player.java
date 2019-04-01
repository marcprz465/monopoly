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

public void buy(Board _board)
{
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
}

public void build(Board _board, Scanner sc)
{
	if(_board.fields.get(position).owner==this)
	{
	char n=sc.next().charAt(0);
	if(Character.isDigit(n))
	{
		if((int)n-48<=4&&(int)n-48>0)
		{
	_board.fields.get(position).buildHouse((int)n-48);
		}
		else
		{
			System.err.println("Wrong amount of houses.");
		}
	}
	}
	else
	{
		System.err.println("It's not your field.");
	}
}

public boolean rollAndPlay(Board _board, Scanner sc)
{
	boolean done=false;
	char choice2;
	boolean rollDone=false;
	int rolles=0;
	while(!rollDone)
	{
		if(rolles==2)
		{
			rollDone=true;
		}
		else
		{
	int rolled=_board.dice.rollDice();
	if(rolled<13)
	{
	int tempPosition=position+rolled;
	if(tempPosition>39)
	{
		position=position+rolled-40;
		this.cash+=200;
		System.out.println("$200 for crossing start");
	}
	else
	{
	position+=rolled;
	}
	rollDone=true;
	}
	else
	{
		rolled-=100;
		int tempPosition=position+rolled;
		if(tempPosition>39)
		{
			position=position+rolled-40;
			this.cash+=200;
			System.out.println("$200 for crossing start");
		}
		else
		{
		position+=rolled;
		}
		rollDone=false;
	}
	if(!_board.fields.get(position).isOwned())
	{
	System.out.println("Rolled "+rolled+", you are on ["+position+1+"] "+_board.fields.get(position).name+" now. It's $"+_board.fields.get(position).price+".");
	System.out.println();
	
	System.out.println("Press '1' to continue, '3' to buy this field (if enough cash), '4' to display info, '5' to build house (if owning)");
	choice2=sc.next().charAt(0);
	if(Character.isDigit(choice2))
	{
	switch(choice2)
	{
	case '1':
		break;
	case '3':
		this.buy(_board);
		break;
	case '4':
		_board.fields.get(position).displayInfo();
		break;
	case '5':
		this.build(_board, sc);
		break;
		default:
			System.err.println("Wrong input");
		break;
	}
	}
	}
	else if(_board.fields.get(position).isOwned()&&_board.fields.get(position).owner!=this)
	{
		System.out.println(_board.fields.get(position).owner.name+"'s field. You are paying $"+_board.fields.get(position).payFine(this,_board.fields.get(position).owner));
	}
	done=true;
	rolles++;
		}
	}
	return done;
}

public void playGame(Board _board, Scanner sc) throws IOException
{
	System.out.println("Player "+this.name+", cash = $"+this.cash);
	char choice;
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
			done=this.rollAndPlay(_board, sc);
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
