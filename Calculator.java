public class Calculator{
	
	
	//	Addition of two integers. 
	public void claculate(int num1, int num2){
		int addTwoNumbers = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is: " + addTwoNumbers);
		
	}
	
	//Addition of three integers. 
	public void claculate(int num1, int num2, int num3){
		int addThreeNumbers = num1 + num2 + num3;
		System.out.println("Addition of " + num1 + " ," + num2 + "and "+ num3 + " is: " + addThreeNumbers);
		
	}
	
	// Addition of two decimal numbers
	public void claculate(float num4, float num5){
		float addTwoNumbers = num4 + num5;
		System.out.println("Addition of " + num4 + " and " + num5 + " is: " + addTwoNumbers);
		
	}
	
	//	Multiplication of two integers. 
	public void calculateMultiplication(int num6, int num7){
		int multiplyTwoNumbers = num6 * num7;
		System.out.println("Multplication of " + num6 + " and " + num7+ " is: " + multiplyTwoNumbers);
		
		
	}
	
	public static void main(String [] args){
		Calculator c1 = new Calculator();
		c1.claculate(24, 12);
		c1.claculate(20, 10,30);
		c1.claculate(2.1f, 12.0f);
		c1.calculateMultiplication(12, 12);
		
		
	}
	
	
}