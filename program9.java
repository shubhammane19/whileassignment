class program9{

	public static void main(String []args){
		
		int rev = 0;
		int N = 942111423;
		while(N != 0){
			
			int rem = N%10;
			rev = rev * 10 + rem;
			N = N/10;
		}
		System.out.println(rev);
	}
}