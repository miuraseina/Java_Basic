import java.util.Calendar;     //APIからCalendarクラスをインポート
import sample.Sample1_16_1c;   //外部のパッケージsampleからinstanceSampleCクラスをインポート（CLASSPATHの設定が必要）

public class Sample1_16_1a {
	public static void main (String[] args) {
		
		//Calendarクラス（API）をインスタンス化（インスタンス名：instanceCal）
		Calendar instanceCal      = Calendar.getInstance();
		
		//Sample1_16_1bクラス（同じパッケージ）をインスタンス化（インスタンス名：instanceSampleB）
		Sample1_16_1b instanceSampleB = new Sample1_16_1b();
		
		//Sample1_16_1cクラス（外部のパッケージ）をインスタンス化（インスタンス名：instanceSampleC）
		Sample1_16_1c instanceSampleC = new Sample1_16_1c();
		
		/*
		//★インスタンスinstanceCalから現在の月日に関する情報を取得して画面表示する
		//  - instanceCal.get( Calendar.MONTH ) … インスタンスinstanceCalより現在の月に関する値※を取得します
		//      ※月の値は1月=0,2月=1,…,12月=11（0からカウント）で値を返します
		//  - instanceCal.get( Calendar.DATE )  … インスタンスinstanceCalより現在の日に関する値※を取得します
		//      ※日の値は1日=1,2日=2,…（1からカウント）で値を返します
		//  - instanceSampleB.realMonth( ～ )   … 引数に＋１した値を返します
		//  - instanceSampleC.makeMessage(〇,△)    … 文字列「今日は〇月△日です」を返します
		*/
		int month = instanceSampleB.realMonth( instanceCal.get( Calendar.MONTH ) );     //現在の月の値を取得
		
		int date  = instanceCal.get( Calendar.DATE );                                   //現在の日の値を取得
		
		System.out.println( instanceSampleC.makeMessage( month , date ) );               //画面に「今日は〇月△日です」と表示
	}
}

