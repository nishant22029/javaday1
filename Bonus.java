import  java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary");
        double basic=sc.nextDouble();
        double ta=basic*0.1;
        double da=basic*0.15;
        double hra=basic*0.2;
        double pf=basic*0.12;
        double bonus;
        double sal;
        if(basic>=20000) {
            bonus = basic * 0.1;
            sal=basic+ta+da+hra+bonus;
            System.out.println(sal);
        }
        else
        {
            bonus=basic*0.2;
            sal=basic+ta+da+hra+bonus;
            System.out.println(sal);
        }
    }
}
