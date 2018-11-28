import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InventoryMenu {
	private JFrame mainFrame;
	
	private JLabel inventoryTitle;
	private JLabel itemName1, itemRemaining1;
	private JLabel itemName2, itemRemaining2;
	private JLabel itemName3, itemRemaining3;
	private JLabel itemName4, itemRemaining4;
	
	private JButton editButton1, deleteButton1;
	private JButton editButton2, deleteButton2;
	private JButton editButton3, deleteButton3;
	private JButton editButton4, deleteButton4;
	
	private JButton addButton, backButton;
	
	private JPanel pnlLeft, pnlRight, pnlCenter, pnlNorth;
	private JPanel item1, item2, item3, item4;
	
	InventoryMenu() {
		mainFrame = new JFrame();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("MyJoeShop > Inventory");
		mainFrame.setSize(640,480);
		mainFrame.setLocationRelativeTo(null);
		
		pnlCenter = new JPanel();
		pnlLeft = new JPanel();
		pnlNorth = new JPanel();
		pnlRight = new JPanel();
		
		itemName1 = new JLabel("Item1");
		itemName2 = new JLabel("Item2");
		itemName3 = new JLabel("Item3");
		itemName4 = new JLabel("Item4");
		
		itemRemaining1 = new JLabel("Remaining: ");
		itemRemaining2 = new JLabel("Remaining: ");
		itemRemaining3 = new JLabel("Remaining: ");
		itemRemaining4 = new JLabel("Remaining: ");
		
		inventoryTitle = new JLabel("Inventory");
		
		editButton1 = new JButton("Edit");
		editButton2 = new JButton("Edit");
		editButton3 = new JButton("Edit");
		editButton4 = new JButton("Edit");
		
		deleteButton1 = new JButton("Remove");
		deleteButton2 = new JButton("Remove");
		deleteButton3 = new JButton("Remove");
		deleteButton4 = new JButton("Remove");
		
		addButton = new JButton("Add Item");
		backButton = new JButton("Back to Home");
		
		mainFrame.add(pnlNorth, "North");
		mainFrame.add(pnlCenter, "Center");
		mainFrame.add(new JPanel(), "West");
		mainFrame.add(new JPanel(), "East");
		
		pnlNorth.add(inventoryTitle);
		pnlCenter.setLayout(new BorderLayout(1, 2));
		pnlLeft.setLayout(new BorderLayout(9, 3));
		
		item1 = new JPanel();
		item1.setLayout(new BorderLayout (2, 1));
		item1.add(itemName1);
		item1.add(itemRemaining1);
		
		item2 = new JPanel();
		item2.setLayout(new BorderLayout (2, 1));
		item2.add(itemName2);
		item2.add(itemRemaining2);
		
		item3 = new JPanel();
		item3.setLayout(new BorderLayout (2, 1));
		item3.add(itemName3);
		item3.add(itemRemaining3);
		
		item4 = new JPanel();
		item4.setLayout(new BorderLayout (2, 1));
		item4.add(itemName4);
		item4.add(itemRemaining4);
		
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item1);
		pnlLeft.add(editButton1);
		pnlLeft.add(deleteButton1);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item2);
		pnlLeft.add(editButton2);
		pnlLeft.add(deleteButton2);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item3);
		pnlLeft.add(editButton3);
		pnlLeft.add(deleteButton3);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item4);
		pnlLeft.add(editButton4);
		pnlLeft.add(deleteButton4);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		
		pnlCenter.add(pnlLeft);
		
		pnlRight = new JPanel();
		pnlRight.setLayout(new BorderLayout(5,3));
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(addButton);
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(backButton);
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		
		pnlCenter.add(pnlRight);
		
	}
}
