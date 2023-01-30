package 제네릭응용0130;
// T 타입에 아무거나 들어와도 됐었으나 그럴 경우, 실제 동작시 관련 없는 타입 변수도 다 들어갈 수 있어 문제가 됨.
// 따라서 들어갈 수 있는걸 제약사항을 걸어야 할 필요가 있음.
// 이건 상속으로 해결 가능!
public class GenericPrinter<T extends Material> { // Material 로 부터 상속 받은 클래스만 타입 변수로 지정 가능하도록 제한
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material.toString();
    }

}
