package 슈퍼필드예제0116;

import 다형성응용1_0116.Product;

public class SuperFieldEx1 {
    public static void main(String[] args) {
        ChildEx childex = new ChildEx();
        childex.childMethod();
    }
}
class ParentEx {
    int x = 10;
}

class ChildEx extends ParentEx {
    int x = 20;

    void childMethod() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
