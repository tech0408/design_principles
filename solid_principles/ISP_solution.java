package solid_principles;

interface Workable{
    void work();
}

interface Eatable{
    void eat();
}

class Human implements Workable,Eatable{

    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Humans is eating");
    }
}

class Robot1 implements Workable{

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

public class ISP_solution {

    public static void main(String[] args) {

        Human human = new Human();
        human.work();
        human.eat();

        Robot1 robot1 = new Robot1();
        robot1.work();
    }
}

