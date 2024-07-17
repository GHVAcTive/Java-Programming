# Basic Java Programming Knowledge ☕️

---

## [Definition of Java] 🌟

Java is a **Class-Based, High-Level, Object-Oriented Language**.

**Developer:** James Gosling (In 1991) 📅

**JDK:** Java Development Kit - Contains everything needed for Java programming, including tools and environment. 🛠️

**JRE:** Java Runtime Environment - Part of JDK, helps to run Java programs and contains tools for executing Java applications. 🚀

**JVM:** Java Virtual Machine - Part of JRE, converts bytecode into machine language. 🌐

---

### Java is a Platform-Independent Language 🌍

Java can run on any device or operating system that has the JVM installed. 

---

### Basic Java Commands 🖥️

- **Save:** `Class_name.java` 📂
- **Compilation:** `javac Class_name.java` (File Name) 📜
- **Execution:** `java Class_name` (Class Name) ▶️
- **Version Check:** `java -version` 🔄

---

### Java Name Evolution 🔄

- **Greentalk (.gt)** ➡️ **Oak** ➡️ **Java** ☕️

---

### Java Company History 🏢

**Original:** Sun Microsystems ☀️  
**Acquired by:** Oracle in 2010 🔄

---

### Java Versions 📅

- **First Versions:** Java Alpha and Beta 🌟

---

### Java Types 📚

- **Core Java:** Basics of Java programming
- **Advanced Java:** Advanced features and APIs
- **Android Java:** Java for Android app development 📱

---

### Java is Portable 🚀

Java compiles code into **ByteCode** that can be run on any system with a compatible JVM. The `.class` file (ByteCode) is platform-independent and can be moved across different systems. 🖥️💾

**Process:**

- `[ .java ]` → **Source Code** 💻
- **Using `javac` Compiler** → `[ .class ]` → **ByteCode** 🧩
- `[ .class ]` → **ByteCode** → **Using JVM** → **Machine Code** 🌐

---

### Java is Dynamic 🌟

Java allows modifications or additions to classes, methods, and objects at runtime. This dynamic nature helps in creating flexible and adaptable programs. 🔄

---

### Java Robustness 💪

Robustness refers to the ability of a program to handle errors or unexpected situations without crashing. It ensures that programs continue to function correctly even when issues arise. 🛡️

---

### Why Should We Keep the `main` File as `public`, `static`, and `void`? 🤔

1. **`public`** 🚪  
   **Meaning:** The `public` keyword makes the `main` method accessible from anywhere, which is crucial for the JVM to call it.  
   **Why It’s Important:** The JVM must have public visibility to invoke the `main` method and start execution.

2. **`static`** 🏗️  
   **Meaning:** The `static` keyword means that the `main` method belongs to the class itself rather than to instances of the class.  
   **Why It’s Important:** The `main` method must be callable without creating an instance of the class.

3. **`void`** 🚫  
   **Meaning:** The `void` keyword specifies that the `main` method does not return any value.  
   **Why It’s Important:** The `main` method is the entry point for the program and doesn’t need to return a result.

4. **`main`** 🎯  
   **Meaning:** `main` is the special method name that the JVM looks for to start a Java program.  
   **Why It’s Important:** `main` is recognized as the entry point of the application by the JVM.

5. **`String[] args`** 📜  
   **Meaning:** `String[] args` is an array of `String` objects used to pass command-line arguments to the program.  
   **Why It’s Important:** Allows users to provide input to the program through the command line.

---