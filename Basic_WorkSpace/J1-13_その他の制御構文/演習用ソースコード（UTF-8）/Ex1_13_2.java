/*-< 演習：Ex1_13_2 >---------------------------------
コマンドライン引数で受け取った整数（A型：1, B型：2, O型：3, AB型：4）に応じて、
以下の実行結果を表示するプログラムを作成してください。
ただし、switch文を必ず使用してください。

  (A型)が入力された場合 ："あなたは几帳面な性格の方ですね？"
  (B型)が入力された場合 ："あなたはマイペースな性格の方ですね？"
  (O型)が入力された場合 ："あなたは大雑把な性格ですね？"
  (AB型)が入力された場合："あなたは天才肌な方ですね？"
  上記以外              ："数字の1～4で答えてください"

----------------------------------------------------*/
public class Ex1_13_2 {
	public static void main (String[] args) {


    //定数
		final String MESSAGE_A       = "あなたは几帳面な性格の方ですね？";       //メッセージ（A型）
		final String MESSAGE_B       = "あなたはマイペースな性格の方ですね？";   //メッセージ（B型）
		final String MESSAGE_O       = "あなたは大雑把な性格ですね？";           //メッセージ（O型）
		final String MESSAGE_AB      = "あなたは天才肌な方ですね？";             //メッセージ（AB型）
		final String MESSAGE_DEFAULT = "数字の1～4で答えてください";             //メッセージ（その他）
		
		
		int bloodTypeNumber = Integer.parseInt(args[0]) ;
		
		switch(bloodTypeNumber){
			case 1:                                //血液型ナンバー（A型：1）の場合
				System.out.println(MESSAGE_A);
				break;
			
			case 2:                                //血液型ナンバー（B型：2）の場合
				System.out.println(MESSAGE_B);
				break;
			
			case 3:                                //血液型ナンバー（O型：3）の場合
				System.out.println(MESSAGE_O);
				break;
			
			case 4:                                //血液型ナンバー（AB型：4）の場合
				System.out.println(MESSAGE_AB);
				break;
			
			default:                               //血液型ナンバーが1～4以外の場合
				System.out.println(MESSAGE_DEFAULT);
				break;
		}
		
		
		
	}
}
