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

	@Override
	public String toString() {
		String scottString = "";
		scottString = "firstName = " + this.firstName + "\n" + "lastName = " + this.lastName +
				"\n" + "jobTitle = " + this.jobTitle + "\n" + "salary = $" + this.salary + "\n" +
				"City = " + this.city + "\n" + "state = $" + this.state + "\n" + "zipCode = " +
				this.zipCode;
		return scottString;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getJobTitle() {
		return jobTitle;
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

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	// ****************************************************************************************************
	public static class EmployeeBuilder {

		private String firstName;
		private String lastName;
		private String jobTitle;
		private float salary;

		// optional
		private String streetAddress;
		private String city;
		private String state;
		private int zipCode;
		private String phoneNumber;

		public EmployeeBuilder(String firstName, String lastName, String jobTitle, float salary) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}

		public EmployeeBuilder setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
			return this;
		}

		public EmployeeBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public EmployeeBuilder setState(String state) {
			this.state = state;
			return this;
		}

		public EmployeeBuilder setZipCode(int zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		public EmployeeBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
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
