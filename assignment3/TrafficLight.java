package assignment3;

public class TrafficLight {
	String color;
	int duration;
	
	public void changecolor(String color,int duration) {
		this.color=color;
		this.duration=duration;
	}
	public boolean isGreen() {
		return (this.color).equals("Green");
		
	}
	public void changecolor1(String color,int duration) {
		this.color=color;
		this.duration=duration;
	}
	public boolean isRed() {
		return (this.color).equals("Red");
		
	}
	public static void main(String[] args) {
		TrafficLight t = new TrafficLight();
		t.color="Red";
		t.duration=3;
		System.out.println("Is Green "+t.isGreen());
		System.out.println("Is Red "+t.isRed());
	}
}
