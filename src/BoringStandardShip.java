import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.Console;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;




public class BoringStandardShip extends Spaceship {

	BoringStandardShip(Graphics g) {
		super(g);
		Image img;
		try {
			img = ImageIO.read(new File(System.getProperty("user.dir") + "\\spaceship.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			img = null;
			e.printStackTrace();
		}
		System.out.println();
		g.drawImage(img, 250, 250, null);
		protectBehavior = new ProtectWithFullShield();
	}
}
