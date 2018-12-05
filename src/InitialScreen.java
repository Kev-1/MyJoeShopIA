import javax.swing.JOptionPane;

import database.RAF;

public class InitialScreen {
	private static final String FILE_PATH = "data/option.txt";
	private JOptionPane mainFrame;
	private String storageOption;
	private RAF raf;
	
	public InitialScreen() {
		storageOption = new String();
		byte[] data = RAF.readFromFile(RAF.FILE_PATH, 0, 100);
		String stringData = data.toString();
		if(stringData.equals("cloud")) {
			
		} else if(stringData.equals("local")) {
			storageOption = "local";
			new SummaryMenu();
		} else {
			mainFrame = new JOptionPane();
			int input = JOptionPane.showOptionDialog(null, "Do you want to use Cloud Storage to store your files?", "Status", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
			
			switch(input) 
			{
			case JOptionPane.YES_OPTION:
				System.out.println("User selected cloud!");
				RAF.writeToFile(RAF.FILE_PATH, "database", 0);
				storageOption = "database";
				new SummaryMenu();
			case JOptionPane.NO_OPTION:
				System.out.println("User selected local!");
				RAF.writeToFile(RAF.FILE_PATH, "local", 0);
				storageOption = "local";
				new SummaryMenu();
			}
		}
		
	}
	
}
