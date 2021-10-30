import java.util.Scanner;
class learnment_2
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int d; int t = n; int c = 0; int sq;
        while (t!=0) 
        {
            d = t%10;
            sq = d*d;
            System.out.println(d);
            System.out.println(sq);
            c ++ ;
            t = t/10;
        }
        System.out.println("Total count of numbers is " + c);
        sc.close();   
    }
}