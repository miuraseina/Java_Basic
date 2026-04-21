class Sample1_10_1 {
	public static void main (String[] args) {
		
		//for文のしくみ
		
		int loopCount = 0 ; //何回目のループかを表す数値（初期値0）
		
		System.out.println("▼[開始]for文");
		
		for( int i = 0 ; i < 4 ; i++ ){
			System.out.println("  ▼[開始]1回分の繰り返し処理");
			
			//loopCountを1上げる
			loopCount += 1 ;  
			
			//loopCountおよびカウンタ変数iの表示
			System.out.println("    loopCount：" + loopCount);
			System.out.println("    i（カウンタ変数）：" + i);
			
			System.out.println("  ▲[終了]1回分の繰り返し処理");
		}
		
		System.out.println("▲[終了]for文");
		
	}
}
