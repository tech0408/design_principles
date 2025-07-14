package gang_of_four_design_patterns.structural;


interface Target{
    void request();
}

class Adaptee{

    public void specificRequest(){
        System.out.println("Adaptee Specific Request");
    }
}

class Adapter1 implements Target{

    private Adaptee adaptee;

    Adapter1(Adaptee adapatee){
        this.adaptee=adapatee;
    }
    public void request(){
        adaptee.specificRequest(); // Using Adaptee class existing function.
    }
}
public class Adapter {

    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();
        Target t = new Adapter1(adaptee);
        t.request();
    }
}
