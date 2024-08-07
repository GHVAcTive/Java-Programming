﻿# Java Loop Types - Quick Notes

## 1. For Loop 🔄
- **Use When**: You know the exact number of iterations. 🕒
- **Example**: Iterating through a fixed range.
- **Key Point**: Combines initialization, condition, and iteration in one line.

 ```java
  for (int i = 0; i < 5; i++) {
      System.out.println("For Loop iteration: " + i);
  }
```

## 2. While Loop ⏳
- **Use When**: The number of iterations is not known ahead of time. ❓
- **Example**: Looping until a condition is met.
- **Key Point**: Condition is checked before the loop body executes.

```java
int i = 0;
while (i < 5) {
    System.out.println("While Loop iteration: " + i);
    i++;
}
```
## 3. Do-While Loop 🔄🔁
- **Use When**: You need the loop to run at least once. ✅
- **Example**: Looping and then checking the condition.
- **Key Point**: Condition is checked after the loop body executes.

```java
int i = 0;
do {
    System.out.println("Do-While Loop iteration: " + i);
    i++;
} while (i < 5);
```

## 4. Enhanced For Loop (For-Each) 🌀
- **Use When**: Iterating over arrays or collections. 📚
- **Example**: Traversing elements in a collection.
- **Key Point**: Simplifies syntax for iterating through elements.

```java
class Hello
{
    static int c;
    
    public static void main(String arg[])
    {
        int a[] = {10,12,13,15};
        for(int b : a)
        {
            c += b;
            System.out.println(c);    
        }
        System.out.println(k);
    }
}
```

### Summary 📝
- **For Loop**: Known iteration count. 🕒
- **While Loop**: Unknown iteration count. ❓
- **Do-While Loop**: Executes at least once. ✅
- **Enhanced For Loop**: Simplifies iteration over collections ( that means array ). 📚
