package CommuV2;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;

public class UI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Graphics g; 

	public void initUI() {
		this.setSize(1000, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout();
		this.setLayout(flow);


		this.setVisible(true);
		
		this.g= this.getGraphics();

	}

	

}
