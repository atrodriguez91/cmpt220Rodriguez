package main;
//Reference stackoverflow, Java manual

import gui.MainWindow;

import javax.swing.SwingUtilities;

public class Driver {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run() {
				MainWindow ex = new MainWindow();
				ex.setVisible(false);
			}
		});

	}
}
