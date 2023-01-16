import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UtilityClassDemo {
	public static void main(String[] args) {
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime()); //1660199913263
//		File file = new File("C:/Temp/sungjuk_utf8.dat");
//		long last = file.lastModified(); //마지막 수정 시간
//		System.out.println(last);
//		Date createTime = new Date(last);
//		System.out.println(createTime);
//		Date before = new Date(1660199913263L);
//		System.out.println(before);
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		//int day = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + month + "월 " + day + "일입니다.");
		
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.FRANCE);
		System.out.println(df.format(new Date()));
		
		String pattern = "오늘은 YYYY년 MM월 dd일입니다.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다.\n",new Date());
	}
}
