import javax.swing.JOptionPane;

import database.RAF;

public class InitialScreen {
	private static final String FILE_PATH = "data/option.txt";
	private JOptionPane mainFrame;
	private String storageOption;
	private RAF raf;
	
	public InitialScreen() {
		storageOption = new String();
		byte[] data = raf.readFromFile(InitialScreen.FILE_PATH, 0, 100);
		String stringData = data.toString();
		if(stringData.equals("cloud")) {
			storageOption = "cloud";
			new SummaryMenu();
			return;
		} else if(stringData.equals("local")) {
			storageOption = "local";
			new SummaryMenu();
			return;
		} else {
			mainFrame = new JOptionPane();
			int input = JOptionPane.showOptionDialog(null, "Do you want to use Cloud Storage to store your files?", "Status", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
			if(input == JOptionPane.YES_OPTION) {
				System.out.println("User selected cloud!");
				raf.writeToFile(InitialScreen.FILE_PATH, "database", 0);
				storageOption = "database";
				new SummaryMenu();
			}
			if(input == JOptionPane.NO_OPTION) {
				System.out.println("User selected local!");
				raf.writeToFile(InitialScreen.FILE_PATH, "local", 0);
				storageOption = "local";
				new SummaryMenu();
			}
		}
	}
}
