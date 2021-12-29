package lesson.nine.practice.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Smartphone Alert
		Alert smartphoneAlert = new SmartPhone();
		smartphoneAlert.alert(new AlertDisplayVisitor());

		//TV Alert
		Alert tvAlert = new TV();
		tvAlert.alert(new AlertDisplayVisitor());

		// radio alert
		Alert radioAlert = new Radio();
		radioAlert.alert(new AlertDisplayVisitor());

	}

}
