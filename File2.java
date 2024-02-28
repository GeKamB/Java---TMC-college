public class File2 {
    
    public static void main(String[] args) {
        String name = "Kamil";
        String email = "1512307@stu.tmc.ac.uk";
        System.out.println("My name is " + name + " and my email is " + email);

        int a = 108;
        int b = 200;
        System.out.println("value of \"a\" is: " + a);
  /*       
        if (a < 500) {
            System.out.println("\"a\" is less than 500");
        } 
        else {
            System.out.println(" \"a\" is greater than 500");
                }

         if (a % 2 == 0) {
            System.out.println("\"a\" is even number");
        }
        else {
            System.out.println("\"a\" is odd number");
        }

        if (a == 10) {
            System.out.println("a is 10");
        } else if (a == 30) {
            System.out.println("a is 30");
        } else if (a == 100) {
            System.out.println("a is 100");
        } else {
            System.out.println("a is neither 100 nor 30 and definitely not 10");
        } */
        switch (a) {
            case (100):
                System.out.println("value is 100");
                break;
            case 105:
                System.out.println("value is 105");
                break;
            default:
            System.out.println("value is different than 100 and 105");
                break;
        }
        
    }
}
