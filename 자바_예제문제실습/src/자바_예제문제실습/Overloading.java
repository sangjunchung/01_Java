package 자바_예제문제실습;

public class Overloading {
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
	public void test(String[] s) {}
	private void test(Integer a) {}
	public void tes(char a) {}
	public void test(Character ch) {}
	
	public void test(boolean a) {}
	public void test(Boolean b) {}
	public void test(short s) {}
	public void test(Short c) {}
	
	public void test(int a, String b) {}
	public void test(Integer a, String b) {}

	public void test(String c, int b) {}
	public void test(String c, Integer b) {}
	
	public void test(boolean a, boolean b) {}
	public void test(Boolean a, boolean b) {}
}
