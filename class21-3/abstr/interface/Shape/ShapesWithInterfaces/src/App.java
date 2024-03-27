interface Shape {
    double area();
    double perimeter();
}
class Rectangle implements Shape {
   private double x, y;
    public Rectangle(double x,double y) {
        this.x = x;
        this.y = y;
    }
   public double area(){
        return x * y;
    }
    public double perimeter() {
        return (2 * x) + (2 * y);
    }
}
class Circle implements Shape {
    private double radius, pi = 3.14;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double perimeter() {
        return  2 * pi * radius;
        
    }
    public double area() {
        return pi * radius * radius;
    }
    
}
class Triangle implements Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    public double perimeter() {
        return a + b + c;
    }
    public double area() {
        double s = (a+b+c) / 2;
        return Math.sqrt(s * (s*(s-a)*(s-b)*(s-c)));

    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Rectangle rect1 = new Rectangle(4, 5);
        double rect1Area = rect1.area();
        double rect1Peri = rect1.perimeter();
        System.out.println("rectangle area: " + rect1Area);
        System.out.println("rectangle perimeter: " + rect1Peri);

        System.out.println("\t*\t*\t*\t*");

        Circle circle1 = new Circle(5);
        System.out.println("Circle area: " + circle1.area());
        System.out.println("Circle circumference: " + circle1.perimeter());

        System.out.println("\t*\t*\t*\t*");

        Triangle triangle1 =new Triangle(5, 9, 7);
        System.out.println("Triangle area: " + triangle1.area());
        System.out.println("Triangle perimeter: " + triangle1.perimeter());
    }
}
