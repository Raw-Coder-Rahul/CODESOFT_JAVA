import java.util.*;
import java.lang.Math;

public class Guess_Number {
    Scanner sc = new Scanner(System.in);
    public void Guess(String a) {
        int count = 0;
        
        double rand = Math.random();
        int p = (int)(rand * 100)+1;
        boolean maxattampt = false;
        int attampt = 7;
        for(int i=0;i<attampt;i++)
        {
            System.out.print("\nDear "+a+" Guess a number : ");
            int user = sc.nextInt();
            if (user == p) {
                System.out.println("Correct");
                maxattampt = true;
                break;
            }
            else if (user > p) {
                System.out.println("Dear "+a+",You Choose Too High Number.");
            }
            else {
                System.out.println("Dear "+a+",You Choose Too Low Number.");
            }
            count = count + 1;
        }
        if(maxattampt!=false)
        {
            System.out.println(a+" Your Score is : "+(int)(100/count));
        }
        else
        {
            System.out.println("Sorry! "+a+" Your attampt is exceed.");
        }
    }
    public static void main(String[] args) {
        Guess_Number num = new Guess_Number();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome Player Our Special Number Game");
        System.out.println("Instruction - \n 1. Maximum attampt 7 times. \n 2. In this game number is coming 1 to 100.");
        System.out.print("\nPlayer Enter Your Name : ");
        String a = scan.next();
        System.out.println("So, "+a+" Are You Ready For this game.");
        System.out.print("So, Yes press 'y' or 'Y' if No press any type of key : ");
        char yes = scan.next().charAt(0);
        switch (yes) {
            case 'y':
            case 'Y':
                num.Guess(a);
                char Round;
                do{
                    System.out.print(a+ "Are you trying to play new game(Press 'Y'|'y' if not 'N'|'n': ) : ");
                    Round = scan.next().charAt(0);
                    if (Round == 'Y' || Round == 'y')
                    {
                        num.Guess(a);
                    }
                }while (Round == 'Y' || Round == 'y');
                System.out.println(a + " As your wish ");
                break;
        
            default:
                System.exit(0);
                break;
        }
        scan.close();
    }
}
