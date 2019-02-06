 	import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import database.DBConnection;
import database.RAF;

public class ClientMenu implements ActionListener {
	private JButton addClient, backButton, btnSetAsCompleted1, btnSetAsCompleted2, btnModify2, btnModify1;
	private JFrame mainFrame;
	private JLabel lblInventory, lblWelcome;
	private JLabel name1, item1, phone1, address1;
	private JLabel name2, item2, phone2, address2;
	
	private JPanel pnlLeft, pnlRight, pnlTitle, pnlCenter;
	private JPanel pnlLeftItemDetail1, pnlLeftItemDetail2;
	private JPanel pnlLeftButtonDetail1, pnlLeftButtonDetail2;
	
	private static final String OPTION_PATH = "data/option.txt";
	
	public ClientMenu() {
		//initialize
				mainFrame = new JFrame("MyJoeShop > Clients");
				lblInventory = new JLabel("MyJoeShop");
				
				String time = "";
				Calendar calendar = Calendar.getInstance();
				time = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE);
				lblWelcome = new JLabel("Welcome back! The current time is " + time);
				
				pnlTitle = new JPanel(new BorderLayout());
				pnlCenter = new JPanel(new BorderLayout());
				pnlLeft = new JPanel(new GridLayout(4, 3));
				pnlLeftItemDetail1 = new JPanel(new GridLayout(4, 1));
				pnlLeftButtonDetail1 = new JPanel(new GridLayout(2, 1));
				pnlLeftItemDetail2 = new JPanel (new GridLayout(4, 1));
				pnlLeftButtonDetail2 = new JPanel(new GridLayout(2, 1));
				pnlRight = new JPanel(new GridLayout(10	, 2));
				
				btnSetAsCompleted1 = new JButton("Set as complete");
				btnModify1 = new JButton("Modify client order");
				
				btnSetAsCompleted2 = new JButton("Set as complete");
				btnModify2 = new JButton("Modify client order");
				
				addClient = new JButton("Add Client");
				backButton = new JButton("Back");
				
				mainFrame.setSize(640, 480);
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
				mainFrame.setLocationRelativeTo(null);
				mainFrame.setResizable(false);
				
				JPanel pnlTitleUpper = new JPanel();
				pnlTitleUpper.add(lblInventory);
				pnlTitle.add(pnlTitleUpper, "North");
				
				JPanel pnlTitleLower = new JPanel();
				pnlTitleLower.add(lblWelcome);
				pnlTitle.add(pnlTitleLower, "Center");
				
				name1 = new JLabel("Name:");
				pnlLeftItemDetail1.add(name1);
				item1 = new JLabel("Item Ordered:");
				pnlLeftItemDetail1.add(item1);
				address1 = new JLabel("Address: ");
				pnlLeftItemDetail1.add(address1);
				phone1 = new JLabel("Phone No:");
				pnlLeftItemDetail1.add(phone1);
				
				pnlLeftButtonDetail1.add(btnSetAsCompleted1);
				pnlLeftButtonDetail1.add(btnModify1);
				
				name2 = new JLabel("Name:");
				pnlLeftItemDetail2.add(name2);
				item2 = new JLabel("Item Ordered:");
				pnlLeftItemDetail2.add(item2);
				address2 = new JLabel("Address: ");
				pnlLeftItemDetail2.add(address2);
				phone2 = new JLabel("Phone No:");
				pnlLeftItemDetail2.add(phone2);
				
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
				
				JPanel pnlLblActions = new JPanel();
				pnlLblActions.add(new JLabel("Actions"));
				pnlRight.add(pnlLblActions);
				pnlRight.add(new JPanel());
				
				pnlRight.add(new JPanel());
				pnlRight.add(new JPanel());
				
				pnlRight.add(addClient);
				pnlRight.add(new JPanel());
				
				pnlRight.add(new JPanel());
				pnlRight.add(new JPanel());
				
				pnlRight.add(backButton);
				pnlRight.add(new JPanel());
				
				pnlRight.add(new JPanel());
				pnlRight.add(new JPanel());
				pnlRight.add(new JPanel());
				pnlRight.add(new JPanel());
				
				pnlRight.add(new JPanel());
				pnlRight.add(new JPanel());
				
				pnlCenter.add(pnlLeft,"Center");
				pnlCenter.add(pnlRight,"East");
				pnlCenter.add(new JPanel(),"West");
				pnlCenter.add(new JPanel(),"South");
				
				mainFrame.add(pnlTitle,"North");
				mainFrame.add(pnlCenter,"Center");
				
				//DB retrieve data!
				byte[] data = RAF.readFromFile(ClientMenu.OPTION_PATH, 0, 10);
				String storageOption = new String();
				if (new String(data).trim().equals("database") == true) {	
					DBConnection con = new DBConnection();
					String query = "SELECT * FROM client";
					ResultSet result = con.executeGet(query);
					try {
						while(result.next()) {
							name1.setText("Name: " + result.getString("name"));
							item1.setText("Item ordered: " + result.getString("item"));
							address1.setText("Address: " + result.getString("address"));
							phone1.setText("Phone Number: " + result.getString("contact"));
						}
						while(result.next()) {
							name2.setText("Name: " + result.getString("name"));
							item2.setText("Item ordered: " + result.getString("item"));
							address2.setText("Address: " + result.getString("address"));
							phone2.setText("Phone Number: " + result.getString("contact"));
						}
					} catch (SQLException e) {
					e.printStackTrace();
				}
				}
		
				//ADD ACTION LISTENER
				backButton.addActionListener(this);
				addClient.addActionListener(this);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(backButton)) {
					new SummaryMenu();
					mainFrame.dispose();
				}
				
				if(e.getSource().equals(addClient)) {
					new ClientEdit();
					mainFrame.dispose();
				}
			}
	
}
