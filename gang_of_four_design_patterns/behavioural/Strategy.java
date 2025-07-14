package gang_of_four_design_patterns.behavioural;

interface Strategy1{
    void executeStrategy();
}

class StrategyA implements Strategy1 {

    @Override
    public void executeStrategy() {
        System.out.println("Executing Strategy A");
    }
}

class StrategyB implements  Strategy1{

    @Override
    public void executeStrategy() {
        System.out.println("Executing Startegy B");
    }
}

class Context {

    private Strategy1 strategy;

    Context(Strategy1 strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy1 strategy){
        this.strategy=strategy;
    }

    public void executeStrategy(){
        strategy.executeStrategy();
    }
}

public class Strategy {

    public static void main(String[] args) {

        Context ctt = new Context(new StrategyA());
        ctt.executeStrategy();

        ctt.setStrategy(new StrategyB());
        ctt.executeStrategy();
    }
}
