package 스트림예제7_0209;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("홍길동", 30, 3000));
        customerList.add(new TravelCustomer("김딸기", 13, 2000));
        customerList.add(new TravelCustomer("이순신", 25, 2500));
        customerList.add(new TravelCustomer("강감찬", 19, 4500));
        System.out.println("고객 명단 출력");
        customerList.stream().map(c -> c.getName()).forEach(System.out::println);
        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용 : " + total + "원");
        System.out.println("== 20세 이상 성인 출력 ==");
        customerList.stream().filter(e -> e.age >= 20)
                .map(c -> c.getName())
                .sorted()
                .forEach(System.out::println);
    }
}

class TravelCustomer {
    String name;
    int age;
    int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
