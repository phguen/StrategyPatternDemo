import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SuperDuperShip extends Spaceship {

	SuperDuperShip() {
		super();
		try {
			img = ImageIO.read(new File(System.getProperty("user.dir") + "\\spaceship_super_duper.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			img = null;
			e.printStackTrace();
		}
	}
}