import java.util.Scanner;

class A
{
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = scan.nextInt();
        System.out.println("Your Number is "+ check_ArmStrong(a));
        
    }

    static String check_ArmStrong(int n)
    {
        int k=0,save=0,l=n;
        int[] arr = new int[10];
        while(n>0)
        {
            arr[k] = n%10;
            n = n/10;
            k++;
        }
        for(int i=0; i<k; i++)
        {
            int m = 1;
            for(int j=0; j<k ; j++)
            {
                m *= arr[i];
            }
            arr[i] = m;
            System.out.println(arr[i]);
        }
        for(int i=0; i<=k; i++)
        {
            save += arr[i];
        }
        if(save == l)
        {
            return "ArmStrong";
        }
        else
        {
            return "Non-ArmStrong";
        }
    }
}