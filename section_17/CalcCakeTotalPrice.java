public class CalcCakeTotalPrice {
	
	public static void main(String[] args) {
		
		final String CAKE_NAME_SHT  = "ショートケーキ" ;
        final int    CAKE_PRICE_SHT = 320 ;
		final String CAKE_NAME_MNB  = "モンブラン"  ;  
		final int    CAKE_PRICE_MNB = 350 ;
		final String CAKE_NAME_CHO  = "チョコレートケーキ" ;  
        final int    CAKE_PRICE_CHO = 370 ;  
		final String CAKE_NAME_ICH  = "いちごのタルト" ;  
		final int    CAKE_PRICE_ICH = 400 ;  
		final String CAKE_NAME_CHZ  = "チーズケーキ"  ;  
		final int    CAKE_PRICE_CHZ = 300 ;  
		final int    DISCOUNT_APPLYING_PRICE = 1000 ;  
		final double DISCOUNT_RATE  = 0.8 ;  
        final double TAX            = 1.08 ;

		
		String checkCakeName   = "" ; 
		int    checkCakeCount  = 0 ;  
		int    totalPrice      = 0 ;  
		int    payment         = 0;  
		
		
		for (int i = 0 ; i < args.length ; i += 2) {  
			
		
			checkCakeName  = args[i];
			checkCakeCount = Integer.parseInt( args[i+1] );
			
		
			switch( checkCakeName ){
				
				
				case CAKE_NAME_SHT :
					totalPrice += CAKE_PRICE_SHT * checkCakeCount ;
					break;
				
		
				case CAKE_NAME_MNB :
					totalPrice += CAKE_PRICE_MNB * checkCakeCount ;
					break;
				
		
				case CAKE_NAME_CHO :
					totalPrice += CAKE_PRICE_CHO * checkCakeCount ;
					break;
				
				
				case CAKE_NAME_ICH :
					totalPrice += CAKE_PRICE_ICH * checkCakeCount ;
					break;
				
				
				case CAKE_NAME_CHZ :
					totalPrice += CAKE_PRICE_CHZ * checkCakeCount ;
					break;
				
			}
		}
		

		if (totalPrice > DISCOUNT_APPLYING_PRICE) {        
			
			payment = (int)(totalPrice * DISCOUNT_RATE * TAX);  
			
		}else{                                   

			payment = (int)(totalPrice * TAX);
			
		}
		

		
		System.out.println("合計金額は" + payment + "円です。");
		
	}
}