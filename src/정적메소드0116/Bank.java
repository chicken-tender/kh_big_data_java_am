package 정적메소드0116;

public class Bank {
    private static int count = 0; // 해당 클래스가 객체로 몇 번 생성되었는지 확인하는 변수
    private int account; // 계좌
    private String bank; // 은행 이름
    public Bank(String name, int account) { // 생성자는 클래스가 객체로 만들어질 때 호출됨!!!!!
        count++;
        bank = name;
        this.account = account;
        System.out.println(name + "은행의 계좌를 개설 합니다. 잔액은 " + account + "원 입니다.");
    }
    // 정적 필드값을 읽기 위한 정적 메소드 (클래스 소속)
    // 클래스가 만들어질 때 단 한 번만 만들어짐. (객체 소속이 아님.)
    public static int getCount() {
        return count;
    }
    //   (예금을 위한 메소드) //매개변수가 바뀌면 안될 경우 final로 상수처리.. 최종값으로 전달됨.
    public void setDeposit(final int dep) { // 입금된 고객의 금액을 더 이상 변경 불가 상태로 만들어 안전하게 보호
        account += dep;
        System.out.println(dep + "원 예금 했습니다.");
    }
    //         (출금을 위한 메소드)
    public void setWithdraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족 합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {

        System.out.println("현재 잔액은 " + account + "원 입니다.");
    }
}
