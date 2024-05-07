package pre.propertiesEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) {
		p.setProperty("1", "순풍산부인과,1998,682");
		p.setProperty("2", "똑바로살아라,2002,239");
		p.setProperty("3", "눈물의여왕,2024,16");
		p.setProperty("4", "아내의유혹,2008,129");
		
		try {
			FileOutputStream fos = new FileOutputStream("drama.xml");
			p.storeToXML(fos, null);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("drama.xml");
			p.loadFromXML(fis);
			fis.close();
			
			List<Drama> dramas = new ArrayList<>();
			for(String key : p.stringPropertyNames()) {
				String[] values = p.getProperty(key).split(",");
				
				String name = values[0];		
				int year = Integer.parseInt(values[1]);
				int series = Integer.parseInt(values[2]);
				
				Drama drama = new Drama(name, year, series);
				dramas.add(drama);
			}
			
			Drama[] dramaSort = dramas.toArray(new Drama[0]);
			Arrays.sort(dramaSort);
			
			System.out.println("드라마 목록 : ");
			for(Drama d : dramaSort) {
				System.out.println(d);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Properties p = new Properties();
		//fileSave(p);
		fileOpen(p);
	}
}
