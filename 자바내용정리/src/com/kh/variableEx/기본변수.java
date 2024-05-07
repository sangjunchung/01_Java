package com.kh.variableEx;

/*
자료형 변수명 = 변수값;
type name = literal;

변수
기본 자료형 = primitive
	숫자 : byte short int long - 기본 값 : int
	문자 : char - ''사용하며 한 글자만 들어갈수 있음
	실수 : float double - 기본 값 : double 
	참거짓 : true false - 기본 값 : false

참조 자료형 = reference
	문자열 : String - "" 사용하며 문자를 모두 나열하는 문자열, 특수문자등 모든 것 사용 가능
	
상수형 
	final 자료형 상수명 = 값;
ex. final int MAX_NUM = 100; - 상시적으로 변하지 않는 수 값, 한번 정해진 값에서 변경 불가능, 이름을 대문자로 표기	

열거형 ( enum )
	상수를 하나씩 작성하기 번거로우니 관련있는 상수들을 한번에 { } 안에 작성해서
	final 과 자료형을 생각해서 작성하는 상수 표기 방법
	
	ex. 요일, 계절과 같이 변함없는 대상들
	enum 대표이름(계절) { 상수를 모두 작성(봄, 여름, 가을, 겨울) }
	
*/

// 변수명은 어떤 특정 행위나 행동을 하기 위한 것이 아니기 때문에 메서드 안에 작성하지 않아도 괜찮음
// System.out.print 와 같이 행동(출력)을 하기 위한 표기는 메서드 안에 작성해줘야함
public class 기본변수 {
	int num = 10;
	byte b = 2;
	short sh = 3;
	long lg = 100L;
	
	float ft = 3.14f;
	double db = 3.14;
	
	char ch = 'A';
	
	boolean bln = false;
	
	String name = "가나다"; 
	
	final int MAX_NUMBER = 100;
	final double PI = 3.14;
	final String rule = "변경되면 안되는 규칙";
	
	enum Day{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	
}
