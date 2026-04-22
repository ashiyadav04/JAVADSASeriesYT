import java.math.BigInteger;
import java.util.Scanner;
public class ScannerExample {
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        System.out.println("Sum is :"+add);
        System.out.println(" a is:"+a);
        System.out.println("Enter string:");
        String n=sc.next();
        System.out.println("String is :"+n);
        System.out.println("Enter float value:");
        float f=sc.nextFloat();
        System.out.println("Float value is:"+f);
        System.out.println("Enter bid integer");
        BigInteger first=sc.nextBigInteger();
        System.out.println("Biginteger is:"+first);


    }
}
