package basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timedate {
public static void main(String[] args) {
//	Long stringDate1=(Long) System.currentTimeMillis();
//		String stringDate =""+stringDate1;
//		System.out.println(stringDate);
	
	String DATE_FORMAT_NOW = "yyyy-MM-dd hh:mm:ss:SSS Z";
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
    String stringDate = sdf.format(date); 
    try {
		Date date2 = sdf.parse(stringDate);
		System.out.println(stringDate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
