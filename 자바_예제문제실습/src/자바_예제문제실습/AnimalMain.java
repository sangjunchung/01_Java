package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AnimalMain {
	
	public void fileSave(String fileName) {
		File file = new File(fileName);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Animal ani = new Animal("멧돼지", 3);
			
			bw.write(ani.toString());
			System.out.println("파일이 성공적으로 저장되었습니다.");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal("코끼리", 2);
		System.out.println(animal);
		
		AnimalMain animalMain = new AnimalMain();
		animalMain.fileSave("animal.txt");
	}
}
