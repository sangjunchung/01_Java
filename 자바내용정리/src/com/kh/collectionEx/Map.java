package com.kh.collectionEx;

/*
Map	키(key) - 값 (value) 한 쌍의 집합을 이루는 구조
	키의 값에는 숫자를 넣어도 되고, 문자를 넣어도 됨, 문자열을 넣어도 되고 어떤 값이 들어가도 괜찮음
	값 또한 모든 값이 들어갈 수 있음
	
	값은 중복이 가능하지만, 키는 중복이 될 수 없음
	만약 중복되는 키를 입력하면 이전 값에 새로운 값으로 덮어씌움
	기본적으로 순서가 보장되지 않으며, 순서를 보장하고 싶다면 LinkedHashMap을 사용해야함

메서드 
put(key, value) : 지정된 키와 값을 map에 추가, 만약 동일한 키가 존재한다면 이전 값은 새로운 값으로 대체
get(key) : 지정된 키에 해당하는 값을 보여줌, 만약 키가 존재하지 않는다면 null 반환
containsKey(key) : 맵에 지정된 키가 포함되어 있는지 확인
containsValue(value) : 맵에 지정된 값이 포함되어 있는지 확인
remove(key) : 지정된 키와 해당하는 값을 제거

HashMap : 가장 많이 사용하는 Map
TreeMap : 이진 트리로 빠른 검색이 필요할 때 사용
LinkedHashMap : 순서를 보장하는 연결이 필요할 때 사용

Map.Entry<key(자료형), value(자료형)>
	Map 인터페이스 안에서 작성된 내부 클래스 Entry : 키와 값의 쌍을 나타냄
	보통은 entrySet() 메서드를 사용해서 키-값에 대한 정보를 보여줌
*/

public class Map {

}
