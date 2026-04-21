class Sample1_13_3 {
	public static void main (String[] args) {
		
		//ラベル（continue文）のしくみ
		System.out.println("▼ラベル（continue文）のしくみ ※ラベルなし");
		
		for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("　　▼iが" + i  + "のとき最初に i*j > 15 となるjの値");
					System.out.println("　　j：" + j);
					continue;
				}
			}
		}
		
		System.out.println("▼ラベル（continue文）のしくみ ※ラベルあり");
		
		uzuz2:for(int i = 1 ; i < 6 ; i++){
			for(int j = 1 ; j < 6 ; j++){
				if(i * j > 15){
					System.out.println("　　▼iが" + i  + "のとき最初に i*j > 15 となるjの値");
					System.out.println("　　j：" + j);
					continue uzuz2;
				}
			}
		}
	}
}
