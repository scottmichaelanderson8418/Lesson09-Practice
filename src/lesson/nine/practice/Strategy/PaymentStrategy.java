package lesson.nine.practice.Strategy;

public interface PaymentStrategy {

	public void pay(double amount);

	public String getPaymentName();
	
	public String getPaymentColor();

}


