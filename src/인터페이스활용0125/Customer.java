package 인터페이스활용0125;
// 원래는 default 메소드는 오버라이딩 해도 되고 안해도 되지만 각 인터페이스에서 같은 메소드를 default 하면 자식 클래스에서 모순이 생겨버림.
// 따라서 모순을 피하기 위해 해당 메소드를 반드시 오버라이딩 해줘야 함. (order())
// 오버라이딩 하는 순간 부모 default 메소드는 사라져 버림.. -> Main2 에서 확인 가능
public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}
