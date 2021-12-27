package lesson.nine.practice.three;

public class Radio implements Alert {

	public void alert(AlertVisitor alertVisitor) {
		alertVisitor.visit(this);
	}

}
