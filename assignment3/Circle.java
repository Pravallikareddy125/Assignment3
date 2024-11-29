package assignment3;

public class Circle {
	 static int radius=10;
	 
	 static void circle() {
		    double area=Math.PI*radius*radius;
			double area1=Math.PI*Math.pow(radius, 2);
			
			double circumference=2*Math.PI*radius;
			
			System.out.println(area);
			System.out.println(area1);
			System.out.println(circumference);
	 }
	 

	public static void main(String[] args) {

		circle();		

	}

}
