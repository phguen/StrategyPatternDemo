import java.awt.Graphics;


public class ProtectWithFrontShield implements ProtectionBehavior {
	public void protect(Graphics g) {
		g.drawLine(330, 250, 330, 310);
	}
}
