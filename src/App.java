import java.util.Scanner;
class aura
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
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
        sc.close();
    }
}