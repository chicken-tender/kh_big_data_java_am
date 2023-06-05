package 추상클래스복습0605;

public abstract class Phone {
    public String name;
    public boolean isPower;

    // 추상 클래스라 객체화가 안되지만 생성자를 넣어준 이유(?) : 자식에서 객체화 할 때 부모를 상속받기 때문에 부모 클래스의 생성자를 가져오기 때문(?)
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) { // 자식 클래스에서 구현 안해도 됨. 하게 되면 '오버라이딩'
        this.isPower = isPower;
        if(isPower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }
    abstract void call(); // 추상 클래스이므로 구현부가 없음. 따라서, 자식 클래스에서 무조건 구현해줘야 함.
}
