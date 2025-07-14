package gang_of_four_design_patterns.creational;

class ProtoExample implements Cloneable{

    public String name;

    ProtoExample(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        ProtoExample orgObject = new ProtoExample("Original Object");
        ProtoExample newObject = (ProtoExample)orgObject.clone();

        System.out.println("Org object :"+ orgObject.name);
        System.out.println("Cloned object :"+ newObject.name);

        newObject.setName("Updated new object");
        System.out.println("Org object :"+ orgObject.name);
        System.out.println("Cloned object :"+ newObject.name);

    }
}
