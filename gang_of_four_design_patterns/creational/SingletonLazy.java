package gang_of_four_design_patterns.creational;

class Singleton {

    private static Singleton instance;

    private Singleton() {}  // private constructor to prevent instantiation.

    // Public -> to access from outside.
    // static -> to use via class name.
    // synchronized -> for thread safety.
    // double null check - try
    public static synchronized Singleton getInstance(){
        if(instance== null){
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonLazy {

    public static void main(String[] args) {

        //Singleton s = new Singleton(); unable to create instance of class Singleton.
        Singleton obj1 = Singleton.getInstance(); // new instance is created.
        Singleton obj2 = Singleton.getInstance(); // gets the created instance.

        System.out.println(obj1==obj2);
    }
}
