abstract class Payment{
	double amount;
	abstract void processPayment();
	
	Payment(double amount){
		this.amount = amount;
	}
}
class CreditCard extends Payment{
	String cardNumber;
	
	CreditCard(double amount, String cardNumber){
		super(amount);
		this. cardNumber = cardNumber;
	}
	
	public void processPayment(){
		double creditCharges = 0.02 * amount;
		System.out.println("Processing Credit Card Payment");
		System.out.println("Card Number: " + cardNumber);
		System.out.println("Amount: " + amount);
		System.out.println("Payment Successful");
		System.out.println();
		System.out.println("Original Amount: " + amount);
		System.out.println("Transaction Charge: " + creditCharges);
		System.out.println("---------------------------------------");
		
		
		
	}
	
}
class UPI extends Payment{
	String upiId;
	
	UPI(double amount, String upiId){
		super(amount);
		this. upiId = upiId;
		
	}
	
	public void processPayment(){
		double upiCharges = 0;
		System.out.println("Processing UPI Payment");
		System.out.println("UPI ID: " + upiId);
		System.out.println("Amount: " + amount);
		System.out.println("Payment Successful");
		System.out.println();
		System.out.println("Original Amount: " + amount);
		System.out.println("Transaction Charge: " + upiCharges);
		System.out.println("---------------------------------------");
		//System.out.println();
		
	}
	
}
class NetBanking extends Payment{
	String bankName;
	NetBanking(double amount, String bankName){
		super(amount);
		this.bankName = bankName;
		
	}
	
	public void processPayment(){
		double netBankCharges = 0.01 * amount;
		
		System.out.println("Processing Net Banking Payment");
		System.out.println("Bank Name: " + bankName);
		System.out.println("Amount: " + amount);
		System.out.println("Payment Successful");
		System.out.println();
		System.out.println("Original Amount: " + amount);
		System.out.println("Transaction Charge: " + netBankCharges);
		System.out.println("---------------------------------------");
		
	} 
	 
}
public class PaymentGateway{
	public static void main(String [] args){
		//List <Payment> payments = new Payment();
		CreditCard creditCard = new CreditCard(5000, "1234-5678-9876-5432");
		UPI upi = new UPI(2500, "abc@upi");
		NetBanking netBanking = new NetBanking(10000, "HDFC Bank");
		creditCard.processPayment();
		upi.processPayment();
		netBanking.processPayment();
		
	
	}
	
}