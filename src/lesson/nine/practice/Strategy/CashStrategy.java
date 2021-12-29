package lesson.nine.practice.Strategy;

public class CashStrategy implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("$"+amount + " paid with cash");

	}

	@Override
	public String getPaymentName() {
		return "Cash";
	}

	@Override
	public String getPaymentColor() {
		// TODO Auto-generated method stub
		return "green";
	}

}


