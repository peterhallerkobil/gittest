package gittest;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Main extends JFrame
{
	public Main()
	{
		setSize(800,600);
		setLocation(400,400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0)
			{
				super.windowClosing(arg0);
				setVisible(false);
				System.exit(0);
			}
		});
	
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
