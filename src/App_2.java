import java.util.Scanner;
public class App_2
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Your Choice- A for basic maths, B for Finding a prime number/ buzz number, C for finding bonus/discount");
        char adp = sc.next().charAt(0);
        switch (adp)
        {
            case 'a':
            case 'A':
            {
                System.out.println("Menu your choice -: A for Adiition, B for Substraction, C for Multiplication, D for Division");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'A':
            case 'a': 
            {
                System.out.println("Enter first Number");
                int num1 = sc.nextInt();
                System.out.println("Enter second Number");
                int num2 = sc.nextInt();
                int a = num1 + num2;
                System.out.println("The sum is " + a);
            }
            break;
            case 'B':
            case 'b':
            {
                System.out.println("Enter first Number");
                int num1 = sc.nextInt();
                System.out.println("Enter second Number");
                int num2 = sc.nextInt();
                int a = num1 - num2;
                System.out.println("The difference is " + a);
            }
            break;
            case 'C':
            case 'c':
            {
                System.out.println("Enter first Number");
                int num1 = sc.nextInt();
                System.out.println("Enter second Number");
                int num2 = sc.nextInt();
                int a = num1 * num2;
                System.out.println("The product is " + a);
            }
            break;
            case 'D':
            case 'd':
            {
                System.out.println("Enter first Number");
                int num1 = sc.nextInt();
                System.out.println("Enter second Number");
                int num2 = sc.nextInt();
                int a = num1 / num2;
                System.out.println("The quotient is " + a);
            }
            break;
            default:  System.out.println("Wrong Choice Entered");
        }
            }
            break;
            case 'b':
            case 'B':
            {
                System.out.println("Menu Your Choice :- A for finding a prime number, B for finding a buzz number ");
                char ch = sc.next().charAt(0);
                switch (ch)
                {
                    case 'a':
                    case 'A':
                    {
                        System.out.println("Enter a number");
                        int pn = sc.nextInt();
                        boolean flag = false;
                        for (int i = 2; i<pn/2; i++)
                        {
                            if (pn%i == 0)
                            flag = true;
                        }
                        if (!flag)
                        System.out.println("It is a prime number");
                        else 
                        System.out.println("It is not a prime number");
                    }
                    break;
                    case 'b':
                    case 'B':
                    {
                        System.out.println("Enter a number");
                        int pn = sc.nextInt();
                        if (pn % 7 == 0 || pn % 10 == 7)
                        System.out.println("It is a buzz number");
                        else
                        System.out.println("It is not a buzz number");
                    }
                    break;
                    default :  System.out.println("Wrong Choice Entered");
                }
            } 
            break;
            case 'c':
            case 'C':
            {
                System.out.println("Menu Your Choice :- A for finding Bonus , B for finding Discount ");
                char ch = sc.next().charAt(0);
                switch (ch)
                {
                    case 'a':
                    case 'A':
                    {
                        System.out.println("Enter your Salary");
                        int sal = sc.nextInt();
                        System.out.println("Enter your Bonus");
                        int bns = sc.nextInt();
                        double sna = sal*bns/100;
                        double fna = sna + sal;
                        System.out.println("Your salary after bonus is " + fna); 
                    }
                    break;
                    case 'b':
                    case 'B':
                    {
                        System.out.println("Enter your Purchase Amount");
                        int sal = sc.nextInt();
                        System.out.println("Enter your Discount");
                        int bns = sc.nextInt();
                        double sna = sal*bns/100;
                        double fna = sal - sna;
                        System.out.println("Your Final Amount is " + fna); 
                    }
                    break;
                    default : System.out.println("Wrong Choice Entered");
                }
            }
            break;
            default : System.out.println("Wrong Choice Entered");
        }
        sc.close();
    }
}