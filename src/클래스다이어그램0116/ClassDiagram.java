package 클래스다이어그램0116;
// 클래스 다이어그램(1차 시험 대비)
// 클래스명 Circle
// + PI : double = 3.14    => public final static PI = 3.14
// - radius : double       => private double radius;
// + Circle(radius:double) => public Circle(double radius)
public class ClassDiagram {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0); // 객체 생성시 생성자의 매개변수를 넣어야 함(기본생성자 안만들었음)
        circle.setRadius(3.1);
        circle.draw();
    }
}
class Circle {
    public final static double PI = 3.14;
    private double radius; // 접근제한자 확인 필요 (-는 private을 의미함)
    public Circle(double radius) { // 생성자 호출시 매개변수가 빌요함.

        this.radius = radius;
    }
    public double getRadius() {

        return radius;
    }
    public void setRadius(double radius) {

        this.radius = radius;
    }
    public static double getPi() {

        return PI;
    }
    public void draw() {

        System.out.println("반지름이 " + radius + "cm 인 원을 그립니다.");
    }
}