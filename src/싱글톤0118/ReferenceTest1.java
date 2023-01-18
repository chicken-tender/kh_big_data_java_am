package 싱글톤0118;

public class ReferenceTest1 {
    Singleton singleton = Singleton.getSingleton();

    void setInfo(String name, int id) {
        singleton.name = name;
        singleton.id = id;
    }

    void viewInfo() {
        System.out.println("이름 : " + singleton.name);
        System.out.println("id : " + singleton.id);
    }
}

class ReferenceTest2 {
    Singleton singleton = Singleton.getSingleton();

    void setInfo(String name, int id) {
        singleton.name = name;
        singleton.id = id;
    }

    void viewInfo() {
        System.out.println("이름 : " + singleton.name);
        System.out.println("id : " + singleton.id);
    }
}

