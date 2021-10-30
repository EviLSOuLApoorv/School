import java.util.Scanner;
class learnment
{
        static int logic(int x, int  y)
        {
            int z;
            if (x>y)
            {
                z = x+y;
            }
            else
            {
                z = (x+y)*5;
            }
            return z;
        }
        public static void main(String args [])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value for a ");
            int a = sc.nextInt();
            System.out.println("Enter  value for b ");
            int b = sc.nextInt();
            int c;
            c = logic(a, b);
            System.out.println("Enter  value for a1 ");
            int a1 = sc.nextInt();
            System.out.println("Enter  value for b1 ");
            int b1 = sc.nextInt();
            int c1;
            c1 = logic(a1, b1);
            System.out.println("Value for c = " + c);
            System.out.println("Value for c1 = " + c1);
            sc.close();
        } 
}   