package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import uniShop.*;

public class AdListFrame extends JFrame {
	
	private JPanel mainPanel = new JPanel();
	
	private JPanel adsPanel = new JPanel();
	private JScrollPane adsScrollPane = new JScrollPane();
	
	private ArrayList<Ad> ads = new ArrayList<>();
	
	private String title;
	
	private Registered currUser;
	private LocalDataBase db;
	
	public AdListFrame(ArrayList<Ad> ads, String title, Registered user, LocalDataBase db) {
		this.ads = ads;
		this.title = title;
		this.currUser = user;
		this.db = db;
		
		//Ads Panel
		setupAdsPanel();
		
		//Main Panel
		setupMainPanel();
		
		//Frame Properties
		setupFrameProperties();
	}
	
	private void setupAdsPanel() {

		creatingAdsPanel();
		
		adsScrollPane.setBounds(5, 5, 955, 620);
		adsScrollPane.setViewportView(adsPanel);
		adsScrollPane.getVerticalScrollBar().setUnitIncrement(16); //increase scroll speed
		mainPanel.add(adsScrollPane);
	}
	
	private void creatingAdsPanel() {
		
		adsPanel.setPreferredSize(new Dimension(937, ads.size()*(10+150)-10));
		adsPanel.setLayout(null);
		
		AdPanel adPanel;
		int height = 0;
		for(Ad currAd : ads) {
			if(this.title.equals("My Ads"))
				adPanel = new AdPanel(currAd, db);
			else
				adPanel = new AdPanelRegistered(currAd, currUser, db);
			adPanel.setBounds(0, height, adPanel.getWidth(), adPanel.getHeight());
			adsPanel.add(adPanel);
			
			height += adPanel.getHeight()+10;
		}
	}
	
	private void setupMainPanel() {
		mainPanel.setLayout(null);
		this.setContentPane(mainPanel);
	}
	
	private void setupFrameProperties() {
		this.setResizable(false);
		this.setTitle(this.title);
		this.setVisible(true);
		this.setSize(980, 665);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		//this.setIconImage(new ImageIcon(this.getClass().getResource("/images/shopping-bags-512.png")).getImage());
	}
}
