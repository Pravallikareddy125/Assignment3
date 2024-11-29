package assignment3;

public class Vehicle {
	    String make;
	    String model;
	    int year;

	    public Vehicle(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public void displayDetails() {
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	}

	class Car extends Vehicle {
	    double trunkSize;

	    public Car(String make, String model, int year, double trunkSize) {
	        super(make, model, year);
	        this.trunkSize = trunkSize;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
	    }
	}

	class Truck extends Vehicle {
	    double payloadCapacity;

	    public Truck(String make, String model, int year, double payloadCapacity) {
	        super(make, model, year);
	        this.payloadCapacity = payloadCapacity;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
	    }

	    public static void main(String[] args) {
	        Car c = new Car("Telsa", "Cyber truck", 2023, 12.1);
	        Truck truck = new Truck("Mahindra", "Xuv300", 2023, 2300);

	        System.out.println("Car Details:");
	        c.displayDetails();
	        
	        System.out.println("\nTruck Details:");
	        truck.displayDetails();
	    }
	}

