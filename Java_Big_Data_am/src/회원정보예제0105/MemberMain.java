package 회원정보예제0105;
public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo(); // MemberInfo 클래스를 객체로 만듬(객체 생성 후 메모리에 적재:인스턴스화)
        memberInfo.setName(); // 이름을 저장하는 메소드 호출
        memberInfo.setAge(); // 나이를 저장하는 메소드 호출
        memberInfo.setGender(); // 성별을 저장하는 메소드 호출
        memberInfo.setJobs(); // 직업을 저장하는 메소드 호출
        memberInfo.viewInfo(); // 출력하는 메소드 호출
    }
}
