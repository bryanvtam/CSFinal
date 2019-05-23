package Graphics;

import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu");
		frame.setVisible(true);
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		
		JMenu file = new JMenu("File");
		menubar.add(file);
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		
		class exitaction implements ActionListener{
			public void actionPerformed (ActionEvent e) {
				System.exit(0);
			}
		}
		exit.addActionListener(new exitaction());
		
		}

}
