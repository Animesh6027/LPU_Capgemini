/*
Payment Mode Validation
A shopping application supports different payment modes using an enum.
Requirements :
Create an enum named PaymentMode with constants:
	CASH
	UPI
	DEBIT_CARD
	CREDIT_CARD
	NET_BANKING

Create a class Payment with:
	double amount
	PaymentMode mode

Add:
	A parameterized constructor
	A method processPayment()

Logic inside processPayment():
	If mode is CASH, print: Payment will be collected on delivery
	If mode is UPI or NET_BANKING, print: Online payment successful
	If mode is DEBIT_CARD or CREDIT_CARD, print: Card payment processed
Use switch-case with enum

In main():
	Create at least two Payment objects with different modes
	Call processPayment() for each
*/

	enum PaymentMode {
		CASH, UPI, DEBIT_CARD, CREDIT_CARD, NET_BANKING;
	
	static class Payment {
		double amount;
		PaymentMode mode;
		public Payment(double amount, PaymentMode mode) {
			this.amount = amount;
			this.mode = mode;
		}
		public void processPayment() {
			switch (mode) {
			case CASH:
				System.out.println("Payment will be collected on delivery");
				break;
			case UPI:
			case NET_BANKING:
				System.out.println("Online payment successful");
				break;
			case DEBIT_CARD:
			case CREDIT_CARD:
				System.out.println("Card payment processed");
				break;
			}
		}
	}

	}
	public class P1 {
	public static void main(String[] args) {
		Payment payment1 = new Payment(1500.0, PaymentMode.CASH);
		payment1.processPayment();

		Payment payment2 = new Payment(2500.0, PaymentMode.DEBIT_CARD);
		payment2.processPayment();
	}
}