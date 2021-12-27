package lesson.nine.practice.one;

public class Dog implements Animal {

	public int scottInteger = 0;

	public int scottAdd() {
		
		scottInteger = 5+5;
		
		return scottInteger;
	}
	

	public void speak() {

		System.out.println("Dog goes WoooooooooFff");
	}

}
