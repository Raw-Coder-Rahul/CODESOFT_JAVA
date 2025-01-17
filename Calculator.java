import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject;
        double average,sum=0;
        int marks;
        System.out.print("Dear User Please write how many subject : ");
        subject=sc.nextInt();
        for(int i=0;i<subject;i++)
        {
            System.out.print("Subject(out of 100) : ");
            marks = sc.nextInt();
            if(marks<=100)
            {
                sum += marks;
            }
            else
            {
                System.out.println("Error! Your mark is break the range of 100");
                break;
            }
        }
        System.out.println("Total Marks : "+(int)sum);
        average = (sum/subject);
        System.out.println("Average Mark is : " +average+"%");
        System.out.print("Your Grade is : ");
        if(average==100)
        {
            System.out.println("S");
        }
        else if(average>=90)
        {
            System.out.println("A++");
        }
        else if(average>=80)
        {
            System.out.println("A+");
        }
        else if(average>=70)
        {
            System.out.println("A");
        }
        else if(average>=60)
        {
            System.out.println("B+");
        }
        else if(average>=50)
        {
            System.out.println("B");
        }
        else if(average>=40)
        {
            System.out.println("C");
        }
        else if(average>=30)
        {
            System.out.println("D");    
        }
        else
        {
            System.out.println("F");
        }
        sc.close();
    }
}
