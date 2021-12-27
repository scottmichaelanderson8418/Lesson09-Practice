package lesson.nine.practice.three;

public class SmartPhone implements Alert {

	public void alert(AlertVisitor alertVisitor) {
		alertVisitor.visit(this);
	}

}
