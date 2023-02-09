package 입출력스트림예제1_0209;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
// 입출력 스트림? 컴퓨터 내부와 외부장치 간 데이터를 주고 받는 것을 의미하며, 입출력 데이터를 공통적인 방법으로 처리하기 위함
// 바이트 스트림 : byte 단위로 데이터를 전송하는 것 (성능 우수, 파일로 저장시 결과 확인 불가)
// 바이트 스트림의 최상위 추상 클래스는 OutputStream 입니다.
public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.bin");
        byte[] array = {10,20,30,40,50};
        os.write(array, 1, 4); // 배열 인덱스 1부터 3개 출력
        os.flush(); // write() 이후 반드시 버퍼를 비우는 동작이 필요 !!
        os.close(); // 자원 반납 및 스트림 닫기
    }
}
