package 암호화문제0201;
// a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
// 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
// nice day
// lovelove
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Character> s = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String code = sc.next();

        for(int i = 0; i < sentence.length(); i++) {
            s.add(sentence.charAt(i));
        }
        for(int i = 0; i < code.length(); i++) {
            c.add(code.charAt(i));
        }
        int z = 0;
        char j = ' ';
        char[] cd = new char[sentence.length()];
        for(int i = 0; i < cd.length; i++) {
            cd[i] = s.get(i);
        }

        for(int i = 0; i < s.size(); i++) {
            if(s.size() > c.size()) {
                c.add(c.get(i));
            }
            z = c.get(i) - 'a' + 1;
            cd[i] = (char)(s.get(i) - z);
            if(cd[i] < 'a') cd[i] += 26;
            if(s.get(i) == ' ') cd[i] = ' ';
        }
        for(char e : cd) System.out.print(e + "");
    }
}
