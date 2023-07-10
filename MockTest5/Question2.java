abstract class Shape{
    public abstract double calculateArea();
}
class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Triangle extends Shape {
  
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator{
    public void printArea(Shape shape){
        double area=shape.calculateArea();
        System.out.println("Area of "+shape.getClass().getName()+" :"+ area);

    }
}
public class Question2 {
    public static void main(String[] args) {
       
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(4, 6);

        shapeCalculator.printArea(rectangle); 
        shapeCalculator.printArea(circle);   
        shapeCalculator.printArea(triangle);  
    }
}
