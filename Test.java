public class Test {
    public static void main(String[] args) {
       
        char grade = 'A';
        switch(grade) {
            case ('A'):
            System.out.println("Excellent");
            break;
            case ('B'):
            System.out.println("GREAT");
            break;
            case ('C'):
            System.out.println("Well done");
            break;
            case ('D'):
            System.out.println("You passed");
            break;
            case ('F'):
            System.out.println("Better try again");
            break;
            default:
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

    }
}
