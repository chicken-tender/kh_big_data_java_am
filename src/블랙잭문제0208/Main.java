package 블랙잭문제0208;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        List<Integer> rst = new ArrayList<>();
        List<Integer> rst2 = new ArrayList<>();
        List<Integer> card = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            card.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    rst.add(card.get(i) + card.get(j) + card.get(k));
                }
            }
        }
        for(int i = 0; i < rst.size(); i++) {
            if(rst.get(i) <= sum) rst2.add(rst.get(i));
        }
        rst2.sort(Comparator.reverseOrder());
        System.out.println(rst2.get(0));
    }
}
