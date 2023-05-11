//print the square of the even digits of the number
class program5{

	public static void main(String []args){
	
		int count = 0;
		int digit = 942111423;
		while(digit != 0){
		
		int rem = digit%10;
		if(rem % 2 == 0){
		
			System.out.println((rem * rem) +  " ");
		}
		digit = digit/10;
		}
		System.out.print("\n");
	}
}