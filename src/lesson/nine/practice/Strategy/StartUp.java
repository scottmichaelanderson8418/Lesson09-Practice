package lesson.nine.practice.Strategy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StartUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Create list of possible payment strategies
		/*
		 * List<PaymentStrategy> paymentStrategies are a list of instances of the
		 * classes that implement the interface "PaymentStrategy"
		 */

		Scanner scanner = new Scanner(System.in);
		try {
			List<PaymentStrategy> paymentStrategies = Arrays.asList(
					new CashStrategy(), new CreditCardStrategy(),
					new BitCoinStrategy());

			System.out.println(paymentStrategies);

			for (int k = 0; k < paymentStrategies.size(); k++) {

				System.out.println(paymentStrategies.get(k));
			}



			System.out.println("Please enter a payment type");

			for (int i = 0; i < paymentStrategies.size(); i++) {
//			System.out.println("  " + paymentStrategies.get(i).getPaymentName());
				System.out.println("paymentStrategies.get(" + i + ") = "
						+ paymentStrategies.get(i).getPaymentName());

			}

			String paymentType = scanner.nextLine().trim();

			verifyChoice(paymentType, paymentStrategies);


		System.out.println("Please enter a payment amount.");

		double paymentAmount = scanner.nextDouble();

		// Using for loop instead of switch/case to match strategy

		for (int i = 0; i < paymentStrategies.size(); i++) {

			// "strategy" is the instance of the interface "PaymentStrategy"
			PaymentStrategy strategy = paymentStrategies.get(i);

			System.out.println("strategy = " + strategy.getPaymentName());

			if (strategy.getPaymentName().equalsIgnoreCase(paymentType)) {
				strategy.pay(paymentAmount);
			}

		}
		
		
		
		} catch (Exception e) {
			System.out.println("Enter name of payment method");
			scanner.nextLine();
		}
		scanner.close();

	}

	// verifyChoice method checks that the integer value for int variable "choice"
	// is a positive
	// integer between 1-5.
	public static void verifyChoice(String paymentType,
			List<PaymentStrategy> paymentStrategies) throws Exception {
		// the value for "choice" must be an integer value 1-5
		boolean scottBoolean = true;

		while (scottBoolean) {
			for (int k = 0; k < paymentStrategies.size(); k++) {

				if (paymentType.equals(paymentStrategies.get(k))) {
					System.out.println("ok cool");

					scottBoolean = false;

				}

			}

			scottBoolean = false;
			throw new Exception("Enter correct name of payment strategy");
		
		}
	}
}
