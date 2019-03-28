import java.util.Scanner;


public class Prime {


	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.

	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter the number ");
		
		int n = scan.nextInt();
		
		boolean a = CheckPrime(n);
		
		if(a==true){
			
			System.out.println("The given number is a prime number");
		}else{
			
			System.out.println("The given number is not a prime number");
		}
		
		System.out.println("The smallest number is " + findDoublette(n));
		
	}

	public static boolean CheckPrime(int a){
		
		int count =0;
		
		for(int i=1;i<a-1;i++){
		
			if(a%i==0){
				
				count = count +1;
				
				if(count >1){
				
					return false;
				}
				
			}
				
			
		}
		return true;
	}
	public static int findDoublette(int a){
		 
		int count = 0;
		
		for(int x = a+1; x<Integer.MAX_VALUE; x++){
			
			boolean b = CheckPrime(x);
			     
				if(b == true && count<1){
                    
					boolean c = CheckPrime(x+2);
                     
					if(c == true){
                     	
						int y=x+2;
                 
						System.out.println("The nearest prime-doublette numbers are  "+x+" and " + y);
                        
						count = count++;
                        
						return x;
                     }

				}
					
				}
		return 0;

	}
	
	
		
	
}