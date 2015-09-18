import java.awt.Graphics;


public abstract class Spaceship {
	FlyBehavior flyBehavior;
	ShootBehavior shootBehavior;
	ProtectBehavior protectBehavior;
	Graphics g;
	Spaceship(Graphics g) {
		this.g = g;
	}
	public void paint() {
		
	}
	public void fly() {
		flyBehavior.fly(g);
	}
	public void shoot() {
		shootBehavior.shoot(g);
	}
	public void protect() {
		protectBehavior.protect(g);
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setShootBehavior(ShootBehavior sb) {
		shootBehavior = sb;
	}
	public void setProtectBehavior(ProtectBehavior pb) {
		protectBehavior = pb;
	}
}
