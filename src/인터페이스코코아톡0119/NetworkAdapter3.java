package 인터페이스코코아톡0119;

public interface NetworkAdapter3 {
    void send(String msg);
}

class Wifi implements NetworkAdapter3 {
    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}
class FiveG implements NetworkAdapter3 {
    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}