class Sample1_14_4 {
	
	public static void main( String[] args ) {
		
		//ローカル変数のしくみ
		
		String message = "不正です" ;
		
		int print = 0 ;
		
		if( args.length == 2 ){
			
			int num1 = Integer.parseInt( args[0] );           //★スコープが別であれば名前が同じ変数を定義することは可能です
			int num2 = Integer.parseInt( args[1] );           //★スコープが別であれば名前が同じ変数を定義することは可能です
			
			print = sum( num1 , num2 );
			
		}else{
			System.out.println( message );
		}
		
		System.out.println( "print：" + print );              //★（エラー）スコープ外からのアクセスはできません（ネストになっているブロック内の変数）
		
	}
	
	static int sum( int num1 , int num2 ) {
		
		int print = 0 ;
		
		int calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
}

