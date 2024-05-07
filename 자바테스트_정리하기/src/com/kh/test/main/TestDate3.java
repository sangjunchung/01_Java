package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {

	public static void main(String[] args) {
		int myBY = 1987;
		int myBM = 8;
		int myBD = 14;

		Calendar nowDate = Calendar.getInstance();
		int nowYear = nowDate.get(Calendar.YEAR);
		int nowMonth = nowDate.get(Calendar.MONTH) + 1;
		int nowDay = nowDate.get(Calendar.DAY_OF_MONTH);

		int age = nowYear - myBY;
		if (nowMonth < myBM || (nowMonth == myBM && nowDay < myBD)) {
			age--;
		}

		Calendar birth = new GregorianCalendar(myBY, myBM - 1, myBD);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");

		System.out.println("생일 : " + sf.format(birth.getTime()));
		System.out.println("현재 : " + sf.format(nowDate.getTime()));
		System.out.println("나이 : " + age + "세");

	}
}
