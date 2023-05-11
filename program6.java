////sum of even no and multiplication if odd numbers
class program6{
	
	public static void main(String []args){
	
		int sum = 0;
		int product = 1;
		int i = 1;
		while(i<=10){
		
			if(i%2 == 0){
			
				sum = sum + i;
			}
			else{
			
				product = product * i;
			}
			i++;
		}
		System.out.println("Sum of even numbers is :  "  +  sum);
		System.out.println("Product of odd numbers is : "   +  product);
		
	}
}