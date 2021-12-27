package lesson.nine.practice.two.copy;



public class EmployeeCorrect {
	
	
	// mandatory parameters
	private String firstName;
	private String lastName;
	private String jobTitle;
	private float salary;

	// optional parameters
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private String phoneNumber;

	// an EmployeeBuilder object passed into the default constructor.
	private EmployeeCorrect(EmployeeBuilder builder) {
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

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
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

	public String getJobTitle() {
		return jobTitle;
	}

	public float getSalary() {
		return salary;
	}

	public static class EmployeeBuilder {
		// mandatory
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

		public EmployeeBuilder setZip(int zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		public EmployeeBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public EmployeeCorrect build() {
			return new EmployeeCorrect(this);
		}
	}
}