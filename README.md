# Basic Java-Programming Knowledge
<br>
# [Def. Java] - Java is a Class Based high Level Object Oriented Language.
<br>
Developer : James Gosling ( In-Year 1991 )
<br>
JDK - Java Development Kit (Contain everything to do with Java PRogram like Environment)
<br>
JRE - Java Runtime Environment (inside JDK, and help to run the Program, having tool to run java Program)
<br>
JVM - Java Virtual Machine (inside JRE, convert code into machine Language )
<br>

## Java is Platform Independent Language.

<br>

## Save : Class_name.java
<br>

## Compilation : javac Class_name.java
<br>

## Execution : java Class_name
<br>

### Version Check : Java -version

<br>

### Java Name Change : greentalk(.gt) --> oak --> java (Coffee Sign)
<br>

### Java Company (Sun Mircosystem sold to Oracle in 2010) --> Now Oracle
<br>

### First Version : Java aplha and Beta..
<br>

### Java Type : Core, Advance, Android Java.
<br>

### Java is Portable : We can make a ByteCode by Java Source Code using Compiler and then Copy the ByteCode(8 bit ka class so easily handle by the 16/32/64 bits system) to the Pendrive and then run any system easily.
<br>

### [ .java ] --> Source Code || Using Javac Compiler generate --> || [ .class ] --> ByteCode.
<br>

### [ .class ] --> ByteCode || Using JVM it Interpreter --> || Machine Code.

<br>

### Java is Dynamic : You can Changed or add something like the class,method,object or something in the runtime also.

<br>

Robustness means how well something can handle problems or unexpected situations without breaking. In computers and software, it refers to a program's ability to keep working correctly even when there are errors or changes.

<br>

### Why should we Keep the main File as Public and static and void ??
<br>
1. public
<br>
Meaning: The public keyword means that the main method is accessible from anywhere, which is crucial for the JVM to call it. When you run a Java program, the JVM needs to access this method to start execution. If it were not public, the JVM would not be able to access it, and your program would not run.
<br>
Why it's important: For the JVM to be able to invoke the main method from outside the class, it must have public visibility.
<br>
<br>

2. static
<br>
Meaning: The static keyword means that the main method belongs to the class itself rather than to instances of the class. This allows the JVM to call the main method without creating an instance of the class.
<br>
Why it's important: Since the main method is the starting point of the application, it needs to be callable without first creating an object. static allows this.
<br>
<br>

3. void
<br>
Meaning: The void keyword specifies that the main method does not return any value. The main method serves as a starting point for the application, and there is no need for it to return any result to the JVM.
<br>
Why it's important: The main method is designed to initiate the program’s execution and does not need to provide any information back to the JVM.
<br>
<br>

4. main
<br>
Meaning: main is the name of the method. This is a special method name in Java that the JVM looks for when starting a program.
<br>
Why it's important: main is the conventional name that the JVM recognizes as the entry point for the application. If you change this name, the JVM won’t recognize the method as the starting point of the program.
<br>
<br>

5. String[] args
<br>
Meaning: String[] args is an array of String objects used to pass command-line arguments to the program.
<br>
Why it's important: This allows users to provide input to the application via the command line. For example, running java MyClass arg1 arg2 would pass ["arg1", "arg2"] to the main method.
<br>
<br>