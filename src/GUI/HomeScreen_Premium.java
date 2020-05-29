package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*	User Interface of the system's home screen
 * 	displayed on a Premium User 
 * 	Input : ArrayList of String with the server's tags of the system
 * 			ArrayList of Ads given by the system for display on the screen
 */

public class HomeScreen_Premium extends HomeScreen_Registered {

	protected JButton viewPremiumPlanButton;
	
	public HomeScreen_Premium(ArrayList<String> tags, ArrayList<String> ads) {
		super(tags, ads);
	}
	
	protected void setupTopButtons() {
		super.setupTopButtons();
		
		addButton();
	}

	protected void addButton() {
		
		//View Premium Plan Button Section
		viewPremiumPlanButton = new JButton("View Premium Plan");
		viewPremiumPlanButton.setSize(150, 20);
		viewPremiumPlanButton.setLocation(wishListButton.getX()-viewPremiumPlanButton.getWidth()-gap, gap);
		viewPremiumPlanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tier = 0+1;
				String message = "You are on tier: " + tier; 
				
				JOptionPane.showMessageDialog(mainPanel, message);
			}
		});
		this.getContentPane().add(viewPremiumPlanButton);		
		
	}
	
	protected void upgradeToPremiumPlan(JFrame currentFrame) {
		
		int tier = 0+1;
		String message = "Your premium plan has update on tier " + tier; 
		
		JOptionPane.showMessageDialog(mainPanel, message);
	}

}