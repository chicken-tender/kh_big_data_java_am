package 입출력스트림예제4_0209;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
// Reader는 문자 스트림의 최상위 추상 클래스 입니다.
public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int readNo;
        char[] cBuf = new char[256];
        String data = "";
        while(true) {
            readNo = reader.read(cBuf);
            if(readNo == -1) break;
            data += new String(cBuf, 0, readNo);
        }
        System.out.println(data);
        reader.close();
    }
}
