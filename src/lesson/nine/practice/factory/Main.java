package lesson.nine.practice.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal cow = animalFactory.getAnimal("cow");
		Animal cat = animalFactory.getAnimal("cat");
		Animal dog = animalFactory.getAnimal("dog");
		
		cow.speak();
		
		cat.speak();
		
		dog.speak();
		
		
		
		
		
		
		
		
		
		
		
	}

}
