package 자바_예제문제실습;

public class Animal {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Animal() {
	
	}

	public Animal(String name, int age) {

		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "동물의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.";
	}
}
