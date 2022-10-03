import java.util.Scanner;
public class Arithmatic {
    static int add(int a,int b)
    {
        return  a+b;
    }
    static  int sub(int a,int b)
    {
        return a-b;
    }
    static  int mul(int a,int b)
    {
        return  a*b;
    }
    static  int div(int a,int b)
    {
        return a/b;
    }
    static int rem(int a,int b)
    {
        return  a%b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("enter number 2");
        int b=sc.nextInt();
        System.out.println("addition="+add(a,b));

        System.out.println("subtraction="+sub(a,b));

        System.out.println("multiplication="+mul(a,b));

        System.out.println("division="+div(a,b));

        System.out.println("remainder="+rem(a,b));
    }
}
