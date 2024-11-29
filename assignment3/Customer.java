package assignment3;

public class Customer {
	    String name;
	    String email;
	    double[] purchaseHistory;

	    public Customer(String name, String email, int historySize) {
	        this.name = name;
	        this.email = email;
	        this.purchaseHistory = new double[historySize];
	    }

	    public void addPurchase(double amount, int index) {
	        if (index >= 0 && index < purchaseHistory.length) {
	            purchaseHistory[index] = amount;
	        }
	    }

	    public double calculateTotalExpenditure() {
	        double total = 0;
	        for (double amount : purchaseHistory) {
	            total += amount;
	        }
	        return total;
	    }

	    public void displayCustomerInfo() {
	        System.out.println("Customer Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Total Expenditure: ₹" + calculateTotalExpenditure());
	    }
	}

	class LoyalCustomer extends Customer {
	    double discountRate;

	    public LoyalCustomer(String name, String email, int historySize, double discountRate) {
	        super(name, email, historySize);
	        this.discountRate = discountRate;
	    }

	    public double applyDiscount() {
	        double total = calculateTotalExpenditure();
	        return total - (total * (discountRate / 100));
	    }

	    public void displayLoyalCustomerInfo() {
	        super.displayCustomerInfo();
	        System.out.println("Discount Rate: " + discountRate + "%");
	        System.out.println("Total Expenditure After Discount: ₹" + applyDiscount());
	    }

	    public static void main(String[] args) {
	        LoyalCustomer l = new LoyalCustomer("pravs", "pravalika@gmail.com", 4, 10);

	        l.addPurchase(1200, 0);
	        l.addPurchase(1700, 1);
	        l.addPurchase(2300, 2);

	        l.displayLoyalCustomerInfo();
	    }
	}

