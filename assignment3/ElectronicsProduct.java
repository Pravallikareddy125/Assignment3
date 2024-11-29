package assignment3;

public class ElectronicsProduct {
			  String productID;
			    String name;
			    double price;

			    public ElectronicsProduct(String productID, String name, double price) {
			        this.productID = productID;
			        this.name = name;
			        this.price = price;
			    }

			    public double applyDiscount(double discountPercentage) {
			        double discountAmount = price * (discountPercentage / 100);
			        price -= discountAmount;
			        return price;
			    }

			    public double calculateFinalPrice() {
			        return price;
			    }

			    public void displayDetails() {
			        System.out.println("Product ID: " + productID);
			        System.out.println("Product Name: " + name);
			        System.out.println("Price: ₹" + price);
			    }
			}

			class WashingMachine extends ElectronicsProduct {
			    int warrantyPeriod;  

			    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
			        super(productID, name, price);
			        this.warrantyPeriod = warrantyPeriod;
			    }

			    public void extendWarranty(int additionalMonths) {
			        warrantyPeriod += additionalMonths;
			        System.out.println("Warranty extended by " + additionalMonths + " months.");
			    }

			    @Override
			    public void displayDetails() {
			        super.displayDetails();
			        System.out.println("Warranty Period: " + warrantyPeriod + " months");
			    }

			    public static void main(String[] args) {
			        WashingMachine w = new WashingMachine("IMA22", "SMARTAI Washing Machine", 50000, 26);
			        
			        System.out.println("Before Discount:");
			        w.displayDetails();

			        double finalPrice = w.applyDiscount(10);
			        System.out.println("Price after 10% Discount: ₹" + finalPrice);

			        w.extendWarranty(12);

			        System.out.println("\nAfter Warranty Extension:");
			        w.displayDetails();
			    }
			}


