package gang_of_four_design_patterns.creational;

class Singleton2{

    private final static Singleton2 instance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance(){
        return instance;
    }
}
public class SingletonEager {

    public static void main(String[] args) {

        Singleton2 s = Singleton2.getInstance();
        Singleton2 s1 = Singleton2.getInstance();
        System.out.println(s==s1);
    }
}
