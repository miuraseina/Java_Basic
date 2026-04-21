class Sample1_12_1 {
	public static void main (String[] args) {
		
		//ifのしくみ
		
		int customerAge = Integer.parseInt(args[0]) ;  //顧客の年齢
		
		if( customerAge < 20){
			
			System.out.println("「未成年の方にお酒は売れません」");
			
		}
		
	}
}
