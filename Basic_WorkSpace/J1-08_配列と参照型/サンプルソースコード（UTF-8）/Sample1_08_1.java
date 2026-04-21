class Sample1_08_1 {
	public static void main (String[] args) {
		
		//配列の活用
		
		char[] singou = new char[3] ;
		singou[0] = '赤' ;
		singou[1] = '黄' ;
		singou[2] = '青' ;
		
		char x = singou[1] ;
		System.out.println("要素の参照：" + x );
		
		int count = singou.length ;
		System.out.println("要素数：" + count );
		
	}
}
