package 암호체크문제0117;
// 암호의 길이는 10 ~ 30자 사이 (10 <= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수문자는 (!, %, _, #, &, +, -, *, /)의 9개 중 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good password", 아니면 "Bad password" 출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit" 입력하면 프로그램 종료
public class PwdCheckMain {
    public static void main(String[] args) {
        Password password = new Password();
        password.confirmPw();
    }
}
