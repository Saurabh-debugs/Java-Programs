package Allprogram;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame
{
	private JLabel heading;
//	Font font = new Font("",Font)
public MyWindow()
{
	super.setTitle("First form");
	super.setSize(400,400);
	super.setLocation(100,100);
//	this.createGUI();
	super.setVisible(true);
	System.out.println("this is a constructor");
}
public void createGUI()
{
	
}
}
