import java.util.*;
class Vehicle{
	String vehicleNumber;
	String ownerName;
	double vehiclePrice;
	int manufacturingYear;
	
	public void displayReport(){ 
		System.out.println(vehicleNumber);
		System.out.println(ownerName);
		System.out.println(vehiclePrice);
		System.out.println(manufacturingYear);	
	}	
	
}

class Car extends Vehicle{
	int airbags;
	
	public double calculatePremium(){
		double premium = vehiclePrice * 4/100;
		return premium;
	}
	
	public double calculateRoadTax(){
		double roadTax = vehiclePrice * 8/100;
		return roadTax;
	}
	
}

class Bike extends Vehicle{
	int engineCapacity;
	
	public double calculatePremium(){
		double premium = vehiclePrice * 2/100;
		return premium;
	}
	
	public double calculateRoadTax(){
		double roadTax = vehiclePrice * 5/100;
		return roadTax;
	}
}

class Truck extends Vehicle{
	int loadCapacity;
	
	public double calculatePremium(){
		double premium = vehiclePrice * 6/ 100;
		return premium;
	}
	
	public double calculateRoadTax(){
		double roadTax = vehiclePrice * 10/100;
		return roadTax;
	}
}

public class VehicleInsurance{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle type: ");
		String vehicleType = sc.next();	
		
		if(vehicleType == "Car"){
			Car car = new Car();	
			System.out.println("Enter vehicle number: ");
			String vehicleNumber = sc.next();
			
			System.out.println("Enter owner name: ");
			String ownerName = sc.nextLine();
			
			System.out.println("Enter vehicle price: ");
			double vehiclePrice = sc.nextDouble();
			
			System.out.println("Enter manufacturing year: ");
			int manufacturingYear = sc.nextInt();
			
			System.out.println("Enter airbags: ");
			int airbags = sc.nextInt();
			
			
			car.displayReport();
		}
		
	}
}