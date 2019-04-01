package monopoly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	Dice dice;
	ArrayList<Player> players;
ArrayList<Field> fields;
public Board()
{
	dice=new Dice();
	fields=new ArrayList<Field>();
	players=new ArrayList<Player>();
//	players.add(new Player("Tester"));

	fields.add(0, new OtherField("Start/End",0));
	fields.add(1, new HouseField("Mediterranean Avenue","brown",60,50));
	fields.add(2, new OtherField("Community Chest",1));
	fields.add(3, new HouseField("Baltic Ave","brown",60,50));
	fields.add(4, new OtherField("Income Tax",2));
	fields.add(5, new HouseField("Reading Railroad","black",200));
	fields.add(6, new HouseField("Oriental Avenue","light blue",100,50));
	fields.add(7, new OtherField("Chance",3));
	fields.add(8, new HouseField("Vermont Avenue","light blue",100,50));
	fields.add(9, new HouseField("Connecticut Avenue","light blue",120,50));
	fields.add(10, new OtherField("Visiting Jail",0));
	fields.add(11, new HouseField("St. Charles Place","pink",140,100));
	fields.add(12, new HouseField("Electric Company","white",150));
	fields.add(13, new HouseField("States Avenue","pink",140,100));
	fields.add(14, new HouseField("Virginia Avenue","pink",160,100));
	fields.add(15, new HouseField("Pennsylvania Railroad","black",200));
	fields.add(16, new HouseField("St. James Place","orange",180,100));
	fields.add(17, new OtherField("Community Chest",1));
	fields.add(18, new HouseField("Tennessee Avenue","orange",180,100));
	fields.add(19, new HouseField("New York Avenue","orange",200,100));
	fields.add(20, new OtherField("Free Parking",0));
	fields.add(21, new HouseField("Kentucky Avenue","red",220,150));
	fields.add(22, new OtherField("Chance",3));
	fields.add(23, new HouseField("Indiana Avenue","red",220,150));
	fields.add(24, new HouseField("Illinois Avenue","red",240,150));
	fields.add(25, new HouseField("B. & O. Railroad","black",200));
	fields.add(26, new HouseField("Atlantic Avenue","yellow",260,150));
	fields.add(27, new HouseField("Ventor Avenue","yellow",260,150));
	fields.add(28, new HouseField("Water Works","white",150));
	fields.add(29, new HouseField("Marvin Gardens","yellow",280,150));
	fields.add(30, new OtherField("Jail",4));
	fields.add(31, new HouseField("Pacific Avenue","green",300,200));
	fields.add(32, new HouseField("North Carolina Avenue","green",300,200));
	fields.add(33, new OtherField("Community Chest",1));
	fields.add(34, new HouseField("Pennsylvania Avenue","green",320,200));
	fields.add(35, new HouseField("Short Line","black",200));
	fields.add(36, new OtherField("Chance",3));
	fields.add(37, new HouseField("Park Place","blue",350,200));
	fields.add(38, new OtherField("Luxury Tax",5));
	fields.add(39, new HouseField("Boardwalk","blue",400,200));
}
public static void main(String[] args) throws IOException
{
	int i=0;
	Board board=new Board();
	Scanner s=new Scanner(System.in);
	char choice;
	boolean done=false;
	char maxPlayers;
	do
	{
		System.out.println("How many players are playing?");
	maxPlayers=s.next().charAt(0);
	} while(!Character.isDigit(maxPlayers));
	
	for(int players=0;players<(int)maxPlayers-48;players++)
	{
		System.out.println("Enter "+(players+1)+" player's name:");
		board.players.add(new Player(s.next()));
	}
//	System.out.println("Enter second player's name:");
//	board.players.add(new Player(s.next()));
	do
	{
		System.out.println("Press '1' to continue, '0' to exit");
		choice=s.next().charAt(0);
		if(Character.isDigit(choice))
		{
		switch(choice)
		{
		case '1':
			board.players.get(i).playGame(board,s);
			if (board.players.size()>i+1)
			{
				++i;
			}
			else
			{
				i=0;
			}
			break;
		case '0':
			done=true;
			break;
			default:
				System.err.println("Wrong input");
				break;
		}
		}
	}while(!done);
	System.out.println("Program exited");
	//int sum=board.dice.rollDice();
	//System.out.println(sum);
//	for(Field f:board.fields)
//	{
//	System.out.println(f.name);
//	}
	s.close();
}
}
