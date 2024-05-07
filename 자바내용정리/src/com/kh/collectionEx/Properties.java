package com.kh.collectionEx;

/*
Properties 키(key) 값(value) 문자열 형태로 저장되는 클래스
		   일반적으로 속성파일을 읽거나 쓰는데 사용
		   주로 텍스트파일로 저장됨, 키와 값이 모두 문자열
		   
		   Properties 키와 값을 설정할 때 한글로 작성해서 파일로 저장할 경우
		   한글이 유니코드 형태로 보일수 있으므로 (ex. \U5BC)
		   영어로 작성하는 것을 권장
		   
		   Properties 는 설정파일이고, 자바에서 코드로 작성을해서 파일로 보낼 때는
		   " " 를 사용해서 키와 값을 넣지만 추후 저장되는 값은 무조건 String이 아니기 때문에
		   Object를 사용해서 전체조회를 할 수 있음
		   
메서드
load() : 파일을 대기
store() : 파일을 저장
gerProperty() : 값 전달
setProperty() : 값 설정
loadFromXML() : xml 파일을 대기
storeToXML() : xml 파일을 저장

파일안에 주석을 작성할 수 있음 주석은 # ! 사용
*/

public class Properties {

}
