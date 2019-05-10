package gui;

// Reference stackoverflow, Java manual

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import classes.MakeSmall;

public class MainWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JPanel panel = new JPanel();
	ArrayList<File> filesList;
	
	public MainWindow(){
		filesList = new ArrayList<File>();
		initUI();
	}
	
	
	private void initUI(){
		
		panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		final JPanel filePanel = new JPanel();
		
		filePanel.setLayout(new BoxLayout(filePanel, BoxLayout.X_AXIS));
		
		final JButton addFileButton = new JButton("Add a file(s) to file list to be zipped.");
		
		final JTextField fileBox = new JTextField(26);
		
		fileBox.setEditable(false);
		
		filePanel.add(addFileButton);
		

		panel.add(filePanel);

		final JPanel savePanel = new JPanel();
		
		savePanel.setLayout(new BoxLayout(savePanel, BoxLayout.X_AXIS));
		
		final JButton saveFileButton = new JButton("Find file to make small.");
		
		final JTextField savefileBox = new JTextField(26);
		
		savefileBox.setEditable(true);
		
		savePanel.add(saveFileButton);
		

		panel.add(savePanel);

		final JPanel buttonPanel = new JPanel();
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		
		final JButton createButton = new JButton("Zip it up, Captain!");
		
		buttonPanel.add(createButton);
		

		panel.add(buttonPanel);

		addFileButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				JFileChooser fc = new JFileChooser();
				
				fc.setMultiSelectionEnabled(true);
				int returnVal = fc.showOpenDialog(MainWindow.this);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File files[] = fc.getSelectedFiles();
					for(int i = 0; i < files.length; i++){
						File file = files[i];
						filesList.add(file);
						String filename = file.getName();
						 
						String currentText = fileBox.getText();
						if(currentText.length() != 0){
							fileBox.setText(currentText+", "+filename);
						}else{
							fileBox.setText(filename);
						}

					}
				}

			}
		});

		
		createButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				MakeSmall makeSmall = new MakeSmall (filesList, savefileBox.getText());
				String result = makeSmall.zipFiles();
				JOptionPane.showMessageDialog(result); // not sure
				}
		});

		saveFileButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				JFileChooser fc = new JFileChooser();
				
				int returnVal = fc.showOpenDialog(MainWindow.this);
				
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File file  = fc.getSelectedFile();
					savefileBox.setText(file.getAbsolutePath());
				}

			}
		});


		
		

		add(panel);
		setTitle("Make itty bitty");
		setLocationRelativeTo(null);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
