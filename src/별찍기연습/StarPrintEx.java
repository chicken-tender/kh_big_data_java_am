package 별찍기연습;
public class StarPrintEx {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5-i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
}
