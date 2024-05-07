package pre.propertiesEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) {
		p.setProperty("1", "패밀리맨,4,2000");
		p.setProperty("2", "엔리멘탈,5,2023");
		p.setProperty("3", "투모로우,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movie.xml");
			p.storeToXML(fos, "movies is fun.");
			fos.close();
			
			System.out.println("설정이 movies.xml 파일에 저장되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
	}
}
