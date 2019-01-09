import javax.swing.JOptionPane;

import database.RAF;

public class InitialScreen {
	private static final String FILE_PATH = "data/option.txt";
	private JOptionPane mainFrame;
	private String storageOption;

	public InitialScreen() {
		storageOption = new String();
		byte[] data = RAF.readFromFile(InitialScreen.FILE_PATH, 0, 10);
		if(new String(data).trim().equals("database") == true) {
			new SummaryMenu();
		} else
		if(new String(data).trim().equals("local") == true) {
			new SummaryMenu();
		} else {
			mainFrame = new JOptionPane();
			int input = JOptionPane.showOptionDialog(null, "Do you want to use Cloud Storage to store the PoS data?", "Status", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			if(input == JOptionPane.YES_OPTION) {			
				RAF.writeToFile(InitialScreen.FILE_PATH, "database", 0);
				storageOption = "database";
				new SummaryMenu();
			}
			if(input == JOptionPane.NO_OPTION) {
				RAF.writeToFile(InitialScreen.FILE_PATH, "local", 0);
				storageOption = "local";
				new SummaryMenu();
			}
		}
	}
}
