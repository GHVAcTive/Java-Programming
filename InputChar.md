﻿```java

import java.util.*;
import java.util.Scanner;

class sum
{
    public static void main(String arg[])
    {
        char ch;
        System.out.print("Enter a Number : ");
        Scanner scan = new Scanner(System.in);
        ch = scan.nextLine().charAt(0);
        //System.out.println(ch);

        sum.check(ch);
    }

    

    static void check(char ch)
    {
        char cha[] = {'a','e','i','o','u','A','E','I','O','U'};
        int flag=0;
        for(char a : cha)
        {
            if(a == ch )
            {
                System.out.println("Vowel " + (int)ch );
                flag = 1;
                break;
            }
            
        }
        if(flag != 1)
        {
            System.out.println("Consonant " + (int)ch );
        }
    }
}


```
