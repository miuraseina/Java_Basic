class Sample1_11_1 {
	public static void main (String[] args) {
		
		//while文のしくみ
		
		/*コマンドライン引数で受け取った数字の累乗の数のうち、100未満のもののみを表示するプログラムを作る。
		**【例】コマンドライン引数での入力：3 → 表示される数：3 , 9 , 27 , 81
		*/
		
		int receiveNumber = Integer.parseInt(args[0]) ;  //ループ毎にcalcNumberに掛ける数（コマンドライン引数で受け取った値）
		int calcNumber    = receiveNumber ;              //表示する数（初期値：コマンドライン引数で受け取った値）
		
		while( calcNumber < 100 ){
			
			System.out.println("calcNumber：" + calcNumber);
			
			calcNumber *= receiveNumber ;
			
		}
		
	}
}
