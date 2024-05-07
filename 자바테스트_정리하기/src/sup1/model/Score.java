package sup1.model;

public class Score {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Score(int inKor, int inEng, int inMath) {
		this.kor = inKor;
		this.eng = inEng;
		this.math = inMath;
	}

	public void score() {
		total = kor + eng + math;
		avg = total / 3.0;
		String result = (kor >= 50 && eng >= 50 && math >= 50 && avg >= 50) ? "합격" : "불합격";

		System.out.printf("국어 점수 : %d, 영어 점수 : %d, 수학 점수 : %d\n", kor, eng, math);
		System.out.println("결과 : " + result);
	}
}
