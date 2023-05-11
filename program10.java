class program10{

	public static void main(String []args){
	
		int N = 2332;
		int rev = 0;
		int temp = N;
		while(N!= 0){
		
			int rem  = N%10;
			rev = rev *10 + rem;
			N = N/10;
		}
		if(temp == rev){
		
			System.out.println("The number is palindrome");
		}else
		{
			System.out.println("The number is not palindrom ");
		}
		
	}
}