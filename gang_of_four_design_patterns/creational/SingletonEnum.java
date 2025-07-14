package gang_of_four_design_patterns.creational;

enum SingletonEnum1 {

    INSTANCE;

    public void action(){
        System.out.println("Perform some action");
    }
}
public class SingletonEnum {

    public static void main(String[] args) {

        SingletonEnum1 singleton = SingletonEnum1.INSTANCE;
        singleton.action();

        SingletonEnum1 singleton1 = SingletonEnum1.INSTANCE;
        System.out.println(singleton1==singleton);
    }
}
