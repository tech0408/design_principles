package solid_principles;

// LSV

class Bird{

    public void fly(){
        System.out.println("I can fly");
    }
}

class Penguin extends Bird{

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
public class LSV_problem {

    public static void main(String[] args) {

        Bird bird = new Penguin();
        bird.fly();  // throws exception.
    }
}
