class program7{

	public static void main(String []args){
	
		//int num = 6;
		int num = 7;
		if(num % 2 == 0){
		
			while(num >= 1){
			
				System.out.println(num +  "  ");
				num--;
			}
		}else{
		
			while(num >= 1){
			
				System.out.println(num +  "  ");
				num = num -2;
			}
		}
		System.out.println();
	}
}