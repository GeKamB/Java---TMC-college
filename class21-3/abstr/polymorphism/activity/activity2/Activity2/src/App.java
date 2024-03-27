abstract class Shape{
    abstract double calculateArea();
}
class Rectangle extends Shape {
    double x, y;
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    double calculateArea() {
        return x * y;
    }
}
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * Math.sqrt(radius);
    }
}
public class App {
   static void printArea(Shape shape) {
        System.out.println(shape + " area: "+shape.calculateArea());


    }
    public static void main(String[] args) throws Exception {
        System.out.println();
        Circle circle1 = new Circle(2);
        Rectangle rect1 = new Rectangle(4, 10);

        printArea(circle1);
        printArea(rect1);

    }
}
