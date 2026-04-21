class Sample1_13_1 {
	public static void main (String[] args) {
		
		//break文のしくみ
		
		String print1 = "" ;
		
		for(int i = 0 ; i < 10 ; i++){
			
			if(i == 7){
				break;
			}
			
			print1 += i + " " ;
			
		}
		
		System.out.println("print1：" + print1);
		
		
		
		//continue文のしくみ
		
		String print2 = "" ;
		
		for(int i = 0 ; i < 10 ; i++){
			
			if(i == 7){
				continue;
			}
			
			print2 += i + " " ;
			
		}
		
		System.out.println("print2：" + print2);
		
	}
}
