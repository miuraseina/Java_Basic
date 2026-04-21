/*-< 演習：Ex1_12_2 >---------------------------------
以下は以前に講座で扱った Sample1_11_1.java と同じ内容の処理です。
このプログラムは 0 や 1 などをコマンドライン引数で受け取ると無限ループに陥ってしまいます。
この対策としてreceiveNumberが以下のNGパターンに該当する場合はwhile文を実行せず、代わりに
「適切な値を入力してください」というメッセージを表示するプログラムに書き換えてください。

 [receiveNumberのNGパターン]
  |_ receiveNumberの値がマイナス
  |_ receiveNumberの値が0
  |_ receiveNumberの値が1

----------------------------------------------------*/
class Ex1_12_2 {
	public static void main (String[] args) {
		
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
