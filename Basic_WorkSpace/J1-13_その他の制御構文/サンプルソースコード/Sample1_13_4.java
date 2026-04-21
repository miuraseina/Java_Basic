class Sample1_13_4 {
	public static void main (String[] args) {
		
		//switch文のしくみ
		
		int num = Integer.parseInt(args[0]) ;  //コマンドライン引数で受け取った値
		
		switch (num){
			
			case 1:
				System.out.println("非常に不満");
				break;
			
			case 2:
				System.out.println("少し不満");
				break;
			
			case 3:
				System.out.println("どちらとも言えない");
				break;
			
			case 4:
				System.out.println("少し満足");
				break;
			
			case 5:
				System.out.println("大変満足");
				break;
			
			default:
				System.out.println("満足度は1～5で答えて下さい");
				break;
		}
	}
}
