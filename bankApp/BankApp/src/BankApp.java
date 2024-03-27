
import java.util.*;

class BankAccount {
    private double accBalance; 
    private String accName;
    private double [] depHistory = new double[5];
    private double [] withdrawHistory = new double[5];
    int dIndex = 0;
    int wIndex = 0;
    Scanner bankScanner = new Scanner(System.in);




    BankAccount(String accName) {
        this.accName = accName;
        this.accBalance = 0.00;
        
    }
   void deposit() {
    System.out.println("Welcome " + accName + " Your account balance: £" + displayBalance());
    System.out.println("Enter amount you would like to deposit: ");
    double sum = bankScanner.nextDouble();
    accBalance += sum;
    depHistory[dIndex] = sum;
    dIndex++;
    
    System.out.println("Your account balance after transaction: £" + displayBalance());
    }
    void withdraw() {
        System.out.println("Welcome " + accName + " Your account balance: £" + displayBalance());
        System.out.println("Enter amount you would like to withdraw: ");
        double sum = bankScanner.nextDouble();
        if(accBalance >= sum)
         {   accBalance -= sum;
            withdrawHistory[wIndex] = sum;
            wIndex++;
            System.out.println("Your account balance after transaction: £" + displayBalance());


        }else System.out.println("You have not enough funds to withdraw\n");
    }
    double displayBalance() {
        return accBalance;
    }
    String getName() {
        return accName;
    }
    void operate() {
        int choice=0;
    while(choice != 6){
        choice = 0;
        System.out.println("Hello " + accName + " What you would like to do? ");
        System.out.println(" 1. display balance \n 2.Withdraw \n 3.Deposit \n 4.Deposit History\n 5.Withdraw History\n 6.Quit ");
        System.out.println();
        choice = bankScanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println(displayBalance());
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
    void displayArray(double arr[]) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > 0)
            System.out.println(arr[i]);
    }
}

public class BankApp {
   static Scanner myScanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        

        
        System.out.println("Welcome in Bank\n Type your name and open bank account in one click!");
        String userName = myScanner.nextLine();
        BankAccount acc = new BankAccount(userName);
        acc.operate();
 

}

        
    
}
