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
            System.out.print("Enter " + i+1 + " Number : ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Your Sorting Array : ");
        int arr2[] = A.Sort(arr);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] Sort(int[] arr)
    {
        for(int j=0; j<arr.length; j++)
        {
            for(int i=0; i<arr.length-1; i++ )
            {
                if(arr[i] <= arr[i+1])
                {
                    continue;
                }
                else
                {
                    int swap;
                    swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                }
            }
        }
        return arr;
    }
}