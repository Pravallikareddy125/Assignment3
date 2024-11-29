package assignment3;

public class Restaurant {	   
	    private String[] menuItems;
	    private double[] prices;
	    private double[] ratings;
	    private int itemCount;

	    
	    public Restaurant(int capacity) {
	        menuItems = new String[capacity];
	        prices = new double[capacity];
	        ratings = new double[capacity];
	        itemCount = 0;
	    }

	    
	    public void addItem(String item, double price, double rating) {
	        for (int i = 0; i < itemCount; i++) {
	            if (menuItems[i].equals(item)) {
	                System.out.println("Item " + item + " is already on the menu.");
	                return;
	            }
	        }
	        
	        if (itemCount < menuItems.length) {
	            menuItems[itemCount] = item;
	            prices[itemCount] = price;
	            ratings[itemCount] = rating;
	            itemCount++;
	            System.out.println("Item " + item + " added to the menu!");
	        } else {
	            System.out.println("Menu is full! Cannot add more items!!");
	        }
	    }

	    public void removeItem(String item) {
	        for (int i = 0; i < itemCount; i++) {
	            if (menuItems[i].equals(item)) {
	               
	                for (int j = i; j < itemCount - 1; j++) {
	                    menuItems[j] = menuItems[j + 1];
	                    prices[j] = prices[j + 1];
	                    ratings[j] = ratings[j + 1];
	                }
	                itemCount--;
	                System.out.println("Item " + item + " removed from the menu!");
	                return;
	            }
	        }
	        System.out.println("Item " + item + " is not on the menu!");
	    }

	    public double calculateAverageRating() {
	        if (itemCount == 0) {
	            System.out.println(" There is No items on the menu to  calculate the average rating!");
	            return 0.0;
	        }
	        double totalRating = 0.0;
	        for (int i = 0; i < itemCount; i++) {
	            totalRating += ratings[i];
	        }
	        return totalRating / itemCount;
	    }

	    public void displayMenu() {
	        if (itemCount == 0) {
	            System.out.println("The menu is empty.");
	            return;
	        }
	        System.out.println("Menu:");
	        for (int i = 0; i < itemCount; i++) {
	            System.out.printf("- %s: $%.2f (Rating: %.1f)%n", menuItems[i], prices[i], ratings[i]);
	        }
	    }

	    public static void main(String[] args) {
	        Restaurant restaurant = new Restaurant(5); 
	        
	        restaurant.addItem("Biryani", 6.99, 4.6);
	        restaurant.addItem("Momos", 5.99, 3.7);
	        restaurant.addItem("Pizza", 6.99, 4.4);

	        restaurant.displayMenu();

	        restaurant.removeItem("Momos");

	        restaurant.displayMenu();

	        double averageRating = restaurant.calculateAverageRating();
	        System.out.printf("Average Rating: %.2f%n", averageRating);
	    }
	}

