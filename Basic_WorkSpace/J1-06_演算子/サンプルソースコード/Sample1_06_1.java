class Sample1_06_1 {
	public static void main (String[] args) {
		
		//算術演算子の活用
		
		int numberX = 8 ;
		int numberY = 4 ;
		int numberZ = 5 ;
		String stNumberX = "1";
		String stNumberY = "2";
		
		//『 + 』
		int answer1 = numberX + numberY ;
		System.out.println("answer1：" + answer1);
		
		//『 - 』
		int answer2 = numberX - numberY ;
		System.out.println("answer2：" + answer2);
		
		//『 * 』
		int answer3 = numberX * numberY ;
		System.out.println("answer3：" + answer3);
		
		//『 / 』
		int answer4 = numberX / numberY ;
		System.out.println("answer4：" + answer4);
		
		//『 / 』（割り切れない場合）
		int answer5 = numberX / numberZ ;
		System.out.println("answer5：" + answer5);
		
		//『 % 』
		int answer6 = numberX % numberZ ;
		System.out.println("answer6：" + answer6);
		
		// 符号反転
		int answer7 = -answer6 ;
		System.out.println("answer7：" + answer7);
		
		//『 ○++ 』
		int answer8 = numberX++ ;
		System.out.println("answer8：" + answer8);
		System.out.println("（ numberX：" + numberX + " ）");
		
		//『 ++○ 』
		int answer9 = ++numberY ;
		System.out.println("answer9：" + answer9);
		System.out.println("（ numberY：" + numberY + " ）");
		
		//『 +1 』と『 ++ 』の使い分けの注意
		int answer10 = numberZ + 1 ;
		System.out.println("answer10：" + answer10);
		System.out.println("（ numberZ：" + numberZ + " ）");
		
		//『 -- 』
		int answer11 = numberZ-- ;
		System.out.println("answer11：" + answer11);
		System.out.println("（ numberZ：" + numberZ + " ）");
		
		//『 + 』（文字の結合）
		String answer12 = stNumberX + stNumberY ;
		System.out.println("answer12：" + answer12);
		
	}
}
