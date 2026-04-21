public class Ex1_16_1c {
	
	public int discount( int price ){
		
		final int    DISCOUNT_BORDER1   = 1000 ;   //値引発生の境界値（1000円）
		final int    DISCOUNT_BORDER2   = 5000 ;   //値引発生の境界値（5000円）
		final double DISCOUNT_RATE1     = 0.1  ;   //値引率（1000円以上5000未満）
		final double DISCOUNT_RATE2     = 0.2  ;   //値引率（5000円以上）
		final int    DISCOUNT_PRICE_MAX = 5000 ;   //値引金額の上限
		
		int priceDown = 0 ;                        //値引額
		
		//<値引額（priceDown）の計算>
		// - 引数として受け取った値が1000以上場合5000未満だった場合、1000を超えた分について10％割引にする
		// - 引数として受け取った値が5000より大きい場合、1000円以上5000未満の分について10％OFF、5000円以上の分について20％割引にする
		if ( DISCOUNT_BORDER1 <= price && price < DISCOUNT_BORDER2 ){
			
			priceDown = (int)( (price - DISCOUNT_BORDER1) * DISCOUNT_RATE1 ) ;
			
		}else if ( DISCOUNT_BORDER2 < price ){
			
			priceDown = (int)(   (DISCOUNT_BORDER2 - DISCOUNT_BORDER1) * DISCOUNT_RATE1 
			                   + (     price       - DISCOUNT_BORDER2) * DISCOUNT_RATE2   ) ;
			
		}
		
		//上限額（5000円）を超えている場合、割引金額を上限額で再設定する
		if( DISCOUNT_PRICE_MAX < priceDown ){
			priceDown = DISCOUNT_PRICE_MAX ;
		}
		
		//割引適応後の金額を返す
		return price - priceDown ;
		
	}	
}
