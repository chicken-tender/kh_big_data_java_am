package 예외처리예제3_0207;
// ★ NullPointerException : 참조하고 있는 주소를 접근 했으나 값이 없는 경우
public class Main {
    public static void main(String[] args) {
        Test test = null;
        try {
            String testStr = test.name;
            System.out.println(test);
        } catch(NullPointerException e) {
            System.out.println("참조하고 있는 곳에 값이 없습니다.");
        }
    }
}

class Test {
    String name = "곰돌이사육사";
}
// 이런 오류는 잡아줘야 하지만 일례를 보여주기 위한 예제
// NullPointerException은 왠만하면 try{}catch(){} 하지 말 것.
