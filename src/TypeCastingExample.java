public class TypeCastingExample {
    static void main() {
        //Implicit type conversion when small datatype convert int large one
        //example: short->int,byte->short,int->long
        byte a=100;
        System.out.println(a);
        int b=a;
        System.out.println(b);

//        //can't do this
//        int a=125;
//        byte b=a;


        //but explicitly data loses
        //explicit type conversion is the solution for that
        //now do that
        int l=12;
        byte m=(byte)l;//Explicitly convert into byte
        System.out.println("m="+m);
        //another example
        long value=1235667673;
        int num=(int )value;
        System.out.println("num="+num);
        int c=10;
        char d=(char)c;
        System.out.println(d);
        System.out.println("My name is ASHI yadav");
    }
}
