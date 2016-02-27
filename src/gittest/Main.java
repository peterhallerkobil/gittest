package gittest;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Kommentar editiert
public class Main extends JFrame
{
	public Main()
	{
		setSize(800,600);
		
		Container content = getContentPane();
		content.setLayout(new FlowLayout());
		JButton but = new JButton("show dialog");
		but.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0)
			{
				// Different text
				// shows a pretty Dialog 
				showBranchDialog();
				
			}
		});
		content.add(but);
		
		
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
	
	private void showBranchDialog() {
		JOptionPane.showMessageDialog(this,"This is the first branch");
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
