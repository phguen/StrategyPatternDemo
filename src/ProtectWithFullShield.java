import java.awt.Graphics;


public class ProtectWithFullShield implements ProtectionBehavior {
	public void protect(Graphics g) {
		g.drawOval(230, 230, 100, 100);
	}
}
