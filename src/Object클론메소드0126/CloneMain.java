package Object클론메소드0126;

public class CloneMain {
    public static void main(String[] args) {
        Member member1 = new Member("1234567","콩미","khbigdata",30,true);
        Member member2 = member1.getMember(); // 깊은 복사 (메모리 공간이 복사되어서 값을 바꾸면 바꾼 객체만 적용됨)

        member2.age = 300;
        member2.name = "불주먹";

        System.out.println("name : " + member1.name);
        System.out.println("age : " + member1.age);

        System.out.println("name : " + member2.name);
        System.out.println("age : " + member2.age);

        member2 = member1; // 얕은 복사 (주소가 복사되어서 값을 바꾸면 두 개가 같이 바뀜)

    }
}
