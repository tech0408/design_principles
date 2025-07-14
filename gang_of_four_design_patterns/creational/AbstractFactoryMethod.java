package gang_of_four_design_patterns.creational;


// abstract factory
interface GUIFactory{
    Button createButton();
    CheckBox createCheckBox();
}

// Concrete Factories
class WinFactory implements GUIFactory{

    public Button createButton(){

        return new WindowsButton();
    }

    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}

class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}


// Products interface
interface Button{
    void paint();
}

interface CheckBox{
    void paint();
}

class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Painting a windows button");
    }
}

class WindowsCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Painting a windows checkbox");
    }
}

class MacButton implements  Button{

    @Override
    public void paint() {
        System.out.println("Painting a Mac button");
    }
}

class MacCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Painting a Mac checkbox");
    }
}
public class AbstractFactoryMethod {

    public static void main(String[] args) {

        GUIFactory factory = new WinFactory();
        Button button = factory.createButton();
        button.paint();

        factory = new MacFactory();
        CheckBox cb = factory.createCheckBox();
        cb.paint();
    }
}
