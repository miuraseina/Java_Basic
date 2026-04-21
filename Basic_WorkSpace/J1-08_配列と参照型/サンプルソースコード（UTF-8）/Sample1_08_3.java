class Sample1_08_3 {
	public static void main (String[] args) {
		
		//コマンドライン引数の活用
		
		String x = args[1] ;
		System.out.println("コマンドライン引数の要素の参照：" + x );
		
		int count = args.length ;
		System.out.println("コマンドライン引数の要素数：" + count );
		
	}
}
