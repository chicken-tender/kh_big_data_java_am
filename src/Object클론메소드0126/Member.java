package Object클론메소드0126;
// Cloneable.. 실제 구현해야 할 메소드는 없지만 인터페이스 등록 후 사용, 단지 clone() 메소드 사용 가능하도록 권한을 부여하는 의미
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean isAdult;

    public Member(String id, String name, String password, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.isAdult = isAdult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // clone()을 호출하게 되면 똑같은 메모리가 하나 더 생김.(값까지 복사_깊은복사)
            // clone() 호출해서 복사된 주소값이 Member형으로 변환되어 cloned 참조 변수에 대입..
            // 그래서 member2에 담길 수 있음.
        } catch(CloneNotSupportedException e) {}
        return cloned;
    }
}
