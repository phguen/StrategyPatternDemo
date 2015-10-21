package c_ConcreteStrategies;
import java.awt.Graphics;

import b_Strategy.ProtectionBehavior;


public class ProtectWithFullShield implements ProtectionBehavior {
	public void protect(Graphics g) {
		g.drawOval(230, 230, 100, 100);
	}
}
