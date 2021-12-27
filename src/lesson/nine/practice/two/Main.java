package lesson.nine.practice.two;

import lesson.nine.practice.two.copy.EmployeeCorrect;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee johnEmployee = new Employee.EmployeeBuilder("John", "Smith", "Writer", 50000f).build();
//
//		System.out.println(johnEmployee.toString());
//		System.out.println();


		// complex Employee object using additional setters from EmployeeBuilder class
		
		Employee patEmployee = new Employee.EmployeeBuilder("Pat", "Green", "Chemist", 70000f)
				.setPhoneNumber("704-555-5555")
				.setStreetAddress("4033 Tall Timber Ct")
				.setCity("Gastonia")
				.setState("North Carolina")
				.setZipCode(28056)
				.build();
		System.out.println(patEmployee.toString());

		
		
		
//		// complex Employee object using additional setters from EmployeeBuilder class
//		EmployeeCorrect patEmployee = new EmployeeCorrect.EmployeeBuilder("Pat", "Green", "Chemist",
//				70000f).setPhoneNumber("555-123-4567").setStreetAddress("123 Alphabet St.").build();
////						.setCity("Tempe").setState("Arizona").setZip(85281).build();
		
	}
}

