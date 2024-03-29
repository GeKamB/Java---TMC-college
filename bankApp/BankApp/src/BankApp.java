
import java.util.*;

class BankAccount {
    private double accBalance; 
    private String accName;
    private ArrayList <Double> depHistory = new ArrayList<>(); 
    private ArrayList <Double> withdrawHistory = new ArrayList<>();
    private String currency;
    Scanner bankScanner = new Scanner(System.in);

    BankAccount(String accName, String currency) {
        this.accName = accName;
        this.accBalance = 0.00;
        this.currency = currency;
    }
   void deposit() {
    System.out.println("Welcome " + accName + "\t Your account balance: " + currency + displayBalance());
    System.out.println("Enter amount you would like to deposit: ");
    double sum = bankScanner.nextDouble();
    accBalance += sum;
    depHistory.add(sum);    
    System.out.println("\tYour account balance after transaction: " + currency + displayBalance());
    }
    void withdraw() {
        System.out.println("Welcome " + accName + "\t Your account balance: " + currency + displayBalance());
        System.out.println("Enter amount you would like to withdraw: ");
        double sum = bankScanner.nextDouble();
        if(accBalance >= sum){
         accBalance -= sum;
         withdrawHistory.add(sum);
         System.out.println("\tYour account balance after transaction: " + currency + displayBalance());
        }
        else System.out.println("You have not enough funds to withdraw\n");
    }
    double displayBalance() {
        return accBalance;
    }

    void operate() {
        int choice=0;
    while(choice != 6){
        choice = 0;
        System.out.println("\n");
        System.out.println("Hello " + accName + " What you would like to do? ");
        System.out.println(" 1. display balance \n 2.Withdraw \n 3.Deposit \n 4.Deposit History\n 5.Withdraw History\n 6.Quit ");
        
        choice = bankScanner.nextInt();
        switch (choice) {
            case 1:

            System.out.println("\n" + currency + displayBalance());
                break;
            case 2:
            withdraw();
                break;
            case 3: 
            deposit();
                break;
            case 4:
              System.out.println("DEPOSIT HISTORY:");
                displayArray(depHistory);
                break;
            case 5:
                System.out.println("Withdrawals History:");
                displayArray(withdrawHistory);
                break;
        }
    }
    }
    void displayArray(ArrayList<Double> arr ) {
        for(double i : arr ) System.out.println(currency + i);
                  
            
            
    }
 

}

public class BankApp {
   static Scanner myScanner = new Scanner(System.in);
     

    public static void main(String[] args) throws Exception {
        
        
        System.out.println("Welcome in Bank\n Type your name and open bank account instantly!");
        String userName = myScanner.nextLine();
        System.out.println("choose main currency: $ or £");
        String currency = myScanner.nextLine();
        BankAccount acc = new BankAccount(userName, currency);
        
        acc.operate();
 

}

        
    
}
