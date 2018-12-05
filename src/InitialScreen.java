import javax.swing.JOptionPane;

import database.RAF;

public class InitialScreen {
	private static final String FILE_PATH = "data/option.txt";
	private JOptionPane mainFrame;
	private String storageOption;

	public InitialScreen() {
		storageOption = new String();
		byte[] data = RAF.readFromFile(InitialScreen.FILE_PATH, 0, 10);
		if(new String(data) == "database") {
			storageOption = "database";
			new SummaryMenu();
			return;
		} else
		if(new String(data) == "local") {
			storageOption = "local";
			new SummaryMenu();
			return;
		} else {
			mainFrame = new JOptionPane();
			int input = JOptionPane.showOptionDialog(null, "Do you want to use Cloud Storage to store your files?", "Status", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
			if(input == JOptionPane.YES_OPTION) {
				System.out.println("User selected cl oud!");
				RAF.writeToFile(InitialScreen.FILE_PATH, "database", 0);
				storageOption = "database";
				new SummaryMenu();
			}
			if(input == JOptionPane.NO_OPTION) {
				System.out.println("User selected local!");
				RAF.writeToFile(InitialScreen.FILE_PATH, "local", 0);
				storageOption = "local";
				new SummaryMenu();
			}
		}
	}
}
