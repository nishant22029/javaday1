import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("enter number 2");
        int b=sc.nextInt();
        int r=a>b?a:b;
        System.out.println("greatest number="+r);
    }
}
