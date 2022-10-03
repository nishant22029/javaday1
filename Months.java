import  java.util.Scanner;
public class Months {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of days");
      double d=sc.nextInt();
        double months=(d%365)/30;
        System.out.println("total months according to days="+months);
    }
}
