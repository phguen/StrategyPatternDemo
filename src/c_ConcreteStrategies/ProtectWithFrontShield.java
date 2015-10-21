package c_ConcreteStrategies;
import java.awt.Graphics;

import b_Strategy.ProtectionBehavior;


public class ProtectWithFrontShield implements ProtectionBehavior {
	public void protect(Graphics g) {
		g.drawLine(330, 250, 330, 310);
	}
}
