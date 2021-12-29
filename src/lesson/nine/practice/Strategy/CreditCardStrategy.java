package lesson.nine.practice.Strategy;

public class CreditCardStrategy implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("$"+amount + " paid with credit card");
	}

	@Override
	public String getPaymentName() {
		return "CreditCard";
	}

	@Override
	public String getPaymentColor() {
		// TODO Auto-generated method stub
		return "RED";
	}

}


