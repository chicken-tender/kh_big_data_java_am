package 입출력스트림예제3_0209;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
// 바이트 출력 스트림의 최상위 추상 클래스는 OutputStream
// 문자 출력 스트림의 최상위 추상 클래스는 Writer 입니다.
// 두 개는 비슷한 성격임
public class Main {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
        char[] data = "입출력 스트림 예제 입니다. ㅋㅋㅋ".toCharArray();
        String data2 = "자바 진도 막바지 입니다.";
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
        writer.write(data2);
        writer.flush(); // write() 이후 버퍼 비움
        writer.close(); // 스트림 자원 반납하고 닫음
    }
}
