package 자동차만들기종합;
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        //스포츠카
        SportsCar sportsCar = new SportsCar();
        sportsCar.setName("붕붕이");
        sportsCar.setSpeed(250);
        sportsCar.setMileage(8);
        sportsCar.setOilTank(30);
        sportsCar.setSeat(2);

        //승용차
        Sedan sedan = new Sedan();
        sedan.setName("방방이");
        sedan.setSpeed(200);
        sedan.setMileage(12);
        sedan.setOilTank(45);
        sedan.setSeat(4);

        //버스
        Bus bus = new Bus();
        bus.setName("마을버스");
        bus.setSpeed(150);
        bus.setMileage(5);
        bus.setOilTank(100);
        bus.setSeat(20);

        // 지역 별 거리 및 기름값 변수
        int distance = 0;
        int mileagePrice=2000;

        //이동지역
        System.out.println("이동 지역을 선택하세요 : [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        Scanner sc = new Scanner(System.in);
        int local = sc.nextInt();
        if (local == 1) distance = 400;
        if (local == 2) distance = 150;
        if (local == 3) distance = 200;
        if (local == 4) distance = 300;

        //이동승객수
        System.out.println("이동할 승객 수를 입력하세요 : ");
        int passengerNum = sc.nextInt();

        //부가기능
        System.out.println("부가 기능의 ON/OFF를 선택 하세요 : ");
        String addFunc = sc.next();
        if (addFunc.equalsIgnoreCase("ON")) {
            sportsCar.addFunc();
            bus.addFunc();
            sedan.addFunc();
        }

        //이동차량
        System.out.println("이동 차량을 선택하세요 : [1]스포츠카 [2]승용차 [3]버스 : ");
        int transportation = sc.nextInt();

        //설정 별 결과값
        switch (transportation){
            case 1 :
                System.out.println("차량 이름은 : "+ sportsCar.getName());
                int cnt = (passengerNum/sportsCar.getSeat())+1;
                System.out.println("총 비용은 " + ((mileagePrice * distance) / sportsCar.getMileage())* cnt  + "원");
                System.out.printf("주유 횟수는 %d\n", distance / (sportsCar.getOilTank()* sportsCar.getMileage())+1);
                System.out.printf("총 소요 시간은 %.2f\n",(double)distance/sportsCar.getSpeed());
                break;
            case 2 :
                System.out.println("차량 이름은 : "+ sedan.getName());
                cnt = (passengerNum/sedan.getSeat())+1;
                System.out.println(((mileagePrice * distance) / sedan.getMileage())*cnt + "원");
                System.out.printf("%d\n", (distance / (sedan.getOilTank()* sedan.getMileage())+1)*cnt);
                System.out.printf("총 소요 시간은 %.2f\n",(double)(distance/sedan.getSpeed())*cnt);
                break;
            case 3 :
                System.out.println("차량 이름은 : "+ bus.getName());
                cnt = (passengerNum/bus.getSpeed())+1;
                System.out.println(((mileagePrice * distance) / bus.getMileage())*cnt);
                System.out.printf("%d\n", (distance / (bus.getOilTank()* bus.getMileage())+1)*cnt);
                System.out.printf("총 소요 시간은 %.2f\n",(double)(distance/bus.getSpeed())*cnt);
                break;
            default:
                System.out.println("차량을 잘못 입력하셨습니다.");
        }
    }
}