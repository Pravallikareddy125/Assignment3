package assignment3;

public class Student {
      String name;
      char grade; 
      public Student(String name,char grade) {
    	  this.name = name;
    	  this.grade=grade;
     }
      String[] Courses;
      
      public static void main(String[] args) {
		Student s1 = new Student("Pravas",'A');
		String[] newCourses = {"Java","HTML","Python","React"};
		s1.addCourses(newCourses);
		
		System.out.println("name : "+s1.name + ", grade : "+s1.grade);
		for(int i=0; i < s1.Courses.length;i++) {
			System.out.println("courses :"+s1.Courses[i]);
		}
		s1.removeCourses(s1,"Python");
		for(int i=0;i<s1.Courses.length;i++) {
			System.out.println("New courses : "+s1.Courses[i]);
		}
		
	}
      public void addCourses(String[] courses) {
    	  this.Courses = courses;
      }
      
      public void removeCourses(Student s,String courseToRemove) {
    	  String[] newCourses = new String[s.Courses.length];
    	  int count = 0;
    	  for(int i =0;i<s.Courses.length;i++) {
    		  if(s.Courses[i].equalsIgnoreCase(courseToRemove)) {
    			  continue;   			  
    		  }else {
    			  newCourses[count] = s.Courses[i];
    			  count++;
    			  
    		  }
    	  }
    	  s.Courses = newCourses;
      }
}