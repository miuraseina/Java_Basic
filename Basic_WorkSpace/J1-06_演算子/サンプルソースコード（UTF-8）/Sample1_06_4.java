class Sample1_06_4 {
	public static void main (String[] args) {
		
		//論理演算子の活用
		
		int numberX = 8 ;
		int numberY = 4 ;
		int numberZ = 5 ;
		
		//『 && 』
		boolean logicalValue1 = numberX != numberY && numberY > numberZ ;
		System.out.println("logicalValue1：" + logicalValue1);
		
		//『 || 』
		boolean logicalValue2 = numberX != numberY || numberY > numberZ ;
		System.out.println("logicalValue2：" + logicalValue2);
		
		//『 ^ 』
		boolean logicalValue3 = numberX != numberY ^ numberY > numberZ ;
		System.out.println("logicalValue3：" + logicalValue3);
		
		// 反転
		boolean logicalValue4 = !logicalValue3 ;
		System.out.println("logicalValue4：" + logicalValue4);
		
	}
}
