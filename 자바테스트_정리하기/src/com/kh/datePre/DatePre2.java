package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {

	public static void main(String[] args) {
		Date now = new Date();
		
		// 년 월 일 형식으로 -이외 / _ 글자를 넣게 되면 자동으로 시 분 초는 값을 읽어오지 못함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatDate = sdf.format(now);
		System.out.println(formatDate);
		
		try {
			Date date = sdf.parse(formatDate);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
