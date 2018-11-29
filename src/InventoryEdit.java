import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InventoryEdit implements ActionListener {
	private JFrame mainFrame;
	private JTextField itemName, itemQty, itemDescription, itemType;
	private JButton acceptButton, cancelButton;
	private JPanel pnlCenter, pnlTitle, pnlButtons;
	private JLabel lblName, lblQty, lblDescription, lblTitle, lblType;
	
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
		
		acceptButton = new JButton("Accept");
		cancelButton = new JButton("Cancel");
		
		pnlCenter = new JPanel();
		pnlTitle = new JPanel();
		pnlButtons = new JPanel();
		
		mainFrame.setVisible(true);
		mainFrame.setSize(640, 480);
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
		
		cancelButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(acceptButton)) {
			//file save!
		}
		
		if(e.getSource().equals(cancelButton)) {
			new InventoryMenu();
			mainFrame.dispose();
		}
		
	}
	
}
