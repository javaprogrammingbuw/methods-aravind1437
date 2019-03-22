import java.util.Scanner;


public class Circle {
	
	static Scanner scan = new Scanner(System.in);
	static int r = scan.nextInt();
	
   public static double area() {
		
	   double pi = 3.14;
		 return  pi*r*r;
	    
	}
	

	public static double diameter() {
		return 2*r;
		
	}
	
	public static double circumference() {
		double pi = 3.14;
		return 4*pi*r;
		
	}
	
	
	public static void main(String [] args) {
		
	
		
		double a = area();
		double d = diameter();
		double c = circumference();
	     System.out.println("The area of the circle is = " + a);
		 System.out.println(" The diameter of the circle is = " + d);
		 System.out.println("The circumference of circle is = " + c);
		
	   }
	
		  
	}
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.

