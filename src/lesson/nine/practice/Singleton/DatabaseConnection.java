package lesson.nine.practice.Singleton;

public class DatabaseConnection {

	private DatabaseConnection() {
	};

	private static class DatabaseConnectionInnerClass {

		private static final DatabaseConnection instance = new DatabaseConnection();
	}

	public static DatabaseConnection getInstance() {

		return DatabaseConnectionInnerClass.instance;
	}

	// code to connect and interact with the database goes here

	/*
	 * A singleton requires a private constructor instead of a public constructor
	 * and a static property that contains the instance of the object. The internal
	 * class of the singleton holds the instance of the static value which helps
	 * java avoid concurrency issues. The instance of the class is not created until
	 * the .getInstance() function is invoked "Lazy Loading"
	 * 
	 */
}


