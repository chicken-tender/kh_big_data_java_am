package 제네릭일반0127;
import java.util.ArrayList;
import java.util.List;
// 컴파일 시 강한 타입 체크 / 자바8 이전 대비 변경 사항
// 타입 변환 제거 / 자바8 이전 대비 변경 사항
public class Main {
    public static void main(String[] args) {
        // 자바 8 이전 스타일
//        List list = new ArrayList();
//        list.add("안녕하세요.");
//        list.add(0); // 오류 안남.
//        String str = (String) list.get(1); // 객체 생성 시 데이터 타입을 지정 안했기 때문에 타입 캐스팅 해줘야 함.
//        동작하면 안되는데 오류가 안남..컴파일이 안잡아냄. 동작 실행시 죽기 때문에 일이 커질 수 있다!

        // 제네릭 타입
        // String 이외에는 안받겠다고 처음에 데이터타입 지정!(=강한 타입 체크)
        // 정리하면 List에서 사용할 데이터 타입을 미리 지정함으로써 컴파일 시 타입체크가 일어나도록 함.
        List<String> list = new ArrayList<>();
        list.add("hello");
        String str = list.get(0); // 타입 변환 제거, 0번째 값을 읽어옴.
        System.out.println(str);
    }
}
