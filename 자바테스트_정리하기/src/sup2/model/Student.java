package sup2.model;

public class Student {
	private String name;
	private int grade;
	private int classNum;
	private int num;
	private char gender;
	private double score;

	public Student(String inName, int inGrade, int inClassNum, int inNum, char inGender, double inScore) {
		this.name = inName;
		this.grade = inGrade;
		this.classNum = inClassNum;
		this.num = inNum;
		this.gender = inGender;
		this.score = inScore;
	}

	public void info() {
		String checkGender = (gender == 'M') ? "남학생" : "여학생";
		
		System.out.printf("이름 : %s, 학년 : %d, 반 : %d, 번호 : %d, 성별 : %s, 성적 : %.1f\n", name, grade, classNum, num, checkGender, score);
	}
}
