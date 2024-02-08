package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double paymentFee(double amount) {
		return amount * 0.2;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * 0.1 * months;
	}


}
