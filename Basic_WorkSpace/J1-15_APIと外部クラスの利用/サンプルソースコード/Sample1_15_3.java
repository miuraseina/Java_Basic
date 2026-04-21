import java.util.List;
import java.util.ArrayList;

class Sample1_15_3{
	public static void main (String[] args) {
		
		//APIの活用（ArrayList）
		
		List<String> dogsNameList = new ArrayList<String>();
		
		dogsNameList.add("タロウ");   //インデックス0で要素が生成される
		dogsNameList.add("グレース"); //インデックス1で要素が生成される
		dogsNameList.add("モコ");     //インデックス2で要素が生成される
		dogsNameList.add("チョコ");   //インデックス3で要素が生成される
		
		System.out.println("▼「dogsNameList.remove(1)」実行前");
		for( int i = 0 ; i < dogsNameList.size() ; i++ ){
			System.out.println( dogsNameList.get(i) );
		}
		
		dogsNameList.remove(1);
		
		System.out.println("▼「dogsNameList.remove(1)」実行後");
		for( int i = 0 ; i < dogsNameList.size() ; i++ ){
			System.out.println( dogsNameList.get(i) );
		}
		
	}
}