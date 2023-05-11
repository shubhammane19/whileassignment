//calculate factorial
class program2{

	public static void main(String []args){
	
		int n = 6;
		int fact = 1;
		int itr = 1;
		while(itr <= n){
		
			fact = fact*itr;
			itr++;
		}
		System.out.println("Factorial of" + n + "is" + fact);
	}
} 