class Sample1_13_1 {
	public static void main (String[] args) {
		
		//break•¶‚Ì‚µ‚­‚Ý
		
		String print1 = "" ;
		
		for(int i = 0 ; i < 10 ; i++){
			
			if(i == 7){
				break;
			}
			
			print1 += i + " " ;
			
		}
		
		System.out.println("print1F" + print1);
		
		
		
		//continue•¶‚Ì‚µ‚­‚Ý
		
		String print2 = "" ;
		
		for(int i = 0 ; i < 10 ; i++){
			
			if(i == 7){
				continue;
			}
			
			print2 += i + " " ;
			
		}
		
		System.out.println("print2F" + print2);
		
	}
}
