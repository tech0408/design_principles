package gang_of_four_design_patterns.creational;

interface Shape{
    void draw();
}

class Circle implements Shape{

    public void draw(){
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class ShapeFactory {

    public static Shape getShape(String shapeType){

        switch (shapeType){
            case "Circle" : return new Circle();
            case "Square" : return new Square();
            default: throw  new IllegalArgumentException("Unknown shape type");
        }
    }
}
public class FactoryMethod {

    public static void main(String[] args) {

        // determining the shape object during runtime.
        Shape s1 = ShapeFactory.getShape("Circle");
        s1.draw();

        Shape s2 = ShapeFactory.getShape("Square");
        s2.draw();
    }
}
