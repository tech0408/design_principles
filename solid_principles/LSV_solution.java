package solid_principles;

interface Bird1 {

    void eat();
}

interface FlyingBird extends Bird1{

    void fly();
}

class Sparrow implements FlyingBird{

    @Override
    public void fly() {
        System.out.println(" Sparrow can fly");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats seeds");
    }
}

class Penguin11 implements Bird1{

    @Override
    public void eat() {
        System.out.println("Penguin eats fish");
    }
}
public class LSV_solution {

    public static void main(String[] args) {

        Bird1 penguin = new Penguin11();
        penguin.eat();

        FlyingBird sparrow = new Sparrow();
        sparrow.fly();
        sparrow.eat();
    }
}
