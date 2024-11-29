package assignment3;
import java.time.LocalTime; 

public class Airplane { 
		String flightNumber;
	    String destination;
	     LocalTime departureTime;
	     boolean isDelayed;
  Airplane(String flightNumber,String destination,LocalTime departureTime){
	    	 this.departureTime=departureTime;
	    	 this.destination=destination;
	    	 this.flightNumber=flightNumber;
	    	 this.isDelayed=false;
	     }
	     public String checkFlightStatus() {
	         if (isDelayed) {
	             return "Flight " + flightNumber + " to " + destination + " is delayed.";
	         } else {
	             return "Flight " + flightNumber + " to " + destination + " is on time.";
	         }
	     }
	     public void delayFlight(int minutes) {
	         isDelayed = true;
	         departureTime = departureTime.plusMinutes(minutes); 
	     }
	     public String checkIfFlightIsOnTime(LocalTime currentTime) {
	         if (currentTime.isBefore(departureTime)) {
	             return "Flight " + flightNumber + " is on time. Departure is at " + departureTime;
	         } else if (currentTime.equals(departureTime)) {
	             return "Flight " + flightNumber + " is departing now.";
	         } else {
	             return "Flight " + flightNumber + " has already departed.";
	         }
	     }
	     public static void main(String [] args){
	    	 Airplane A = new Airplane("Pravs", "UK", LocalTime.of(8, 30));
	         System.out.println(A.checkFlightStatus());
	         A.delayFlight(30);
	         System.out.println(A.checkFlightStatus());
	         System.out.println(A.checkIfFlightIsOnTime(LocalTime.of(8, 30))); 
	         System.out.println(A.checkIfFlightIsOnTime(LocalTime.of(7, 0))); 
	     }
	}


