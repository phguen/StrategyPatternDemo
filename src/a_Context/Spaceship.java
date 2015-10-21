package a_Context;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import c_ConcreteStrategies.DontFly;
import c_ConcreteStrategies.DontShoot;
import c_ConcreteStrategies.NoProtection;
import b_Strategy.FlyBehavior;
import b_Strategy.ProtectionBehavior;
import b_Strategy.ShootBehavior;


public abstract class Spaceship {
	FlyBehavior flyBehavior;
	ShootBehavior shootBehavior;
	ProtectionBehavior protectionBehavior;
	Image img;
	Spaceship() {
		flyBehavior = new DontFly();
		shootBehavior = new DontShoot();
		protectionBehavior = new NoProtection();
	}
	public void paint(Graphics g) {
		g.drawImage(img, 250, 250, null);
		flyBehavior.fly(g);
		shootBehavior.shoot(g);
		protectionBehavior.protect(g);
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setShootBehavior(ShootBehavior sb) {
		shootBehavior = sb;
	}
	public void setProtectionBehavior(ProtectionBehavior pb) {
		protectionBehavior = pb;
	}
}
