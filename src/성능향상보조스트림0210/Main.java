package 성능향상보조스트림0210;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null; // 입력 보조 스트림
        BufferedOutputStream bos = null; // 출력 보조 스트림

        int data = -1; // 더 이상 읽을 데이터가 없음을 의미
        long start = 0; // 경과 시간 계산을 위한 변수
        long end = 0; // 경과 시간 계산을 위한 변수

        fis = new FileInputStream("src/성능향상보조스트림0210/night.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("clone_night.jpg");
        start = System.currentTimeMillis(); // 1970년 1월 1일 0시 0분 0초로 부터 현재까지 경과 시간을 밀리초로 표시
        while((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 사용을 하지 않은 경우에 대한 시간 : " + (end - start) + "ms");

        // 버퍼 보조 스트림 두어서 성능 측정
        fis = new FileInputStream("src/성능향상보조스트림0210/night.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("clone_night.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        bos.close();
        System.out.println("버퍼를 사용하는 경우에 대한 시간 : " + (end - start) + "ms");
    }
}
