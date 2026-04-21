class Sample1_13_2 {
	public static void main (String[] args) {
		
		//ラベル（break文）のしくみ
		
		System.out.println("▼ラベル（break文）のしくみ ※ラベルなし");
		
		for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("　　▼最初にi*jが15を越えるくみあわせ");
					System.out.println("　　i：" + i + " / j：" + j);
					break;
				}
			}
		}
		
		
		System.out.println("▼ラベル（break文）のしくみ ※ラベルあり");
		
		uzuz1:for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("　　▼最初に i*j > 15 となるiとjの組み合わせ");
					System.out.println("　　i：" + i + " / j：" + j);
					break uzuz1;
				}
			}
		}
	}
}
