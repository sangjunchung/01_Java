package 자바_예제문제실습;

import java.io.FileWriter;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("animal.txt", true);
			fw.write("코뿔소, 10");
			fw.write("코끼리친구코뿔소");
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
