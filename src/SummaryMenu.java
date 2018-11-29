import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SummaryMenu implements ActionListener {
	
	//add attributes on private!
	private JFrame mainFrame;
	private JLabel lblTitle,lblWelcome;
	private JPanel pnlTitle, pnlCenter, pnlLeft, pnlRight;
	
	private JPanel pnlLeftItemDetail1, pnlLeftButtonDetail1;
	private JButton btnSetAsComplete1, btnModify1;
	
	private JPanel pnlLeftItemDetail2, pnlLeftButtonDetail2;
	private JButton btnSetAsComplete2, btnModify2;
	
	private JButton btnClients, btnInventory, btnReload, btnExit;
	
	public SummaryMenu() {
		
		//initialize
		mainFrame = new JFrame("MyJoeShop > Main Menu");
		lblTitle = new JLabel("MyJoeShop");
		
		String time = "";
		Calendar calendar = Calendar.getInstance();
		time = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE);
		lblWelcome = new JLabel("Welcome back! The current time is " + time);
		
		pnlTitle = new JPanel(new BorderLayout());
		pnlCenter = new JPanel(new BorderLayout());
		pnlLeft = new JPanel(new GridLayout(4, 3));
		pnlLeftItemDetail1 = new JPanel(new GridLayout(4, 1));
		pnlLeftButtonDetail1 = new JPanel(new GridLayout(2, 1));
		pnlLeftItemDetail2 = new JPanel(new GridLayout(4, 1));
		pnlLeftButtonDetail2 = new JPanel(new GridLayout(2, 1));
		pnlRight = new JPanel(new GridLayout(10	, 2));
		
		btnSetAsComplete1 = new JButton("Set as complete");
		btnModify1 = new JButton("Modify client order");
		
		btnSetAsComplete2 = new JButton("Set as complete");
		btnModify2 = new JButton("Modify client order");
		
		btnClients = new JButton("Clients");
		
		btnInventory = new JButton("Inventory");
		btnReload = new JButton("Reload");
		btnExit = new JButton("Exit");
		
		mainFrame.setSize(640, 480);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setLocationRelativeTo(null);
		
		JPanel pnlTitleUpper = new JPanel();
		pnlTitleUpper.add(lblTitle);
		pnlTitle.add(pnlTitleUpper, "North");
		
		JPanel pnlTitleLower = new JPanel();
		pnlTitleLower.add(lblWelcome);
		pnlTitle.add(pnlTitleLower, "Center");
		
		pnlLeftItemDetail1.add(new JLabel("Name:"));
		pnlLeftItemDetail1.add(new JLabel("Item Ordered:"));
		pnlLeftItemDetail1.add(new JLabel("Expected Due:"));
		pnlLeftItemDetail1.add(new JLabel("Payment Due:"));
		
		pnlLeftButtonDetail1.add(btnSetAsComplete1);
		pnlLeftButtonDetail1.add(btnModify1);
		
		
		pnlLeftItemDetail2.add(new JLabel("Name:"));
		pnlLeftItemDetail2.add(new JLabel("Item Ordered:"));
		pnlLeftItemDetail2.add(new JLabel("Expected Due:"));
		pnlLeftItemDetail2.add(new JLabel("Payment Due:"));
		
		pnlLeftButtonDetail2.add(btnSetAsComplete2);
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
		
		
		JPanel pnlLblActions = new JPanel();
		pnlLblActions.add(new JLabel("Actions"));
		pnlRight.add(pnlLblActions);
		pnlRight.add(new JPanel());
		
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		
		pnlRight.add(btnClients);
		pnlRight.add(new JPanel());
		
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		
		pnlRight.add(btnInventory);
		pnlRight.add(new JPanel());
		
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		
		pnlRight.add(new JPanel());
		pnlRight.add(new JPanel());
		
		pnlRight.add(btnReload);
		pnlRight.add(new JPanel());
		
		pnlRight.add(btnExit);
		pnlRight.add(new JPanel());
		
		pnlCenter.add(pnlLeft,"Center");
		pnlCenter.add(pnlRight,"East");
		pnlCenter.add(new JPanel(),"West");
		pnlCenter.add(new JPanel(),"South");
		
		mainFrame.add(pnlTitle,"North");
		mainFrame.add(pnlCenter,"Center");
		
		//ADD ACTION LISTENER
		btnClients.addActionListener(this);
		btnExit.addActionListener(this);
		btnInventory.addActionListener(this);
		btnReload.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnExit)) {
			System.exit(0);
		}
		
		if(e.getSource().equals(btnInventory)) {
			new InventoryMenu();
			mainFrame.dispose();
		}
		if(e.getSource().equals(btnClients)) {
			new ClientMenu();
			mainFrame.dispose();
		}
		if(e.getSource().equals(btnReload)) {
			new SummaryMenu();
			mainFrame.dispose();
		}
	}
}
