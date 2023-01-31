package Properties0131;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
// 키와 값이 모두 String 타입으로 제한된 Map 컬렉션이며 HashTable에서 상속 받았습니다.
// 주로 문자열로 이루어진 파일에 정보를 읽을 때 사용 합니다.
public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); // HashTable 에서 상속 받음 (K,V 모두 문자열)
        String path = Main.class.getResource("../회원정보예제0105/database.properties").getPath(); // 상대경로(내 위치를 기준)
        path = URLDecoder.decode(path, "utf-8"); // == 한글이 포함 될 경우 인식을 못하기 때문에 utf-8로 디코딩하겠다.
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
