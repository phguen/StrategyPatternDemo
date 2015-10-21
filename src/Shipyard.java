import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import c_ConcreteStrategies.NoProtection;
import c_ConcreteStrategies.ProtectWithDoubleShield;
import c_ConcreteStrategies.ProtectWithFrontShield;
import c_ConcreteStrategies.ProtectWithFullShield;
import a_Context.BoringStandardShip;
import a_Context.Spaceship;
import a_Context.SuperDuperShip;


public class Shipyard extends JPanel implements ActionListener {
	public Spaceship spaceship = new BoringStandardShip();
	private Image background;
	private int x = 0;
	
	public Shipyard() {
		try {
			background = ImageIO.read(new File(System.getProperty("user.dir") + "\\background.png"));
			Timer bgTimer = new Timer(1000/60, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					moveBackground();
					repaint();
				}
			});
			bgTimer.start();
		} catch(Exception e) {
			background = null;
		}
	}
	protected void moveBackground() {
		if(this.x == -230) {
			// Todo: repeat Background
			this.x = 0;
		} else {
			this.x--;
		}
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.background, this.x, 0, null);
		Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(4));
	    g2.setColor(new Color(255255255));
		spaceship.paint(g2);
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
