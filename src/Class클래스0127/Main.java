package Class클래스0127;
// Class : 클래스의 패키지이름이나 클래스이름 등의 정보를 가져옴
public class Main {
    public static void main(String[] args) {
        String s = new String();
        Class c = s.getClass(); // 해당 클래스의 정보를 가져옴
        System.out.println(c);

        Person person = new Person();
        Class person2 = person.getClass();
        System.out.println(person2.getSimpleName());
        System.out.println(person2.getClass());
    }
}

class Person {

}