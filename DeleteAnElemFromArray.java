import java.util.Scanner;
import java.util.Arrays;

class A
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How Many Elements : ");    
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter " + (i+1) + " Number : ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Your Array : " );
        for(int k : arr)
        {
            System.out.print(k + " ");
        }
        System.out.println("\n");
        System.out.print("Want to Delete : ");
        int delete = scan.nextInt();
        System.out.println("Your Array After Deletion : ");

        int arr2[] = A.Sort(arr, delete);
        for(int k : arr2)
        {
            System.out.print(k + " ");
        }
    }

    public static int[] Sort(int[] arr, int delete)
    {
        int count=0;
        for(int k : arr)
        {
            if(k == delete)
            {
                count++;
            }
        }

        int[] arr2 = new int[arr.length-count];
        int start=0;

        for(int a : arr)
        {
            if(a == delete)
            {
                continue;
            }
            else
            {
                arr2[start] = a;
                start++;
            }
        }
        return arr2;
    }
}