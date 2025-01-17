import java.util.*;

public class ATM_INTERFACE {
    private double balance;
    Scanner sc = new Scanner(System.in);
    public void withdrawing(int amount)
    {
        if(balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Transaction Accepted!");
            System.out.println("Yout Total Balance is : "+balance);
        }
        else
        {
            System.out.println("Your Bank Balance is Insufficient.");
        }
    }

    public void deposit(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Transaction Accepted!");
            System.out.println("Your Total Balance is : "+balance);
        }
        else
        {
            System.out.println("Please Type a Correct Deposit Amount.");
        }
    }

    public void checkBalance()
    {
        System.out.println("Your Current Balance is : "+balance);
    }
    public static void main(String[] args) {
        ATM_INTERFACE bank = new ATM_INTERFACE();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("  ATM Machine\n+------------+\n 1. Deposit\n 2. Withdraw\n 3. Balance Enquiry\n 4. Exit");
            System.out.print("Choose a option in number wise : ");
            int choice =  scan.nextInt();  
            switch (choice) {
                case 1:
                    System.out.print("Dear User Please Enter The Deposit Amount : ");
                    int amount = scan.nextInt();
                    bank.deposit(amount);
                    break;
                case 2:
                    System.out.print("Dear User Please Enter The Withdrawal Amount : ");
                    int withdraw = scan.nextInt();
                    bank.withdrawing(withdraw);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Choose A Correct Option.");
                    break;
            }          
        }
    }
}
