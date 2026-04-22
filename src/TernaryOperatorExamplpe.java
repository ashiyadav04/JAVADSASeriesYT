import java .util.Scanner;
public class TernaryOperatorExamplpe {
    void main()
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
     int a=sc.nextInt();
    String b=(a>=18)?("you can vote"):("You can't vote");
        System.out.println(b);
    }
}
