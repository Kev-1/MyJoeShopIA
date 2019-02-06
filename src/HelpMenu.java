import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelpMenu implements ActionListener {
	private JFrame mainFrame;
	private JLabel lblTitle1, lblTitle2, lblTitle3, lblTitle4;
	private JLabel lblDesc1, lblDesc2, lblDesc3, lblDesc4, lblTitle;
	private JButton backButton;
	private JPanel mainPanel, pnlTitle, pnlButtons;
	
	public HelpMenu() {
		mainFrame = new JFrame();
		
		mainFrame.setSize(480, 360);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setTitle("Help and Support");
		
		lblTitle2 = new JLabel("What if I want to change the storage type?");
		lblDesc2 = new JLabel("Delete option.txt in the /data folder, and then select local. The data in the cloud is no longer accessible.");
		
		lblTitle3 = new JLabel("Is cloud storage suitable for me?");
		lblDesc3 = new JLabel("Depends. If you have good internet connection and require syncing to multiple devices, then yes. Local storage is best for offline use.");
		
		lblTitle4 = new JLabel("The GUI does not appear in OS X");
		lblDesc4 = new JLabel("Resize the program a bit everytime, this is a problem with macOS and Java, it cannot be solved immidiately.");
		
		lblTitle1 = new JLabel("What if the program freeze?");
		lblDesc1 = new JLabel("Wait for the program to load, if it freezes, it is usually caused by the program not being able to connect to the database!");
		
		lblTitle = new JLabel("Help and Support");
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(12,1));
		mainPanel.add(lblTitle1);
		mainPanel.add(lblDesc1);
		mainPanel.add(new JPanel());
		mainPanel.add(lblTitle2);
		mainPanel.add(lblDesc2);
		mainPanel.add(new JPanel());
		mainPanel.add(lblTitle3);
		mainPanel.add(lblDesc3);
		mainPanel.add(new JPanel());
		mainPanel.add(lblTitle4);
		mainPanel.add(lblDesc4);
		
		
		pnlTitle = new JPanel();
		pnlTitle.add(lblTitle);
		pnlButtons = new JPanel();
		
		pnlTitle.add(lblTitle);
		backButton = new JButton("Back");
		
		pnlButtons.setLayout(new GridLayout(1,3));
		pnlButtons.add(new JPanel());
		pnlButtons.add(backButton);
		pnlButtons.add(new JPanel());
		mainPanel.add(pnlButtons);
		mainFrame.add(new JPanel(), "West");
		mainFrame.add(new JPanel(), "East");
		mainFrame.add(new JPanel(), "South");
		mainFrame.add(pnlTitle, "North");
		mainFrame.add(mainPanel, "Center");
		
		backButton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(backButton)) {
			mainFrame.dispose();
		}
		
	}
}
