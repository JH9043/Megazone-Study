import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
//		Properties infos = System.getProperties(); //자바 애플리케이션이 시스템에게 얘기한다 OS에 가서 자바 관련 시스템 정보 가져오셈
//		Set<Object> set = infos.keySet();
//		for(Object obj : set) {
//			System.out.print(obj + " -> " );
//			String key = (String)obj;
//			System.out.println(infos.getProperty(key));
//		}
		
		File file = new File("dbinfo.properties");
		FileInputStream fis = null;
		Properties props = new Properties();
		try {
			fis = new FileInputStream(file);
			props.load(fis);
			Enumeration<Object> enums = props.keys();
			while(enums.hasMoreElements()) {
				String key = (String)enums.nextElement();
				System.out.println(key + " -> " + props.getProperty(key));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
