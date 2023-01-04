//2023.01.03
package 입출력예제2_0102;

import java.util.Scanner; // 두번째로 많이 사용되는 자바 API

// 콘솔 입력
// System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어 들임.
// Scanner 입력 : 키보드에서 입력 받은 것을 원하는 데이터 타입으로 반환 받음
public class ScannerEx {
    public static void main(String[] args) {
//        while(true) { //반복문
//            try {
//                int ketCode = System.in.read();
//                System.out.println("KeyCode : " + ketCode);
//                if(ketCode == 'q') break;
//            } catch(IOException e) {
//                e.printStackTrace();
//            }
//        }
        Scanner sc = new Scanner(System.in); // Scanner 클래스를 가져와서 'sc'라는 변수(객체)를 생성
        //sc는 참조타입의 변수(실제 값은 힙 메모리 주소에 저장됨)
        //sc는 지역변수. 지역변수는 stack 메모리에 저장
        byte a = sc.nextByte(); // 키보드의 입력을 byte형으로 반환
        short b = sc.nextShort(); // short형으로 반환
        int c = sc.nextInt(); // int형으로 반환
        char ch = sc.next().charAt(0); // 문자열(next())에서 0번째 문자를 추출
        String d = sc.next(); //문자열을 공백 단위로 입력 받음. 예)서울시 강남구 -> 서울시
        String e = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음

        }
}
