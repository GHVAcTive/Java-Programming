import java.util.Scanner;

class A
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scan.nextInt();
        System.out.println("Your Number is "+ prime(n) );
    }
    
    static String prime(int a)
    {
        int flag=0;
        if(a == 2 )
        {
            return "Prime";
        }
        else
        {
            for(int i=2; i<=a/2; i++)
            {
                if(a%i == 0 )
                {
                    return "Non-Prime";
                }
            }    
            if(a == 1)
            {
                return "Non-Prime";
            }

            return "Prime";
        }
    }
}