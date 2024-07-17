# Data Types in Java 📊

In Java, data types are categorized into two main groups: Primitive (Basic) Data Types and User-Defined (Non-Primitive) Data Types. Understanding these types is crucial for effective programming.

---

## Primitive Data Types (Basic Data Types) 🧩

Primitive data types are the most basic types of data that Java handles. They are predefined by the Java language and are not objects.

### Numeric Data Types 🔢

#### **Integer Types** 🧮

| **Type** | **Size** | **Description**                               | **Example**  |
|---------|----------|-----------------------------------------------|--------------|
| **`byte`**   | 1 byte    | Smallest integer type; range: -128 to 127    | `byte a = 10;` |
| **`short`**  | 2 bytes   | Short integer type; range: -32,768 to 32,767 | `short b = 1000;` |
| **`int`**    | 4 bytes   | Default integer type; range: -2^31 to 2^31-1 | `int c = 50000;` |
| **`long`**   | 8 bytes   | Large integer type; range: -2^63 to 2^63-1   | `long d = 100000L;` |

#### **Decimal Types** 💵

| **Type** | **Size** | **Description**                                       | **Example**   |
|---------|----------|-------------------------------------------------------|---------------|
| **`float`**  | 4 bytes   | Single-precision floating point; 6-7 decimal digits | `float e = 10.5f;` |
| **`double`** | 8 bytes   | Double-precision floating point; 15-16 decimal digits| `double f = 20.99;` |

### Non-Numeric Data Types 🌟

| **Type**    | **Size** | **Description**                               | **Example** |
|------------|----------|-----------------------------------------------|-------------|
| **`char`**  | 2 bytes   | Single 16-bit Unicode character              | `char g = 'A';` |
| **`boolean`** | 1 bit    | Represents `true` or `false` values           | `boolean h = true;` |

---

## User-Defined Data Types (Non-Primitive Data Types) 🛠️

User-defined data types are created by the programmer to model complex data structures and manage data.

### **Types of User-Defined Data Types** 🏗️

| **Type**       | **Description**                                   | **Example**         |
|----------------|---------------------------------------------------|---------------------|
| **`Class`**    | Defines a new data type by creating objects with attributes and methods. | `public class Person { }` |
| **`Interface`** | Defines a contract for classes to follow. Classes implement interfaces to adhere to certain methods. | `public interface Animal { void makeSound(); }` |
| **`Array`**    | A collection of elements of the same type stored in a contiguous memory location. | `int[] numbers = {1, 2, 3};` |
| **`String`**   | A sequence of characters used to store text.   | `String name = "Java";` |

---

### Summary of Data Types 📝

| **Type**     | **Category** | **Examples**                          | **Size**                |
|--------------|--------------|---------------------------------------|-------------------------|
| **Primitive** | Basic       | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` | Varies (1 to 8 bytes) |
| **Non-Primitive** | User-Defined | `Class`, `Interface`, `Array`, `String` | N/A (Defined by user)  |

### Notes 📝

- **Primitive Data Types**: The building blocks of data handling in Java. They are predefined and efficient. ⚙️
- **User-Defined Data Types**: Created to handle more complex data structures and provide a higher level of abstraction. 🌟
- **Numeric Types**: Split into integer and decimal types based on whether they hold whole numbers or floating-point numbers. 🔢
- **Non-Numeric Types**: Include `char` for characters and `boolean` for true/false values. 🧩
- **User-Defined Types**: Allow you to create custom data structures and models. 🛠️

---

Feel free to copy and paste this Markdown content into your `.md` file. Let me know if there’s anything else you’d like to add or adjust! 😊
