package assignment3;

public class ShapeTest {
		public static void main(String[] args) {
			
			Shape rect = new Rectangle(5, 3);
			System.out.println("area is: "+ rect.area());
			System.out.println("perimeter is: "+ rect.perimeter());
			
			Shape cir = new Circle(6);
			System.out.println("area is: "+ cir.area());
			System.out.println("perimeter is: "+ cir.perimeter());
			
			Shape sh = new Triangle(3, 4, 5);
			System.out.println("area is: "+ sh.area());
			System.out.println("perimeter is: "+ sh.perimeter());
		}

	}

