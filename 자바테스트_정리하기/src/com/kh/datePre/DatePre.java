package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		Date now = new Date();

		System.out.println(now);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE HH:mm:ss");
		String formatdate = sdf.format(now);
		System.out.println("날짜 형식 변경 : " + formatdate);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy / MM / dd");
		String formatdate2 = sdf2.format(now);
		System.out.println("날짜 형식 변경 : " + formatdate2);
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a = "2024-05-03 10:52:08";
		
		try {
			Date parseDate = sdf3.parse(a);
			System.out.println(parseDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
