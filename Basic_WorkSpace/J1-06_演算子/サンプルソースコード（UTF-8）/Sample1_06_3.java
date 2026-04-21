class Sample1_06_3 {
	public static void main (String[] args) {
		
		//関係演算子の活用
		
		int numberX = 8 ;
		int numberY = 8 ;
		int numberZ = 7 ;
		char chNumberX = 'あ';
		char chNumberY = 'あ';
		
		//『 == 』
		boolean logicalValue1 = numberX == numberY ;
		System.out.println("logicalValue1：" + logicalValue1);
		
		//『 != 』
		boolean logicalValue2 = numberX != numberY ;
		System.out.println("logicalValue2：" + logicalValue2);
		
		//『 > 』
		boolean logicalValue3 = numberX > numberZ ;
		System.out.println("logicalValue3：" + logicalValue3);
		
		//『 >= 』
		boolean logicalValue4 = numberX >= numberY ;
		System.out.println("logicalValue4：" + logicalValue4);
		
		//『 < 』
		boolean logicalValue5 = numberX < numberZ ;
		System.out.println("logicalValue5：" + logicalValue5);
		
		//『 <= 』
		boolean logicalValue6 = numberX <= numberY ;
		System.out.println("logicalValue6：" + logicalValue6);
		
		//『 == 』（関係代名詞は数値以外にも使用可能：char型）
		boolean logicalValue7 = chNumberX == chNumberY ;
		System.out.println("logicalValue7：" + logicalValue7);
		
		//『 == 』（関係代名詞は数値以外にも使用可能：boolean型）
		boolean logicalValue8 = logicalValue1 == logicalValue2 ;
		System.out.println("logicalValue8：" + logicalValue8);
		
	}
}
