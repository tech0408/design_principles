package solid_principles;

interface Switchable{
    void turnOn();
    void turnOff();
}

class LightBulb1 implements Switchable{

    @Override
    public void turnOff() {
        System.out.println("LightBulb is Off");
    }

    @Override
    public void turnOn() {
        System.out.println("LightBulb is On");
    }
}

class Fan implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Fan is On");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is Off");
    }
}
class Switch1{

    private Switchable device;

    public Switch1(Switchable device){
        this.device=device;
    }

    public void flipSwitch(boolean isOn){
        if(isOn){
            device.turnOn();
        }
        else{
            device.turnOff();
        }
    }
}
public class DIP_solution {

    public static void main(String[] args) {

        Switchable light = new LightBulb1();
        Switchable fan = new Fan();

        Switch1 lightSwitch = new Switch1(light);
        lightSwitch.flipSwitch(true);

        Switch1 fanSwitch = new Switch1(fan);
        fanSwitch.flipSwitch(false);

    }
}
