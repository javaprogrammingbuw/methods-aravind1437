import java.util.Scanner;


public class Prime {
	
	public static void main(String[] args) {
		
		
		
	
		
	    int i;
		int a;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Valve of a");
		a= scan.nextInt();
		if(a==0 || a==1) {
			System.out.println("Not a prime number");
		}
		else {
			
		for(i=2; i<a; i++) {
				if(a%i == 0) {
					count++;
					break;
			
				}
			}
		if (count == 0) {
			System.out.println(" this is a prime number");
		}else {
			System.out.println(" this is not a prime number");
		}
	}
	
	}
	/*public static void doublette() {
		int a;
		int x = a+2;
		while(x%2 == 0) {
			System.out.println("sfs");*/
		
	
	
		
	
	
			
		}
		
	

	

