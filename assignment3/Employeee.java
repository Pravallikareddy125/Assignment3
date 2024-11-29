package assignment3;

import java.time.LocalDate;
import java.time.Period;

public class Employeee {
	String name;
	int salary;
	LocalDate JoiningDate;
	
	void service() {
		System.out.println(Period.between(JoiningDate,LocalDate.now()).toTotalMonths());	
		
	}
	
	public static void main(String[] args) {
		Employeee e=new Employeee();
		e.JoiningDate=LocalDate.of(2024,05,06);
		e.service();

	}

}
