import java.util.Scanner;

class A
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = scan.nextInt();
        System.out.println("Your Number is "+ check_Palindrome(a));
        
    }

    static String check_Palindrome(int n)
    {
        int k=0, l=n;
        while(n > 0)
        {
            k = k*10 + n%10;
            n = n/10;
        }

        if(k == l)
        {
            return "Palindrome";
        }
        else
        {
            return "Non-Palindrome";
        }
    }
}