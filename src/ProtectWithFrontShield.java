import java.awt.Graphics;


public class ProtectWithFrontShield implements ProtectBehavior {
	public void protect(Graphics g) {
		g.drawLine(50, 0, 50, 50);;
	}
}
