import java.awt.Graphics;


public class ProtectWithFullShield implements ProtectBehavior {
	public void protect(Graphics g) {
		g.drawOval(230, 230, 100, 100);
	}
}
