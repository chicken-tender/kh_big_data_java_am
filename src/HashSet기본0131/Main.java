package HashSet기본0131;
import java.util.Arrays;
import java.util.HashSet;
// HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않습니다.
// 중복 여부 확인은 HashCode()의 리턴값을 이용 합니다. (경우에 따라 오버라이딩*)
// *밑에 예제에 객체의 id를 같게 했을 때도 출력되는 문제 발생(객체 주소가 다르기 때문에 hashCode()가 다르다고 인식했기 때문)
// *** Set 클래스는 hashCode() 리턴 값이 같고, equals() 리턴값이 true면 동등 객체로 봄.
// *하여 hashCode()와 equals()를 오버라이딩 하여 코드 수정
public class Main {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();
        set.add(new Member(1000, "양콩미"));
        set.add(new Member(1001, "강민경"));
        set.add(new Member(1002, "홍길동"));
        Member member = new Member(1003, "한라봉");
        set.add(member);
        set.add(new Member(1002, "김딸기"));

        for(Member e : set) {
            e.showMember();
        }
    }
}

class Member {
    int id;
    String name;

    @Override // Object의 hashCode()를 오버라이딩
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) { // 모든 클래스 중 Member 클래스 타입이면 true
            Member member = (Member) obj; // 부모 객체에서 자식 객체로 변환하기 때문에 다운캐스팅 사용
            if(this.id == member.id) return true;
        } else return false;
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember() {
        System.out.println("id : " + id);
        System.out.println("이름 : " + name);
        System.out.println("---------------");
    }
}