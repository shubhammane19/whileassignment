//cout the digits of no
class program3{

	public static void main(String []args){
	
		int digit = 942111423;
		int count = 0;
		while(digit!=0){
			count++;
			digit = digit/10;
		}
		System.out.println("Count of digits is : "  + count);
	}
}
