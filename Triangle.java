import  java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three angles of triangle ");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();

        if(a1+a2+a3==180 )
        {
            if(a1<=0 || a2<=0||a3<=0)
                System.out.println("the given triangle  is invalid");
            else
                System.out.println("the given triangle  is valid");
        }
        else
            System.out.println("the given triangle is invalid");
    }
}
