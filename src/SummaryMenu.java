import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SummaryMenu {
	//Initialize main stuff
	
	private JFrame mainFrame;
	private JButton clientButton, inventoryButton;
	private JLabel title;
	
	//Initialize border layout
	private JPanel pnlEast, pnlNorth, pnlWest, pnlCenter;
	
	SummaryMenu() {
		//initialization
		mainFrame = new JFrame();
		title = new JLabel();
		clientButton = new JButton();
		inventoryButton = new JButton();
		pnlEast = new JPanel();
		pnlWest = new JPanel();
		pnlNorth = new JPanel();
		pnlCenter = new JPanel();
		
		//set attributes
		mainFrame.setSize(640, 480);
		mainFrame.setVisible(true);
		mainFrame.setTitle("MyJoeShop");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		title.setText("MyJoeShop");
		title.setVisible(true);
	
		clientButton.setText("Client");
		clientButton.addActionListener(null);
		
		inventoryButton.setText("Inventory");
		inventoryButton.addActionListener(null);
		
		mainFrame.add(pnlEast, BorderLayout.EAST);
		mainFrame.add(pnlWest, BorderLayout.WEST);
		mainFrame.add(pnlCenter, BorderLayout.CENTER);
		mainFrame.add(pnlNorth, BorderLayout.NORTH);
		mainFrame.add(new JPanel(), BorderLayout.SOUTH);
		
		pnlNorth.add(title);
		pnlNorth.setVisible(true);
		
		
	}
}
