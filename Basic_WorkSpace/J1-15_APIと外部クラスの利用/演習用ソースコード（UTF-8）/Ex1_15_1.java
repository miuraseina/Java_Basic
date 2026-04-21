/*-< 演習：Ex1_15_1 >---------------------------------
BigDecimalの扱いについてAPIドキュメントなどで調べながら
以下の結果が表示されるプログラムを作ってみましょう！
----------------------------------------------------*/
import java.math.RoundingMode;
import java.math.BigDecimal;


class Ex1_15_1{
	public static void main (String[] args) {
		
		//(1) 0.2 * 83 - 10.6
		BigDecimal bd1_1      = new BigDecimal( "0.2" );
		BigDecimal bd1_2      = new BigDecimal( "83" );
		BigDecimal bd1_3      = new BigDecimal( "-10.6" );
		BigDecimal bd1_result = ( bd1_1.multiply( bd1_2 ) ).add( bd1_3 );
		System.out.println(bd1_result);
		
		
		//(2) 0.2 * 83 - 10.6 / 3　※小数第2位までで表示（小数第3位以下は四捨五入）
		//<補足>
		// BigDecimalによる割り算は丸めの指定が必要です！
		// XXX ÷ YYYをして小数第2位で表示（小数第3位以下は切り捨て）
		// XXX.divide(YYY, 2, RoundingMode.DOWN);

		BigDecimal bd2_1     = new BigDecimal( "0.2" );
		BigDecimal bd2_2     = new BigDecimal( "83" );
		BigDecimal bd2_3     = new BigDecimal( "-10.6" );
		BigDecimal bd2_4     = new BigDecimal( "3" );
		BigDecimal bd2_result = ( bd2_1.multiply( bd2_2 ) ).add( bd2_3.divide( bd2_4 , 2 , RoundingMode.HALF_UP));
		System.out.println(bd2_result);
		
	

		
		
	}
}
