class jihan{
    public static void main (String[] args) {


		int coinNum = args.length ;          //投入された硬貨の枚数
		int coinChk = 0 ;                    //チェック対象の硬貨の金額
		int coinSum = 0 ;                    //投入された硬貨の合計金額 ※使用可能な硬貨のみで算出
		
		//投入された硬貨を1枚ずつチェックし、合計金額を取得（使用できない場合はエラーメッセージを出力）
		for(int i = 0 ; i < coinNum ; i++){
			
			//今回のループでチェックする硬貨をセット
			coinChk = Integer.parseInt(args[i]) ;
			
			//チェックと硬貨の種類に応じた処理を実施
			if( coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500 ){
				
				//使用可能な硬貨であった場合、coinSumに加算
				coinSum += coinChk ;
				
			}else if( coinChk == 1 || coinChk == 5 ){
				
				//使用不可能な硬貨であった場合、エラーメッセージ（使用不可能な硬貨）を出力
				System.out.println("警告：" + coinChk + "円玉は使えません");
				
			}else{
				
				//不正な硬貨であった場合、エラーメッセージ（不正な硬貨）を出力
				System.out.println("警告：" + coinChk + "は硬貨として適切な値ではありません");
				
			}
		}
		
		//投入された硬貨の合計金額をメッセージとして出力
		System.out.println("ただいまの投入金額は" + coinSum + "円です");

















    }

		

    







}