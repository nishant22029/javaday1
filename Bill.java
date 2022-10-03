import  java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter price and quantity of item");
        double p=sc.nextInt();
        double q=sc.nextInt();

       double d;
        if(q>=10) {
            d = p * 0.1;
            System.out.println("total amount="+((p*q)-d));
        }
        else
            System.out.println("total amount="+(p*q));

    }
}
