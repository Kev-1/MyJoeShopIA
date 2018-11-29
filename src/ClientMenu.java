import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientMenu implements ActionListener {
	private JButton addClient, backButton, btnSetAsCompleted1, btnSetAsCompleted2;
	private JButton btnModify2, btnModify1;
	private JFrame mainFrame;
	private JLabel lblInventory, lblWelcome;
	
	private JPanel pnlLeft, pnlRight, pnlTitle;
	private JPanel pnlLeftItemDetail1, pnlLeftItemDetail2;
	private JButton pnlLeftButtonDetail1, pnlLeftButtonDetail2;
	
	public ClientMenu() {
		
		mainFrame = new JFrame();
		lblInventory = new JLabel("Inventory");
		lblWelcome = new JLabel("Inventory");
		
		pnlTitle = new JPanel();
		pnlLeft = new JPanel();
		pnlRight = new JPanel();
		
		pnlLeftItemDetail1 = new JPanel();
		pnlLeftItemDetail1 = new JPanel();
		pnlLeftButtonDetail1 = new JButton();
		pnlLeftButtonDetail1 = new JButton();
		
		
		mainFrame.setSize(640, 480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setLocationRelativeTo(null);
		
		JPanel pnlTitleUpper = new JPanel();
		pnlTitleUpper.add(lblInventory);
		pnlTitle.add(pnlTitleUpper, "North");
		
		JPanel pnlTitleLower = new JPanel();
		pnlTitleLower.add(lblWelcome);
		pnlTitle.add(pnlTitleLower, "Center");
		
		pnlLeftItemDetail1.add(new JLabel("Name:"));
		pnlLeftItemDetail1.add(new JLabel("Item Ordered:"));
		pnlLeftItemDetail1.add(new JLabel("Expected Due:"));
		pnlLeftItemDetail1.add(new JLabel("Payment Due:"));
		
		pnlLeftButtonDetail1.add(btnSetAsCompleted1);
		pnlLeftButtonDetail1.add(btnModify1);
		
		
		pnlLeftItemDetail2.add(new JLabel("Name:"));
		pnlLeftItemDetail2.add(new JLabel("Item Ordered:"));
		pnlLeftItemDetail2.add(new JLabel("Expected Due:"));
		pnlLeftItemDetail2.add(new JLabel("Payment Due:"));
		
		pnlLeftButtonDetail2.add(btnSetAsCompleted2);
		pnlLeftButtonDetail2.add(btnModify2);
		
		pnlLeft.add(new JLabel("Current Clients"));
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(pnlLeftItemDetail1);
		pnlLeft.add(pnlLeftButtonDetail1);
		pnlLeft.add(new JPanel());
		
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(new JPanel());
		pnlLeft.add(pnlLeftItemDetail2);
		pnlLeft.add(pnlLeftButtonDetail2);
		pnlLeft.add(new JPanel());
		
		pnlRight.setLayout(new GridLayout(3, 5));
		pnlRight.add(addClient);
		pnlRight.add(backButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
