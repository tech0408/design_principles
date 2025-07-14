package gang_of_four_design_patterns.creational;

class Singleton4 implements Cloneable{

    private static final Singleton4 instance = new Singleton4();

    private Singleton4() {}

    public static Singleton4 getInstance(){
        return instance;
    }

    // To prevent Singleton break via cloning, throw exception in this method.
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }
}

public class SingletonBreakCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = (Singleton4) s1.clone();
        System.out.println(s1==s2);
    }
}
