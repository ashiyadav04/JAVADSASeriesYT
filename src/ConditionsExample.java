import java.util.Scanner;
public class ConditionsExample {
  static  void main() {
//      //1.IF ELSE
        Scanner sc = new Scanner(System.in);
//      int a;
//      System.out.println("Enter value of a:");
//      a = sc.nextInt();
//      if (a > 18) {
//          System.out.println("YOU can vote");
//      } else {
//          System.out.println("YOU can not vote.you are not older than 18.");
//      }
//      //2.IF ELSE LADDER
//      int num1 = sc.nextInt();
//      int num2 = sc.nextInt();
//      int num3 = sc.nextInt();
//      int add = num1 + num2 + num3;
//      if (add > 90) {
//          System.out.println("A grade");
//      } else if (add > 70 && add <= 90) {
//          System.out.println("B grade");
//      } else if (a > 50 && a < 70) {
//          System.out.println("C grade");
//      } else {
//          System.out.println("Less than 30 fail");
//      }
       //3.Nested if else ladder
      System.out.println("Enter value of day number:");
      int day=sc.nextInt();
      if(day>=1 && day<8) {
          if (day == 1) {
              System.out.println("Monday");
          } else if (day == 2) {
              System.out.println("Tuesday");
          } else if (day == 3) {
              System.out.println("Wednesday");
          } else if (day == 4) {
              System.out.println("Thursay");
          } else if (day == 5) {
              System.out.println("Friday");
          } else if (day == 6) {
              System.out.println("Saturday");
          } else {
              System.out.println("Sunday");
          }
      }else {
          System.out.println("Enter valid day number");
      }
  }
}

