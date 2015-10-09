import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class App {

	public static void main(String[] args) {
		JFrame f = new JFrame("Raumschiffswerft");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout( new java.awt.BorderLayout() );
		
		
		
		Shipyard sy = new Shipyard();
		
		
		JPanel buttons = new JPanel();
		
		JButton btnDoubleShield = new JButton("Double Shield");
		btnDoubleShield.addActionListener(sy);
		buttons.add(btnDoubleShield);
		
		JButton btnFullShield = new JButton("Full Shield");
		btnFullShield.addActionListener(sy);
		buttons.add(btnFullShield);
		
		JButton btnFrontShield = new JButton("Front Shield");
		btnFrontShield.addActionListener(sy);
		buttons.add(btnFrontShield);
		
		JButton btnNoShield = new JButton("No Shield");
		btnNoShield.addActionListener(sy);
		buttons.add(btnNoShield);
		
		JButton btnShip1 = new JButton("Ship 1");
		btnShip1.addActionListener(sy);
		buttons.add(btnShip1);
		
		JButton btnShip2 = new JButton("Ship 2");
		btnShip2.addActionListener(sy);
		buttons.add(btnShip2);
		
		mainPanel.add(buttons, java.awt.BorderLayout.PAGE_START);
		mainPanel.add(sy, java.awt.BorderLayout.CENTER);

		f.add(mainPanel);
		
		f.setSize(580, 580);
		f.setVisible(true);
	}
}
