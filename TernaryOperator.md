```java
class Hello
{
    static int c;
    
    public static void main(String arg[])
    {
        int a[] = {10,12,13,15};
        int g=20,b=30;
        int Max = (g>b) ? g : b;
        
        System.out.println(Max);
        
        for(int l : a)
        {
            c += l;
            System.out.println(c);    
        }
    }
}
```