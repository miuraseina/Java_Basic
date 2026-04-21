class Sample1_06_2 {
	public static void main (String[] args) {
		
		//代入演算子の活用
		
		//『 += 』
		int number0 = 10 ;
		number0 += 3 ;
		System.out.println("number0：" + number0);
		
		//『 変数x += 3 』は『 変数x = 変数x + 3 』と同じ意味
		int number1 = 10 ;
		number1 = number1 + 3 ;
		System.out.println("number1：" + number1 + " ※number0と同じ値になる");
		
		//『 -= 』
		int number2 = 10 ;
		number2 -= 3 ;
		System.out.println("number2：" + number2);
		
		//『 *= 』
		int number3 = 10 ;
		number3 *= 3 ;
		System.out.println("number3：" + number3);
		
		//『 /= 』（割り切れない場合）
		int number4 = 10 ;
		number4 /= 3 ;
		System.out.println("number4：" + number4);
		
		//『 %= 』
		int number5 = 10 ;
		number5 %= 3 ;
		System.out.println("number5：" + number5);
		
		//『 += 』（文字の結合）
		String stNumber6 = "10" ;
		stNumber6 += "3" ;
		System.out.println("stNumber6：" + stNumber6);
		
	}
}
