package solid_principles;

interface Worker {

    void work();
    void eat();
}

class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    // robot has to unnecessarily implement eat().
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat");
    }
}
public class ISP_problem {
}
