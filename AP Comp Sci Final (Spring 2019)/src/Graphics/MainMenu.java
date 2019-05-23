package Graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu extends JFrame {
	
	private JButton button;
	private JPanel jp = new JPanel();
	private JTextField textArea;
	
	public MainMenu() {
		super("GPA and RogerHub Calculator");
	
	
		/////////////////////////////////////// top menu bar	//////////////////////////////////////////////
		JMenuBar menubar = new JMenuBar(); //creates the menu bar
		setJMenuBar(menubar); //adds the menu bar to the top of the JFrame
	
		JMenu file = new JMenu("File"); //create a pull down menu in the menu bar called "file"
		menubar.add(file); //adds the pull down menu
		JMenuItem exit = new JMenuItem("Exit"); //creates a menu item called "exit"
		file.add(exit); //adds "exit" to the pull down menu of "file"
		class exitaction implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				System.exit(0);
			}
		}
		exit.addActionListener(new exitaction());
		
		//////////////////////////////////////	creating typable areas		//////////////////////////
		setLayout(new BorderLayout());
		button = new JButton("GPA Calculator");
		
		add(button, BorderLayout.SOUTH); //adds
		

		textArea = new JTextField(20); //creates a text box that is 30 characters long
		jp.add(textArea);
		add(jp);
		
		
		////////////////////////////////////	Creating the JFrame		//////////////////////////////////////
		setVisible(true); 
		setSize(1000,600); //sets the size of the JFrame
		setResizable(false); //makes it so it can't be resized
		setLocationRelativeTo(null); //puts the window in the middle of the screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
