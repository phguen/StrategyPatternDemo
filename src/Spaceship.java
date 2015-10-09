import java.awt.Graphics;
import java.awt.Image;


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
