package gang_of_four_design_patterns.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton3 {

    private static final Singleton3 instance = new Singleton3();

   // private Singleton3(){}

    // Step to prevent singleton break.
    // Add private constructor to throw exception if instance does not exist.
    private Singleton3(){

        if(instance!= null){
            throw new IllegalStateException("Instance already exists");
        }
    }

    public static Singleton3 getInstance(){
        return instance;
    }

}
public class SingletonBreakReflection {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Singleton3 s1 = Singleton3.getInstance();

        Constructor [] constructor = Singleton3.class.getDeclaredConstructors();
        System.out.println(constructor[0].getName());
        constructor[0].setAccessible(true);

        Singleton3 s2 = (Singleton3) constructor[0].newInstance(); // when private constructor is added to
        // throw exception if instance already exists, then the new object is not created.
        System.out.println(s1==s2);
    }
}
