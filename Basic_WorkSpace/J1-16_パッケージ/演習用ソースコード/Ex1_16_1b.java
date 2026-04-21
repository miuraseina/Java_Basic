public class Ex1_16_1b {
	
	public int calcTaxPrice( int price ){        //アンダーバーを適切な内容に書き換えてください
		
		final double TAX = 1.08 ;                //消費税（8%）
		
		return (int)( price * TAX ) ;
		
	}
	
}
