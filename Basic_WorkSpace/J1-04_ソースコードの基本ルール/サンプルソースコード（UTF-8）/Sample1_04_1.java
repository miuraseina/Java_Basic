/*-< Sample1_04_1 >----------------------------------------
定価1000円の商品の税込価格を計算して表示するプログラムです。
消費税は8％で計算しています。
---------------------------------------------------------*/
class Sample1_04_1 {
	public static void main (String[] args) {
		
		int    teika   = 1000 ;             //定価の金額
		
		double zeiritu = 1.08 ;             //消費税
		
		double siharai = teika * zeiritu ;  //支払い額を計算
		
		System.out.println(siharai) ;       //支払い額を画面に表示
		
	}
}
