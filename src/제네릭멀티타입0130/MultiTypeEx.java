package 제네릭멀티타입0130;
// 타입 변수란? 참조형 타입을 의미하고 어떤 문자로 이름을 지정해도 상관없지만 일반적으로 일반적으로 T를 쓴다.
// 타입 변수는 클래스 뿐만 아니라 메소드의 매개변수나 반환타입으로 사용 가능(일반 변수와 같은 ..)
public class MultiTypeEx {
    public static void main(String[] args) {
        Product<String, Integer> laptop = new Product<>("맥북에어", 2022);
        System.out.println(laptop.getName());
        Product<Integer, String> tv = new Product<>(2020, "맥북프로");
        System.out.println(tv.getYear());
    }
}

class Product<T, M> {
    private T name;
    private M year;

    public Product(T name, M year) {
        this.name = name;
        this.year = year;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}