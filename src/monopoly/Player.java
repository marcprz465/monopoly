package monopoly;

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
}
