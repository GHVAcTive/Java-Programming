## 📝 What is a Variable?

A **variable** is a named of memory location. It is user Defined name and Variable can **Store any type of Values** , used to store data that can be accessed and manipulated throughout a program. Think of it as a **label** attached to a storage container for information.

### 💡 Key Points:
- **Definition:** A variable is a **storage location** with a **name** for holding data.
- **Purpose:** To **store** and **manipulate** information in a program.
- **Analogy:** Like a **container** with a label where you can put and retrieve data.

# Variable Types in Java

## Local Variable
- A variable declared inside the body of the methods and its parameters.
- ✏️ **Syntax with example:**
    ```java
    public class Example {
        public void method() {
            int localVar = 10; // Local variable
        }
    }
    ```

## Instance Variable
- A variable which is inside the class but outside all the methods (also outside the main method).
- ✏️ **Syntax with example:**
    ```java
    public class Example {
        int instanceVar; // Instance variable

        public static void main(String[] args) {
            Example obj = new Example();
            obj.instanceVar = 5;
        }
    }
    ```

## Static Variable
- A variable which is declared as static; it is shared among all instances of the class.
- ✏️ **Syntax with example:**
    ```java
    public class Example {
        static int staticVar; // Static variable

        public static void main(String[] args) {
            Example.staticVar = 10;
        }
    }
    ```

## Example Code

```java
class Hello {
    static int A = 10;  // Static Variable 
    int B = 20; // Instance Variable 

    public static void main(String arg[]) {
        int C = 30; // Local Variable 
        
        Hello ref = new Hello();

        System.out.println(Hello.A); // Static are the class Members
        System.out.println(ref.B);
        System.out.println(C);
    }
}

/* 
   Output: 
   10
   20
   30
*/
```
# Example of Using Static and Instance Variables in Java

Here is an example code to demonstrate the usage of static and instance variables in a Java class:

```java
class A {
    static int a; // Static variable

    void fun() {
        a = 1; // Assigning value to static variable
        int b = 10; // Local variable

        System.out.println("a: " + a + ", b: " + b); // Output the values of a and b
        a++; // Incrementing static variable
        b++; // Incrementing local variable
    }

    public static void main(String[] args) { // Corrected method signature
        A r = new A();
        r.fun(); // Call the fun method
        r.fun(); // Call the fun method again
    }
}
```