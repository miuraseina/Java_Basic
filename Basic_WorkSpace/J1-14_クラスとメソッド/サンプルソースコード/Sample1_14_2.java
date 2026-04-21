class Sample1_14_2 {
	
	//引数が不要なメソッド
	static String getName() {
		
		return "モコ" ;
		
	}
	
	//戻り値なしのメソッド
	static void printName(String name) {
		
		System.out.println("なまえ：" + name);
		
	}
	
	//プログラムは必ずmainメソッドからはじまる
	public static void main(String[] args) {
		
		String print = getName() ;
		
		printName( print );
		
	}
	
}
