package 다형성기본0116;
// 다형성이란? 여러가지 타입을 한 가지 타입으로 처리하는 기술을 의미 (!!!상속 관계 이용!!!)
// 부모 클래스의 참조 변수로 자식 클래스의 객체(인스턴스)를 참조하는 방법
// 단, 부모 클래스가 알고있는 메소드가 오버라이딩이 되어 있는 경우에 해당
public class PolyEx1 {
    public static void main(String[] args) {
        ChildPoly childpoly = new ChildPoly(); // ChildPoly 클래스의 참조 변수(childpoly)로 ChildPoly 객체를 참조
        childpoly.display();
        childpoly.out();

        ParentPoly parentPoly = new ChildPoly(); // 부모 클래스의 잠조변수로 자식 객체를 참조
        parentPoly.display();
    }
}
