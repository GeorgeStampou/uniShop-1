package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uniShop.*;

/*	User Interface of the system's home screen
 * 	displayed on a Premium User 
 * 	Input : ArrayList of String with the server's tags of the system
 * 			ArrayList of Ads given by the system for display on the screen
 */

public class HomeScreen_Premium extends HomeScreen_Registered {

	protected JButton viewPremiumPlanButton;
	
	protected Premium currUser;
	
	public HomeScreen_Premium(LocalDataBase db, Premium user) {
		super(db, user);
		this.currUser = user;
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
				
				String message = "You are on tier: " + currUser.getTier(); 
				
				JOptionPane.showMessageDialog(mainPanel, message);
			}
		});
		this.getContentPane().add(viewPremiumPlanButton);		
		
	}
	
	@Override
	protected void creatingNewAdListener() {
		createNewAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new CreateNewAdPrem();
			}
		});
	}
	
	protected void upgradeToPremiumPlan(JFrame currentFrame) {
		
		currUser.setTier(currUser.getTier()+1);
		String message = "Your premium plan has update on tier " + currUser.getTier(); 
		
		JOptionPane.showMessageDialog(mainPanel, message);
		
		if(currUser.getTier() == 2) {
			this.upgradePremiumPlanButton.setEnabled(false);
			currentFrame.revalidate();
		}
	}
}
