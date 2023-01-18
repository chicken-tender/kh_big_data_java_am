package 암호체크문제0117;
import java.util.Scanner;
// 암호의 길이는 10 ~ 30자 사이 (10 <= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수문자는 (!, %, _, #, &, +, -, *, /)의 9개 중 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good password", 아니면 "Bad password" 출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit" 입력하면 프로그램 종료
public class Password {
    String password;

    public void setPassword() {
        Scanner sc = new Scanner(System.in);
        password = sc.next();
    }

    public boolean pwLength() {
        if(password.length() >= 10 && password.length() <= 30) {
            return true;
        }
        return false;
    }

    public boolean pwOptionSmallLetter() {
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') return true;
        }
        return false;
    }

    public boolean pwOptionBigLetter() {
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') return true;
        }
        return false;
    }

    public boolean pwOptionNum() {
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9') return true;
        }
        return false;
    }

    public boolean pwOptionSpeChar() {
        String specialLetter = "!%_&#+-*/";
        for(int i = 0; i < specialLetter.length(); i++) {
            for(int j = 0; j < password.length(); j++) {
                if(specialLetter.charAt(i) == password.charAt(j)) return true;
            }
        }
        return false;
    }

    public void getPassword() {
        if(pwLength() && pwOptionSmallLetter() && pwOptionBigLetter() && pwOptionSpeChar() && pwOptionNum()) {
            System.out.println("Good password");
        }
        else System.out.println("Bad password");
    }

    public void confirmPw() {
        while(true) {
            setPassword();
            pwLength();
            pwOptionSpeChar();
            pwOptionNum();
            pwOptionBigLetter();
            pwOptionSmallLetter();
            if(password.equals("종료") || password.equals("exit")) return;
            getPassword();
        }
    }
}
