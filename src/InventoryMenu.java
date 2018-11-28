import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InventoryMenu {
	private JFrame mainFrame;
	
	private JLabel itemName1, itemRemaining1;
	private JLabel itemName2, itemRemaining2;
	private JLabel itemName3, itemRemaining3;
	private JLabel itemName4, itemRemaining4;
	
	private JButton editButton1, deleteButton1;
	private JButton editButton2, deleteButton2;
	private JButton editButton3, deleteButton3;
	private JButton editButton4, deleteButton4;
	
	private JButton addButton, backButton;
	
	InventoryMenu() {
		mainFrame = new JFrame();
		
		itemName1 = new JLabel();
		itemName2 = new JLabel();
		itemName3 = new JLabel();
		itemName4 = new JLabel();
		
		itemRemaining1 = new JLabel();
		itemRemaining2 = new JLabel();
		itemRemaining3 = new JLabel();
		itemRemaining4 = new JLabel();
		
		editButton1 = new JButton();
		editButton2 = new JButton();
		editButton3 = new JButton();
		editButton4 = new JButton();
		
		deleteButton1 = new JButton();
		deleteButton2 = new JButton();
		deleteButton3 = new JButton();
		deleteButton4 = new JButton();
		
		addButton = new JButton();
		backButton = new JButton();
		
	}
}
