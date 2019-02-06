import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import database.DBConnection;
import database.RAF;

public class InventoryMenu implements ActionListener {
	private JFrame mainFrame;
	
	private JLabel inventoryTitle, networkStatus;
	private JLabel itemName1, itemRemaining1, desc1, type1;
	private JLabel itemName2, itemRemaining2, desc2, type2;
	private JLabel itemName3, itemRemaining3, desc3, type3;
	private JLabel itemName4, itemRemaining4, desc4, type4;
		
	private JButton editButton1, deleteButton1;
	private JButton editButton2, deleteButton2;
	private JButton editButton3, deleteButton3;
	private JButton editButton4, deleteButton4;
	
	private JButton addButton, backButton;
	
	private JPanel pnlLeft, pnlRight, pnlCenter, pnlNorth;
	private JPanel item1, item2, item3, item4;
	private JPanel buttons1, buttons2, buttons3, buttons4;
	
	private static final String OPTION_PATH = "data/option.txt";
	
	public InventoryMenu() {
		
		mainFrame = new JFrame();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("MyJoeShop > Inventory");
		mainFrame.setSize(640,480);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		
		pnlCenter = new JPanel();
		pnlLeft = new JPanel();
		pnlNorth = new JPanel();
		pnlRight = new JPanel();
		
		itemName1 = new JLabel("Item:");
		itemName2 = new JLabel("Item:");
		itemName3 = new JLabel("Item:");
		itemName4 = new JLabel("Item:");
		
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
		
		//border of item name and remaining
		item1 = new JPanel();
		item1.setLayout(new GridLayout (2, 1));
		item1.add(itemName1);
		item1.add(itemRemaining1);
		
		item2 = new JPanel();
		item2.setLayout(new GridLayout (2, 1));
		item2.add(itemName2);
		item2.add(itemRemaining2);
		
		item3 = new JPanel();
		item3.setLayout(new GridLayout (2, 1));
		item3.add(itemName3);
		item3.add(itemRemaining3);
		
		item4 = new JPanel();
		item4.setLayout(new GridLayout (2, 1));
		item4.add(itemName4);
		item4.add(itemRemaining4);
		
		buttons1 = new JPanel();
		buttons1.setLayout(new GridLayout(1, 2));
		buttons1.add(editButton1);
		buttons1.add(deleteButton1);
		
		buttons2 = new JPanel();
		buttons2.setLayout(new GridLayout(1, 2));
		buttons2.add(editButton2);
		buttons2.add(deleteButton2);
		
		buttons3 = new JPanel();
		buttons3.setLayout(new GridLayout(1, 2));
		buttons3.add(editButton3);
		buttons3.add(deleteButton3);
		
		buttons4 = new JPanel();
		buttons4.setLayout(new GridLayout(1, 2));
		buttons4.add(editButton4);
		buttons4.add(deleteButton4);
		
		//add panels
		mainFrame.add(pnlNorth, "North");
		mainFrame.add(pnlCenter, "Center");
		mainFrame.add(new JPanel(), "West");
		mainFrame.add(new JPanel(), "East");
		mainFrame.add(new JPanel(), "South");
		
		pnlNorth.add(inventoryTitle);
		pnlCenter.setLayout(new GridLayout (1, 2));
		pnlLeft.setLayout(new GridLayout (9, 2));
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item1);
		pnlLeft.add(buttons1);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item2);
		pnlLeft.add(buttons2);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item3);
		pnlLeft.add(buttons3);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(item4);
		pnlLeft.add(buttons4);
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlCenter.add(pnlLeft);
		
		
		pnlRight = new JPanel();
		pnlRight.setLayout(new GridLayout(5,3));
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
		pnlRight.add(backButton);
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlCenter.add(pnlRight);
		
		int i = 0;
		byte[] data = RAF.readFromFile(InventoryMenu.OPTION_PATH, 0, 10);
		String storageOption = new String();
		if (new String(data).trim().equals("database") == true) {	
			DBConnection con = new DBConnection();
			String query = "SELECT * FROM inventory";
			ResultSet result = con.executeGet(query);
			try {
				while(result.next()) {
					itemName1.setText(result.getString("name"));
					itemRemaining1.setText(result.getString("quantity"));
					i++;
				}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		
		backButton.addActionListener(this);
		addButton.addActionListener(this);
		deleteButton1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(backButton)) {
			new SummaryMenu();
			mainFrame.dispose();
		}
		
		if(arg0.getSource().equals(addButton)) {
			new InventoryEdit(null, null, null, null);
			mainFrame.dispose();
		}
		
		if(arg0.getSource().equals(deleteButton1)) {
			DBConnection con = new DBConnection();
			String queryDelete = "DELETE FROM inventory where name = '" + itemName1.getText() +"'";
			con.executeQuery(queryDelete);
			JOptionPane.showMessageDialog(null, "Successfully Deleted from database!", "Success", JOptionPane.INFORMATION_MESSAGE);
			new InventoryMenu();
			mainFrame.dispose();
		}
		
	}
}
