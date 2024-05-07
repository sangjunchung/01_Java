package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String a = sdf1.format(now);
		System.out.println(a);
		
		try {
			Date parseDate1 = sdf1.parse(a);
			System.out.println(parseDate1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String b = sdf2.format(now);
		System.out.println(b);

		try {
			Date parseDate2 = sdf2.parse(b);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String c = sdf3.format(now);
		System.out.println(c);
		
		try {
			Date parseDate3 = sdf3.parse(c);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
