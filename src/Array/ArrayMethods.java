package Array;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ArrayMethods {

	public static void main(String[] args) {
		String query="SendOTE.drt?email=rkroy39@gmail.com &txtCaptchaName=123";
		
		String[] arr = query.split("&");
		System.out.println("arr"+arr[0] +arr[1]);
        String email = (arr[0].split("="))[1];
		System.out.println("email"+email);

        String captcha = (arr[1].split("="))[1];
		System.out.println("captcha"+captcha);
		Calendar cal = Calendar.getInstance();
		System.out.println("calenar"+cal);
		cal.getTime();
		System.out.println("cal.getTime()"+cal.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY HH:mm:ss");
		sdf.format(cal.getTime());
		System.out.println(sdf.format(cal.getTime()));
	}
}
