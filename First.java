class Second {
    int a = 200;
    int b = 300;
    void display() {
        System.out.println("value of \"a\" is " + a + " and value of \"b\" is " + b);
    }
}

public class First {
    public static void main(String[] args){
        System.out.println("First java object");
        int c = 90;
        System.out.println("value of c is " + c);
        Second obj1 = new Second();        
        obj1.display();
    }

}
