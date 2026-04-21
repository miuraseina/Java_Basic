class Sample1_14_1 {
	
	public static void main(String[] args) {
		
		//メソッドのしくみ
		
		int print = sum( 2 , 3 ) ;
		
		System.out.println("print：" + print);
		
	}
	
	static int sum( int num1 , int num2 ) {
		
		int calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
	
}