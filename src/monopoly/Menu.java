package monopoly;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Menu extends JFrame implements ActionListener {
JButton roll=new JButton("roll a dice");
JButton ok=new JButton("OK :)");
JLabel pl=new JLabel("Players:");
JComboBox<Integer> box=new JComboBox<>();
JLabel text=new JLabel();
Board board;

public Menu()
{
	box.addItem(1);
	box.addItem(2);
	box.addItem(3);
	box.addItem(4);
	setSize(640,480);
	setTitle("Monopoly");
	setLayout(null);
	pl.setBounds(50, 40, 100, 20);
	ok.setBounds(50, 100, 100, 20);
	box.setBounds(50, 70, 100, 20);
	roll.setBounds(150, 400, 100, 20);
	text.setBounds(150, 200, 200, 100);
	add(pl);
	add(ok);
	add(box);
	add(roll);
	add(text);
	ok.addActionListener(this);
	roll.addActionListener(this);
	board=new Board();
}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		Object source=event.getSource();
		if(source==roll)
		{
			System.out.println("roll btn");
		}
		else if(source==ok)
		{
			int plRes=(int) box.getSelectedItem();
			if(plRes==1)	text.setText(plRes+" player is playing.");
			else	text.setText(plRes+" players are playing.");
			board.maxPlayers=plRes;
			
			for(int i=0;i<board.maxPlayers;i++)
			{
				board.players.add(new Player(JOptionPane.showInputDialog("Name:")));
			}
		}
	}
	public void mainFunction() throws IOException
	{
		int i=0;
		Scanner s=new Scanner(System.in);
		char choice;
		boolean done=false;
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
		s.close();
	}
	public static void main(String[] args) throws IOException
	{
		Menu menu=new Menu();
		menu.setVisible(true);
		menu.mainFunction();
	}

}
