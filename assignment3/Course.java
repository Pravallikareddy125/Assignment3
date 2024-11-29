package assignment3;

public class Course {
	    String courseName;
	    String instructor;
	    int credits;

	    public Course(String courseName, String instructor, int credits) {
	        this.courseName = courseName;
	        this.instructor = instructor;
	        this.credits = credits;
	    }

	    public void displayCourseDetails() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Instructor: " + instructor);
	        System.out.println("Credits: " + credits);
	    }
	}

	class OnlineCourse extends Course {
	    String platform;
	    int duration;

	    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
	        super(courseName, instructor, credits);
	        this.platform = platform;
	        this.duration = duration;
	    }

	    public void displayCourseDetails() {
	        super.displayCourseDetails();
	        System.out.println("Platform: " + platform);
	        System.out.println("Duration: " + duration + " hours");
	    }

	    public boolean isEligibleForCertificate() {
	        return duration >= 20;
	    }

	    public static void main(String[] args) {
	        OnlineCourse o = new OnlineCourse("Java full stack", "priya", 3, "St-33", 22);

	        System.out.println("Course Details:");
	        o.displayCourseDetails();

	        if (o.isEligibleForCertificate()) {
	            System.out.println("\nThe course is eligible for a certificate.");
	        } else {
	            System.out.println("\nThe course is not eligible for a certificate.");
	        }
	    }
	}
