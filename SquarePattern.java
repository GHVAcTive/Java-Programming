class Pattern
{
    public static void main(String arg[])
    {
        int n =4;
        for(int i=1; i<=n; i++)
        {

            if(i==1 || i==n)
            {
                for(int k=0; k<n; k++)
                {
                    System.out.print("* ");

                }
                
                System.out.print("\n");
            } 
            else
            {
                for(int j=1; j<=n; j++)
                {
                    if(j==1 || j==n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
        }    
    }
}