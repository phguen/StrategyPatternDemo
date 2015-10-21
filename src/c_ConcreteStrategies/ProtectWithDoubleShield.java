package c_ConcreteStrategies;
import java.awt.Graphics;


public class ProtectWithDoubleShield extends ProtectWithFullShield {
	public void protect(Graphics g) {
		super.protect(g);
		g.drawOval(220, 220, 120, 120);
	}
}