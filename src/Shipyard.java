import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Shipyard extends JPanel {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Raumschiffswerft");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Shipyard sy = new Shipyard();
		JButton btnFrontShield = new JButton("Front Shield");
		sy.add(btnFrontShield);
		
		f.add(sy);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		BoringStandardShip bss = new BoringStandardShip(g);
		bss.protect();
		bss.setProtectBehavior(new ProtectWithFrontShield());
		bss.protect();
	}

}
