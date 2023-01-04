package 반복문기본;
// 사용자에게 입력을 받을 때 잘못 입력한 경우 무한루프로 돌려야 함. 그럴 때는 while
// 반복해야 하는 범위가 명확하면 for문으로 작성
public class WhileEx {
    public static void main(String[] args) {
        int treeHit = 0;
//        while(treeHit < 10) {
//            treeHit++;
//            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
//            if(treeHit == 10) {
//                System.out.println("나무가 넘어 갑니다.");
//            }
//        }

        while(true) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if(treeHit ==10) {
                System.out.println("나무가 넘어 갑니다.");
                break;
            }
        }
    }
}
