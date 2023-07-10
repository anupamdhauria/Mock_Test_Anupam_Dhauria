interface Drawable {
    void draw();
}

class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
public class Question4 {
    public static void main(String[] args) {
        Drawable drawable;
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        drawable=circle;
        drawable.draw();

        drawable=rectangle;
        drawable.draw();


    }
}
