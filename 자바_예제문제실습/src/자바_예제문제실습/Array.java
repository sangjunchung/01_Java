package 자바_예제문제실습;

public class Array {

	public static void main(String[] args) {
		Circle[] cirs = new Circle[2];
		cirs[0] = new Circle(3.5);
		cirs[1] = new Circle(5.5);
		
		for(int i=0; i<cirs.length; i++) {
			System.out.println(cirs[i].getRadius());
		}
	}
}
