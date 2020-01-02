package practicePrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) {
		String s = "07:05:45PM";
		String result = timeConversion(s);
		System.out.println(result);
	}

	private static String timeConversion(String s) {
		String format24 = null;
		try {
			SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
		    SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
		    Date date = inputFormat.parse(s);
		    System.out.println(inputFormat.format(date) + " = " + outputFormat.format(date));
		    format24 = outputFormat.format(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return format24;
	}

}
