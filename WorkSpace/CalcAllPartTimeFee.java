import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

class CalcAllPartTimeFee {
	
	public static void main(String[] args) {

		
		final String COMMA = "," ; //コンマ
		

		
		List<String> workingResults = new ArrayList<String>();   
		
		try {
			File file = new File("C:\\WorkSpace\\WorkingResult.csv");       
			BufferedReader br = new BufferedReader(new FileReader(file));

			
			String recode = br.readLine();
			while (recode != null) {
				workingResults.add(recode);
				recode = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		int partTimeFeeByMonth = 0 ; 
		
		
		for (int i = 0; i < workingResults.size(); i++) {
			
			
			String   workingRecordSt = workingResults.get(i);
			
			
			String[] workingRecordAr = workingRecordSt.split(COMMA);
			
			
			partTimeFeeByMonth += calcPartTimeFeeByTheDay( workingRecordAr[1] , workingRecordAr[2] ) ;
			
		}
		
		
		System.out.println("今月の給与は、" + partTimeFeeByMonth + "円です。");
		
	}
	
	

	public static int calcPartTimeFeeByTheDay( String st , String ed ) {
		
		
		final int    HOURLY_SALARY            = 900                          ; 
		final int    MINUTES_SALARY           = HOURLY_SALARY / 60           ; 
		final int    CONV_HOUR_TO_MILLISEC    = 1000 * 60 * 60               ; 
		final int    CONV_MINUTE_TO_MILLISEC  = 1000 * 60                    ; 
		final int    CONV_HOUR_TO_MINUTE      = 60                           ; 
		final long   WORK_TIME_TYPE1_END      = 6  * CONV_HOUR_TO_MILLISEC   ; 
		final long   WORK_TIME_TYPE2_START    = 6  * CONV_HOUR_TO_MILLISEC   ; 
		final long   WORK_TIME_TYPE2_END      = 8  * CONV_HOUR_TO_MILLISEC   ; 
		final long   WORK_TIME_TYPE3_START    = 8  * CONV_HOUR_TO_MILLISEC   ; 
		final long   REST_TIME_TYPE1          = 45 * CONV_MINUTE_TO_MILLISEC ; 
		final long   REST_TIME_TYPE2          = 60 * CONV_MINUTE_TO_MILLISEC ; 
		final double OVERTIME_SALARY_RATE     = 1.25                         ; 
		final int    ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN = 8  * CONV_HOUR_TO_MINUTE ; 
		
		//------------変数の定義------------
		Time startTime            = Time.valueOf( st )                         ; //出勤時間
		Time finishTime           = Time.valueOf( ed )                         ; //退勤時間
		long workTime             = finishTime.getTime() - startTime.getTime() ; //労働時間（ミリ秒）
		int  actualWorkTimeMin    = 0                                          ; //実労働時間（分）※休憩時間を差し引いた労働時間
		int  partTimeFee          = 0                                          ; //給与
		
		

		if (workTime <= WORK_TIME_TYPE1_END) {
			
			
			
			actualWorkTimeMin = (int)( workTime / CONV_MINUTE_TO_MILLISEC ) ;
			
		} else if (workTime > WORK_TIME_TYPE2_START && workTime <= WORK_TIME_TYPE2_END) {
			
			
			
			actualWorkTimeMin = (int)( (  workTime - REST_TIME_TYPE1 ) / CONV_MINUTE_TO_MILLISEC ) ;
			
		} else if (workTime > WORK_TIME_TYPE3_START){
			
			
			
			actualWorkTimeMin = (int)( ( workTime - REST_TIME_TYPE2 ) / CONV_MINUTE_TO_MILLISEC ) ;
			
		}
		
		
----------------------------------------------------------------------------
		
		if( actualWorkTimeMin > ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN ){
			
			
		
			partTimeFee = ( MINUTES_SALARY * ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN )
			              + (int)( MINUTES_SALARY * OVERTIME_SALARY_RATE * ( actualWorkTimeMin - ACTUAL_WORK_TIME_OVERTIME_OCCUR_MIN ) ) ;
			
		}else{
			
			
			partTimeFee = MINUTES_SALARY * actualWorkTimeMin ;
		}
		
--------------------------------------------------------------------------
		
		return partTimeFee ;
	}
}
