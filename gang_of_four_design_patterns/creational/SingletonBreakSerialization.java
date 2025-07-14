package gang_of_four_design_patterns.creational;

import java.io.*;

// when we deserialize a Singleton class object, then a new instance is created , which breaks Singleton.
public class SingletonBreakSerialization implements  Serializable{

    private static final long serialVersionUID = 1L;

    private static final SingletonBreakSerialization instance = new SingletonBreakSerialization();

    private SingletonBreakSerialization() {}


    public static SingletonBreakSerialization getInstance(){
        return instance;
    }

    // Overriding readResolve() will help prevent Singleton break.
    private Object readResolve(){
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonBreakSerialization s = SingletonBreakSerialization.getInstance();

        // Serialization
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        // Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        SingletonBreakSerialization s1 = (SingletonBreakSerialization)ois.readObject();

        System.out.println(s==s1);
    }
}
