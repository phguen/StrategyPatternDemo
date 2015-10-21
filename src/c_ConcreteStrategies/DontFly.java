package c_ConcreteStrategies;
import java.awt.Graphics;

import b_Strategy.FlyBehavior;


public class DontFly implements FlyBehavior {

	@Override
	public void fly(Graphics g) {
		// Don't fly
	}
}
