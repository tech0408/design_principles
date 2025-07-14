package solid_principles;

class LightBulb{

    public void turnOn(){
        System.out.println("LightBulb is On");
    }

    public void turnOff(){
        System.out.println("LightBulb is Off");
    }
}

// Here Switch class is tightly coupled with the LightBulb class.
class Switch{

    private LightBulb lb = new LightBulb();

    public void flipSwitch(boolean isOn){
        if(isOn){
            lb.turnOn();
        }
        else{
            lb.turnOff();
        }
    }
}

public class DIP_problem {
}
