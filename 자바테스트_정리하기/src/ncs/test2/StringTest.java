package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";

		String[] numbers = str.split(",");

		double[] values = new double[numbers.length];

		for (int i = 0; i < values.length; i++) {
			values[i] = Double.parseDouble(numbers[i]);
		}

		double total = 0.0;
		for (double db : values) {
			total += db;
		}
		double avg = total / values.length;

		System.out.println("원래 주어진 값 : " + str);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
	}

}
