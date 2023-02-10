package 객체직렬화0210;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// 직렬화? 프로그램에서 사용되는 객체를 파일이나 네트워크로 전송하기 위해서 연속적인 바이트 형태로 변경하는 것
// 직렬화된 바이트를 객체로 복원하는 것을 '역직렬화'라고 합니다.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException { // 객체애 대한 직렬화
        writeList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board e : list) {
            System.out.println("번호 : " + e.getNumber());
            System.out.println("제목 : " + e.getTitle());
            System.out.println("내용 : " + e.getContent());
            System.out.println("연출가 : " + e.getWriter());
            System.out.println("시간 : " + sdf.format(e.getDate()));
            System.out.println("------------------------------------");
        }
    }
    static void writeList() throws IOException {
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "나는 솔로","연애 예능","김땡떙", new Date()));
        list.add(new Board(2, "무엇이든 물어보살","예능","이땡떙", new Date()));
        list.add(new Board(3, "차트를 달리는 남자","차트 예능","박땡떙", new Date()));

        FileOutputStream fos = new FileOutputStream("board.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list); // 객체 출력 스트림을 이용해 list를 출력
        oos.flush();
        oos.close();
    }
    static List<Board> readList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("board.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>)ois.readObject(); // 파일의 바이너리를 역직렬화
        return list;
    }
}
