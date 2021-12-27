package lesson.nine.practice.two;

public class Employee {

	// mandatory parameters
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private float salary;

	// optional parameters
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private String jobTitle;

	// default constructor
	private Employee(EmployeeBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.jobTitle = builder.jobTitle;
		this.salary = builder.salary;
		this.streetAddress = builder.streetAddress;
		this.city = builder.city;
		this.state = builder.state;
		this.zipCode = builder.zipCode;
		this.phoneNumber = builder.phoneNumber;
	}

//	@Override
//	public String toString() {
//		String scottString = "";
//		scottString = "firstName = " + this.firstName + "\n" + "lastName = " + this.lastName +
//				"\n" + "jobTitle = " + this.jobTitle + "\n" + "salary = $" + this.salary;
//		return scottString;
//	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public float getSalary() {
		return salary;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	// ****************************************************************************************************
	public static class EmployeeBuilder {

		private String firstName;
		private String lastName;
		private String jobTitle;
		private float salary;

		// optional
		private String streetAddress = "";
		private String city = "";
		private String state = "";
		private int zipCode = 00000;
		private String phoneNumber = "000-000-0000";

		public EmployeeBuilder(String firstName, String lastName, String jobTitle, float salary) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Employee build() {
			return new Employee(this);
		}

		@Override
		public String toString() {

			String scottString = "";
			scottString = "firstName = " + this.firstName + "\n" + "lastName = " + this.lastName +
					"\n" + this.jobTitle + "\n" + this.salary;

			return scottString;
		}
	}
//********************************************************************************************************
}
