package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {

	public void fileSave(String fileName) {
		File file = new File(fileName);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person person1 = new Person("김영희", 10);
			
			bw.write(person1.toString());
			System.out.println("파일이 성공적으로 저장되었습니다.");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		pm.fileSave("Person.txt");
	}
}
