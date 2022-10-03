import java.util.Scanner;
public class Area {
    static  double areaOfCircle(int a)
    {
        return  (2*3.14*a);
    }
    static  double areaOfSquare(int a)
    {
        return a*a;
    }
    static double areaOfRightTriangle(int a,int b)
    {
        return a*b/2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        int r=sc.nextInt();
        System.out.println("enter the side of square");
        int side=sc.nextInt();
        System.out.println("enter the perpendicular side of triangle");
        int per=sc.nextInt();
        System.out.println("enter the base of triangle");
        int base=sc.nextInt();
        System.out.println("area of circle="+areaOfCircle(r));
        System.out.println("area of square="+areaOfSquare(side));
        System.out.println("area of right angle triangle="+areaOfRightTriangle(per,base));
    }

}
