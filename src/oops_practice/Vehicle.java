package oops_practice;

public class Vehicle {
	
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	void start() {
		System.out.println("Vehicle is starting...");
	}
	void stop() {
		System.out.println("Vechicle is stopping...");
	}

}
