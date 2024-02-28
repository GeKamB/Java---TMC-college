public class WhileLoop {
    public static void main(String[] args) {
       short x = 10;
       short sum = 0;
        while(x < 20) {
            System.out.println("value of \"x\" is: " + x);
            sum += x;
            x++;                       
        }
        System.out.println("The sum of numbers is: " + sum);
        Main myObj = new Main();
        System.out.println(myObj.number1);
    }

}
