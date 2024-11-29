package assignment3;

public class TravelFight {
		   public void searchFlights() {
		        System.out.println("Searching for available flights!!!");
		        System.out.println("1. Flight from HYD to London - Price: ₹49,500");
		        System.out.println("2. Flight from HYD to Paris - Price: ₹47,750");
		        System.out.println("3. Flight from HYD to Tokyo - Price: ₹59,999");
		    }

		    public void searchHotels() {
		        System.out.println("Searching for available hotels!!!");
		        System.out.println("1. Hotel A in London - Price: ₹10,250 per night");
		        System.out.println("2. Hotel B in Paris - Price: ₹8,000 per night");
		        System.out.println("3. Hotel C in Tokyo - Price: ₹13,500 per night");
		    }

		    public void bookFlight(String flight) {
		        System.out.println("Booking the flight: " + flight);
		        System.out.println("Flight booked successfully!");
		    }

		    public void bookHotel(String hotel) {
		        System.out.println("Booking the hotel: " + hotel);
		        System.out.println("Hotel booked successfully!");
		    }

		    public void cancelFlight(String flight) {
		        System.out.println("Canceling the flight booking: " + flight);
		        System.out.println("Flight cancelled successfully!");
		    }

		    public void cancelHotel(String hotel) {
		        System.out.println("Canceling the hotel booking: " + hotel);
		        System.out.println("Hotel cancelled successfully!");
		    }

		    public static void main(String[] args) {
		    	TravelFight travelSystem = new TravelFight();
		        
		        travelSystem.searchFlights();
		        travelSystem.searchHotels();

		        travelSystem.bookFlight("Flight from Delhi to London");
		        travelSystem.bookHotel("Hotel A in London");

		        travelSystem.cancelFlight("Flight from Delhi to London");
		        travelSystem.cancelHotel("Hotel A in London");

		        System.out.println("\nAfter Cancellation:");
		        travelSystem.searchFlights();
		        travelSystem.searchHotels();
		    }
	}
