package 다형성응용1_0116;
// 매개변수의 다형성 예제
public class PolyBuyer {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(); // 구매를 하는 객체 생성
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();
        buyer.buy(tv);
        buyer.buy(audio);
        buyer.buy(computer);
        // 제품들(tv,computer ...)은 Product 클래스의 자식 클래스 이기 때문에 buy 메소드에 어떤 제품이 들어오든 상관 없음.
        // 제품들이 추가된다 한들 buy 내부 메소드는 건드리지 않아도 됨. 어차피 Parent 참조 변수를 매개변수로 받기 때문
        // 이는 객체간 느슨한 관계를 만드는 핵심이 됨.
        buyer.viewInfo();
    }
}
