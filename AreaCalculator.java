public class AreaCalculator{
	
	public int calculateArea(int side){
		int AreaOfSquare = side * side;
		return AreaOfSquare;
	}
	
	public float calculateArea(float length, float width ){
		float AreaOfRectangle = length * width;
		return AreaOfRectangle;
	}
	
	public double  calculateArea(double radius){
		double AreaOfCircle = 3.14 * radius * radius;
		return AreaOfCircle;
		
	}
	
	public double calculateArea(double base, double height){
		double AreaOfTriangle = 0.5 * base * height;
		return AreaOfTriangle;
		
	}
	
	
	
	public static void main(String [] args){
		 AreaCalculator areaCalculator = new  AreaCalculator();
		 System.out.println(areaCalculator.calculateArea(4));
		 System.out.println(areaCalculator.calculateArea(4.2f, 3.5f));
		 System.out.println(areaCalculator.calculateArea(4.33));
		 System.out.println(areaCalculator.calculateArea(1.22, 14));
		  
		 
		
		
	}
}