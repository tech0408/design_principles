package gang_of_four_design_patterns.structural;

interface Component{
    void operation();
}

class ConComponent implements Component{

    @Override
    public void operation() {
        System.out.println("Base operation");
    }
}

class Decorator1 implements Component{

    private Component cmpt;

    Decorator1(Component cmpt){
        this.cmpt=cmpt;
    }
    @Override
    public void operation() {
        cmpt.operation();
        System.out.println("Adding extra behaviour via Decorator");
    }
}
public class Decorator {
    public static void main(String[] args) {

        Component cmpt = new ConComponent();

        Component decorator = new Decorator1(cmpt);
        decorator.operation();
    }
}
