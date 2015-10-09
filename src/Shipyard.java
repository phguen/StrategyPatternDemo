import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Shipyard extends JPanel implements ActionListener {
	public Spaceship spaceship = new BoringStandardShip();

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		spaceship.paint(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Double Shield")) {
			spaceship.setProtectionBehavior(new ProtectWithDoubleShield());
		}
		if(e.getActionCommand().equals("Full Shield")) {
			spaceship.setProtectionBehavior(new ProtectWithFullShield());
		}
		if(e.getActionCommand().equals("Front Shield")) {
			spaceship.setProtectionBehavior(new ProtectWithFrontShield());
		}
		if(e.getActionCommand().equals("No Shield")) {
			spaceship.setProtectionBehavior(new NoProtection());
		}
		if(e.getActionCommand().equals("Ship 1")) {
			this.spaceship = new BoringStandardShip();
		}
		if(e.getActionCommand().equals("Ship 2")) {
			this.spaceship = new SuperDuperShip();
		}
		this.repaint();
	}

}
