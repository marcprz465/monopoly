package monopoly;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame implements ActionListener {
JButton roll=new JButton("roll a dice");
JLabel pl=new JLabel("Players:");
String[] options= {"1","2","3","4"};
JComboBox<String> box=new JComboBox<String>(options);

public Menu()
{
	setSize(640,480);
	setTitle("Monopoly");
	setLayout(null);
	pl.setBounds(200, 200, 100, 20);
	box.setBounds(200, 240, 100, 20);
	roll.setBounds(320, 400, 100, 20);
	add(pl);
	add(box);
	add(roll);
	roll.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		Object source=event.getSource();
		if(source==roll)
		{
			System.out.println("roll btn");
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		Menu menu=new Menu();
		menu.setVisible(true);
		Board.mainFunction();
	}

}
