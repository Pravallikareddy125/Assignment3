package assignment3;

public class Employee {
	String name;
	String JobTitle;
	 int salary;
	 int TotalPerAnnum;
	
	Employee(String name,String JobTitle,int salary){
		this.name=name;
		this.JobTitle=JobTitle;
		this.salary=salary;
		
		System.out.println(name);
		System.out.println(JobTitle);
		System.out.println(salary);
		
	}
	void calculate() {
		TotalPerAnnum=salary*12;
		System.out.println("CTC : "+TotalPerAnnum );
		
		
	}
	void update() {
		calculate();
		
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("likith","clerk",15000);
		e.update();
		
		
		
	}

}
