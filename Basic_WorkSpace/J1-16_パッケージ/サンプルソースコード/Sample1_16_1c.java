//mainメソッドを持たないため、別のクラスからインスタンス化されて使用される

package sample;      //CLASSPATHに『.;C:\MyPackage』の設定が必要

public class Sample1_16_1c {
	
	public String makeMessage ( int mon , int date ){
		String message  = "今日は" + mon + "月" + date + "日です" ;
		return message ;
	}
	
}

