package lesson.nine.practice.builder;

public class SmartPhone implements Alert {

	public void alert(AlertVisitor alertVisitor) {
		alertVisitor.visit(this);
	}

}


