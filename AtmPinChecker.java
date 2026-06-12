import java.util.Scanner;
public class AtmPinChecker{
	public static void main(String[] args){
		int atmPIN = 1234;
		int count = 2;
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a PIN: ");
		int num = sc.nextInt();
		
			for(int i = 1; i <=3; i++){
				if(num == atmPIN){
				System.out.println("Login Successful");
				System.out.println("Welcome to ATM services");
				System.exit(0);
				break;
				}
				
				else{
					
					System.out.println("Invalid PIN");
					System.out.println("Attempts Remaining: " + count);
					count --;
					break;
					
				}
			}
			if (count < 0){
				System.out.println("card blocked. Please contact the bank");
				System.exit(0);
				
			}
			
			
		}
	}
}