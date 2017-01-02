package gakugeiJob.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateHelper {

	public static String format(Date date, String format){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.JAPAN);
		return simpleDateFormat.format(date);
	}

	public static String formatMD(Date date){
		return format(date, "M月d日");
	}
	
	public static String formatYMDE(Date date){
		return format(date, "yyyy年M月d日(E)");
	}
	
	public static String formatYMD1(Date date){
		return format(date, "yyyy年MM月dd日");
	}
	
	public static String formatYMD2(Date date){
		return format(date, "yyyy-MM-dd");
	}
	
	public static Date parse(String str) throws ParseException{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
		return simpleDateFormat.parse(str);
	}
}
