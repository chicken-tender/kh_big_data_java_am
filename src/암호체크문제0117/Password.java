package 암호체크문제0117;
import java.util.Scanner;

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
