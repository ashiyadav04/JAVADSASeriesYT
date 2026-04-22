public class OperatorsExample {
    static void main() {
        //Operators are special symbols
        //addition (+),substraction(-),multiply(*),divide(/) and many more
//        🔥 Types of Operators in Java
//        1️⃣ Arithmetic Operators
//
//        Used for basic math operations

        int a = 11, b = 5;

        System.out.println(a + b); // 15
        System.out.println(a - b); // 5
        System.out.println(a * b); // 50
        System.out.println(a / b); // 2
        System.out.println(a % b); // 0 (remainder)

//👉 Operators: + - * / %

//        2️⃣ Relational (Comparison) Operators
//
//        Used to compare values → result is true/false

        int c = 10, d = 20;

        System.out.println(c== d); // false
        System.out.println(c != d); // true
        System.out.println(c > d);  // false
        System.out.println(c < d);  // true
        System.out.println(c >= d); // false
        System.out.println(c <= d); // true


        //3.Logical operators
        //Always apply on conditions or true false values
        boolean ashi=true;
        boolean ujjwal=false;
        System.out.println(ashi && ujjwal);
        System.out.println(ashi || ujjwal);
        System.out.println((!ashi) );
        System.out.println((! ujjwal));


        //4.Assignment operators
        //+=,-=,=,/=,%=,*=,also known as shorthand notations
        int num1=25;
        System.out.println( num1+=10);
        System.out.println(num1*=2);
        System.out.println(num1-=11);
        System.out.println(num1/=10);
        System.out.println(num1);


        //5. Unary operators
        //unary plus +a
        //unary minus -a
        //increment ++ it is of two types pre increment and ost increment ++a,a++
        //decrement --
        //logical not !
        //pre increment 1.phle increment karo fir utilise karo(++a)
        //post increment 1.phle use karo fir utilise karo(a++)
        int num=10;
        System.out.println(num++);//num 10 hi print hoga but age use hone se phle 11 ho gya hoga
        System.out.println(++num);//yha num 11 hai abhi ++num hone ke baad num=12 ho gay hai or bahi num=12 print hoga
        System.out.println(num--);//yha num=12 hai phle print hoga fir decrement hoga num =11 ho gya hai
        System.out.println(--num);//yha num=11 hai ab phle decement hoga and then print hoga mtlb num =10
    }

}
