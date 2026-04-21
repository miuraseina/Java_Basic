/*-< 演習：Ex1_11_1 >---------------------------------
while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成してください。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示してください
----------------------------------------------------*/
class Ex1_11_1 {
	public static void main (String[] args) {


		int dice = 0 ;        //サイコロの目（初期値：0）
		
		//サイコロを振る（1～6までのランダムな値を格納）
		dice =  1 + (int)( Math.random() * 6.0 ) ;
		
		//サイコロの目を表示
		System.out.println(dice) ;
		
		//--------------------------------
		//6の目がでるまでサイコロを降り続ける
		//--------------------------------
		while( dice != 6 ){
			
			//サイコロを振る（1～6までのランダムな値を格納）
			dice =  1 + (int)(Math.random() * 6.0) ;
			
			//サイコロの目を表示
			System.out.println(dice) ;
			
		}
		
		//終了メッセージを表示
		System.out.println("「6が出たのでを終了します」") ;
		
	}
}
/*

		int dice = 0;

		dice = 1 + (int)(Math.random() * 6.0) ;

		System.out.println(dice);

	

		
		while( dice != 6 );{

			dice = 1 + (int)(Math.random() * 6.0) ;
			
			System.out.println("「6が出たのでを終了します」");
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
*/