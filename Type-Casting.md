# Type-Casting in Java 🔄

Type-casting in Java is the process of converting one data type to another. It is an essential concept that allows you to convert between primitive data types or between objects of different classes.

---

## Types of Type-Casting in Java 🎭

### **1. Implicit Type-Casting (Automatic Type-Casting)** 🌟

Implicit type-casting happens automatically when a smaller data type is converted to a larger data type. This type of casting is done by the compiler without explicit instruction.

**Examples:**

- `int` to `long`
- `float` to `double`

**Why It’s Important:** Implicit casting is safe and automatic because there is no loss of data in the conversion process.

---

### **2. Explicit Type-Casting (Manual Type-Casting)** ✋

Explicit type-casting requires you to manually convert a larger data type to a smaller data type using a type-cast operator. This type of casting must be performed by the programmer.

**Examples:**

- `double` to `int`
- `long` to `short`

**Why It’s Important:** Explicit casting is necessary when converting from a larger data type to a smaller one, which may result in data loss.

---

## Example of Type-Casting in Java 📜

Here’s an example demonstrating both implicit and explicit type-casting:

```java
class Hello {
    public static void main(String[] args) {
        double a = 10.7;
        int b = (int)a;  // Explicit Type-Casting
        System.out.println(b); // OUTPUT: 10

        double c = b;  // Implicit Type-Casting
        System.out.println(c); // OUTPUT: 10.0
    }
}
