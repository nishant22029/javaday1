import  java.util.Scanner;
public class CompanyInsurance {
        public static void main(String[] args)
        {
            char ge,ms;
            int age;
            System.out.println("Enter marital status ");
            Scanner obj = new Scanner(System.in);
            ms = obj.next(). charAt(0);

            System.out.println("Enter Gender(M/F):");
            ge = obj.next(). charAt(0);
            System.out.println("Enter Age:\n");
            age= obj.nextInt();
            if (ms=='M' || ms=='m')
            {
                System.out.println ("The driver is insured");
            }
            else if (ge=='M' || ge=='m' && age>30 && ms=='N'||ms=='n')
            {
                System.out.println ("Driver is insured");
            }
            else if (ge=='F'||ge=='f' && age>25 && ms=='N'||ms=='n')
            {
                System.out.println ("Driver is insured");
            }
            else
            {
                System.out.println ("Driver is not insured");
            }
        }
    }

