package Vector예제0130;
import java.util.List;
import java.util.Vector;
// Vector는 ArrayList와 내부적으로 동일한 구조 입니다. 메소드의 사용 방법도 완전히 동일, 멀티스레드에 안전(잠금설정이 있음)
public class Main {
    public static void main(String[] args) {
        // 값을 넣었다뺐다가 많으면 LinkedList, 계속 추가해야하면 ArrayList, 여러 스레드에서 사용해야 하면 Vector
        List<NameCard> n1 = new Vector<>();
        n1.add(new NameCard("양콩미","010-1234-1234","aaa@naver.com","Junior",
                "서울시 강남구"));
        n1.add(new NameCard("홍길동","010-0987-1234","bbb@kakao.com","Junior",
                "수원시 영통구"));
        n1.add(new NameCard("도레미","010-3422-1234","ccc@naver.com","Senior",
                "서울시 송파구"));

        for(NameCard e : n1) {
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호 : " + e.phone);
            System.out.println("메일 : " + e.mail);
            System.out.println("직급 : " + e.position);
            System.out.println("주소: " + e.address);
            System.out.println();
        }
    }
}
class NameCard {
    String name;
    String phone;
    String mail;
    String position;
    String address;
    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}