package 중첩반복문0105;

public class DoubleFor {
    public static void main(String[] args) {
        for(int i=2; i<10; i++) {
            System.out.printf("[%d단]\n",i);
            for(int j =1; j<10; j++) {
                System.out.printf("%d x %d = %d ", i,j,(i*j));
                System.out.println();
            } System.out.println();
        }
    }
}
