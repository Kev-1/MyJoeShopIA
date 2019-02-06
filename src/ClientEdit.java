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

public class ClientEdit implements ActionListener {
	private JFrame mainFrame;
	private JTextField clientName, clientAddress, clientPhoneNumber, clientItem;
	private JButton acceptButton, cancelButton;
	private JPanel pnlCenter, pnlTitle, pnlButtons;
	private JLabel lblName, lblAddress, lblPhoneNumber, lblTitle, lblItem;
	private String mode;
	
	public ClientEdit(String editName, String editAddress, String editItem, String editPhone) {
		mainFrame = new JFrame("MyJoeShop > Add Inventory");
		clientName = new JTextField();
		clientAddress = new JTextField();
		clientPhoneNumber = new JTextField();
		clientItem = new JTextField();
		
		if(editName != null) {
			clientName.setText(editName);
			clientAddress.setText(editAddress);
			clientPhoneNumber.setText(editPhone);
			clientItem.setText(editItem);
		}
	
		lblName = new JLabel("Name of Client: ");
		lblAddress = new JLabel("Address of Client: ");
		lblPhoneNumber = new JLabel("Phone Number of Client:");
		lblTitle = new JLabel("Add Client to List: ");
		lblItem = new JLabel("Item ordered by Client: ");
		
		acceptButton = new JButton("Add");
		cancelButton = new JButton("Cancel");
		
		pnlCenter = new JPanel();
		pnlTitle = new JPanel();
		pnlButtons = new JPanel();
		
		mainFrame.setVisible(true);
		mainFrame.setSize(480, 360);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		
		pnlTitle.add(lblTitle);
		
		pnlButtons.setLayout(new GridLayout(1,4));
		pnlButtons.add(new JPanel());
		pnlButtons.add(acceptButton);
		pnlButtons.add(cancelButton);
		pnlButtons.add(new JPanel());
		
		pnlCenter.setLayout(new GridLayout(10,2));
		pnlCenter.add(lblName);
		pnlCenter.add(clientName);
		pnlCenter.add(lblAddress);
		pnlCenter.add(clientAddress);
		pnlCenter.add(lblPhoneNumber);
		pnlCenter.add(clientPhoneNumber);
		pnlCenter.add(lblItem);
		pnlCenter.add(clientItem);
		pnlCenter.add(new JPanel());
		pnlCenter.add(pnlButtons);
		
		
		mainFrame.add(new JPanel(), "West");
		mainFrame.add(new JPanel(), "East");
		mainFrame.add(new JPanel(), "South");
		mainFrame.add(pnlCenter, "Center");
		mainFrame.add(pnlTitle, "North");
		
		cancelButton.addActionListener(this);
		acceptButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(acceptButton)) {
			mode = new String();
			DBConnection con = new DBConnection();
			String sqlName = clientName.getText();
			String sqlAddress = clientAddress.getText();
			String sqlPhoneNumber = clientPhoneNumber.getText();
			String sqlItem = clientItem.getText();
			String queryInsert = "INSERT INTO client VALUES('"+sqlName+"','"+sqlAddress+"','"+sqlItem+"','"+sqlPhoneNumber+"')";
			con.executeQuery(queryInsert);
			JOptionPane.showMessageDialog(null, "Added to database!", "Success", JOptionPane.INFORMATION_MESSAGE);
			new ClientMenu();
			mainFrame.dispose();
		}
		
		if(e.getSource().equals(cancelButton)) {
			new ClientMenu();
			mainFrame.dispose();
		}
		
	}
	
}
