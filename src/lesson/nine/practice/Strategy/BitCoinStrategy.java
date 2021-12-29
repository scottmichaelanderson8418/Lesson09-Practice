package lesson.nine.practice.Strategy;

public class BitCoinStrategy implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("$"+amount + " paid with BitCoin");

	}

	@Override
	public String getPaymentName() {
		return "BitCoin";
	}

	@Override
	public String getPaymentColor() {
		// TODO Auto-generated method stub
		return "Electronic";
	}

}
