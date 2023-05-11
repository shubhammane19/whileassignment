class program8{

	public static void main(String []args){
	
		int day = 7;
		if(day == 0){
		
			System.out.println(day  +  "  days assignment is Overdue");
		}else{
		
			while(day>=1){
			
				System.out.println(day  + " days remaining");
				day--;
			}
			if(day == 0){
			
				System.out.println(day  +  "  days remaining over due");
			}
		}
	}
}