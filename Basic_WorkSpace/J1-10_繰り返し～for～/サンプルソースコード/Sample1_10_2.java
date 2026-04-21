class Sample1_10_2 {
	public static void main (String[] args) {
		
		//for文と配列は相性が抜群
		
		String[] animals = {"こぶた", "たぬき", "きつね", "ねこ"} ;
		
		for( int i = 0 ; i < animals.length ; i++ ){
			
			//カウンタ変数iをインデックスとして利用
			System.out.println("animals[i]：" + animals[i] );
			
		}
	}
}
