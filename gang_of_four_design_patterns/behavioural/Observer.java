package gang_of_four_design_patterns.behavioural;

import java.util.ArrayList;
import java.util.List;

interface Subject{

    void attach(Observer1 ob);
    void detach(Observer1 ob);
    void notifyObservers();
}

class ConcSubject implements Subject{

    private List<Observer1> observers = new ArrayList<>();
    private String state;

    @Override
    public void attach(Observer1 ob) {
        observers.add(ob);
    }

    @Override
    public void detach(Observer1 ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer1 ob : observers){
            ob.update(state);
        }
    }

    public void setState(String state){
        this.state=state;
        notifyObservers();
    }
}

interface Observer1{
    void update(String state);
}

class ConObserver implements Observer1{

    private String name;

    ConObserver(String name){
        this.name=name;
    }
    @Override
    public void update(String state) {
        System.out.println(name + ": user has been updated with state :"+ state);
    }
}
public class Observer {

    public static void main(String[] args) {

        ConcSubject sub = new ConcSubject();

        Observer1 ob1 = new ConObserver("Observer 1");
        Observer1 ob2 = new ConObserver("Observer 2");

        sub.attach(ob1);
        sub.attach(ob2);

        sub.setState("State changed to active");

        sub.detach(ob2);

        sub.setState("State changed to inactive");
    }
}
