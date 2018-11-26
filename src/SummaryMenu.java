import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SummaryMenu {
	//Initialize main stuff
	
	private JFrame mainFrame;
	private JButton clientButton, inventoryButton;
	private JLabel title, clientName, clientItem, clientStatus;
	
	//Initialize border layout
	private JPanel pnlNorth, pnlCenter;
	
	SummaryMenu() {
		//initialization
		mainFrame = new JFrame();
		
		title = new JLabel();
		
		clientButton = new JButton();
		inventoryButton = new JButton();
		
		clientName = new JLabel();
		clientItem = new JLabel();
		clientStatus = new JLabel();

		pnlNorth = new JPanel();
		pnlCenter = new JPanel();
		
		//set attributes
		mainFrame.setSize(640, 480);
		mainFrame.setVisible(true);
		mainFrame.setTitle("MyJoeShop");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set title static
		title.setText("MyJoeShop");
		title.setVisible(true);
		
		clientName.setText("No Clients");
		clientItem.setText("-");
		clientStatus.setText("-");
		
		//set button
		clientButton.setText("Client");
		clientButton.addActionListener(null);
		
		//set inventory
		inventoryButton.setText("Inventory");
		inventoryButton.addActionListener(null);
		
		//add panels
		mainFrame.add(new JPanel(), BorderLayout.EAST);
		mainFrame.add(new JPanel(), BorderLayout.WEST);
		mainFrame.add(pnlCenter, BorderLayout.CENTER);
		mainFrame.add(pnlNorth, BorderLayout.NORTH);
		mainFrame.add(new JPanel(), BorderLayout.SOUTH);
		
		pnlNorth.add(title);
		pnlNorth.setVisible(true);
		
		pnlCenter.setLayout(new GridLayout(3, 9));
		pnlCenter.add(new JLabel());
		pnlCenter.add(clientButton);
		pnlCenter.add(inventoryButton);
		
		pnlCenter.add(clientName);
		pnlCenter.add(clientItem);
		pnlCenter.add(clientStatus);
	}
}
