package a_Context;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;




public class BoringStandardShip extends Spaceship {

	public BoringStandardShip() {
		super();
		try {
			img = ImageIO.read(new File(System.getProperty("user.dir") + "\\spaceship.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			img = null;
			e.printStackTrace();
		}
	}
}
