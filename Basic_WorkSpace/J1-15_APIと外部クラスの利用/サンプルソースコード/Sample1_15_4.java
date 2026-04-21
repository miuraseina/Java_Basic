import java.util.List;
import java.util.ArrayList;

class Sample1_15_4{
	public static void main (String[] args) {
		
		//APIの活用（ArrayList（ラッパークラスの活用））
		
		/*コマンドライン引数で受け取った数字の累乗の数のうち、100未満のものをArrayListに格納し、格納された中での最大値を表示するプログラムを作成する。
		**【例】コマンドライン引数での入力：3 → 格納される数：3 , 9 , 27 , 81
		*/
		
		int receiveNumber = Integer.parseInt(args[0]) ;           //ループ毎にcalcNumberに掛ける数（コマンドライン引数で受け取った値）
		int calcNumber    = receiveNumber ;                       //表示する数（初期値：コマンドライン引数で受け取った値）
		List<Integer> numberList = new ArrayList<Integer>(); //格納に用いるArrayList
		
		//コマンドライン引数で受け取った数字の累乗の数のうち、100未満のものをArrayListに格納するプログラムを作成する。
		while( calcNumber < 100 ){
			
			numberList.add( calcNumber );
			
			calcNumber *= receiveNumber ;
			
		}
		
		//最大値の表示
		int numberListlastIndex = numberList.size() - 1 ;         //最大値を格納している要素のインデックスを取得（要素数-1）
		System.out.println( "最大値：" + numberList.get( numberListlastIndex ) );
		
	}
}