import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import database.DBConnection;

public class InventoryEdit implements ActionListener {
	private JFrame mainFrame;
	private JTextField itemName, itemQty, itemDescription, itemType;
	private JButton acceptButton, cancelButton;
	private JPanel pnlCenter, pnlTitle, pnlButtons;
	private JLabel lblName, lblQty, lblDescription, lblTitle, lblType;
	private String mode;
	
	public InventoryEdit() {
		mainFrame = new JFrame("MyJoeShop > Add Inventory");
		itemDescription = new JTextField();
		itemName = new JTextField();
		itemQty = new JTextField();
		itemType = new JTextField();
		
		lblName = new JLabel("Name of Item: ");
		lblQty = new JLabel("No of items: ");
		lblDescription = new JLabel("Description: ");
		lblTitle = new JLabel("Add Item to Inventory: ");
		lblType = new JLabel("Type of Item: ");
		
		acceptButton = new JButton("Add");
		cancelButton = new JButton("Cancel");
		
		pnlCenter = new JPanel();
		pnlTitle = new JPanel();
		pnlButtons = new JPanel();
		
		mainFrame.setVisible(true);
		mainFrame.setSize(480, 360);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		
		pnlTitle.add(lblTitle);
		
		pnlButtons.setLayout(new GridLayout(1,4));
		pnlButtons.add(new JPanel());
		pnlButtons.add(acceptButton);
		pnlButtons.add(cancelButton);
		pnlButtons.add(new JPanel());
		
		pnlCenter.setLayout(new GridLayout(10,2));
		pnlCenter.add(lblName);
		pnlCenter.add(itemName);
		pnlCenter.add(lblQty);
		pnlCenter.add(itemQty);
		pnlCenter.add(lblDescription);
		pnlCenter.add(itemDescription);
		pnlCenter.add(lblType);
		pnlCenter.add(itemType);
		pnlCenter.add(new JPanel());
		pnlCenter.add(pnlButtons);
		
		
		mainFrame.add(new JPanel(), "West");
		mainFrame.add(new JPanel(), "East");
		mainFrame.add(new JPanel(), "South");
		mainFrame.add(pnlCenter, "Center");
		mainFrame.add(pnlTitle, "North");
		
		acceptButton.addActionListener(this);
		cancelButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(acceptButton)) {
			mode = new String();
				DBConnection con = new DBConnection();
				String queryName = itemName.getText();
				String queryQty = itemQty.getText();
				String queryType = itemType.getText();
				String queryDesc = itemDescription.getText();
				String queryInsert = "INSERT INTO inventory VALUES('"+queryName+"','"+queryQty+"','"+queryType+"','"+queryDesc+"')";
				con.executeQuery(queryInsert);
				JOptionPane.showMessageDialog(null, "Added to database!", "Success", JOptionPane.INFORMATION_MESSAGE);
				new InventoryMenu();
				mainFrame.dispose();
		
		}
		
		if(e.getSource().equals(cancelButton)) {
			new InventoryMenu();
			mainFrame.dispose();
		}
		
	}
	
}
