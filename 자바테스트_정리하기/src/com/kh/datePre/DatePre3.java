package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy / MM / dd / E");
		String formatDate = sdf.format(now);
		System.out.println(formatDate);
		
		System.out.println("주민번호를 8자리 입력해주세요.");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String a = sdf2.format(now);
		System.out.println(a);
		
		System.out.println("주민번호를 6자리 입력해주세요.");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
		String b = sdf3.format(now);
		System.out.println(b);
	}
}
