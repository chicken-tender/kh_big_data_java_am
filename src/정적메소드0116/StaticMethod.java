package 정적메소드0116;

import static 정적메소드0116.Util.DOMAIN;

public class StaticMethod {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오",1000);
        Bank toss = new Bank("토스", 1000);
        Bank kb = new Bank("국민", 0);

        kakao.setDeposit(2000);
        kakao.setWithdraw(1580);
        kakao.viewAccount();

        System.out.println(Bank.getCount()); // getCount()는 정적 메소드이며, 클래스 소속

        System.out.println("현재 시간을 출력 합니다.");
        System.out.println(Util.getCurrentDate("yyyy-MM-DD hh:mm:ss"));
        System.out.println("도메인 주소 : " + DOMAIN);
    }
}
