# Learn Java

<aside>

## Day 1: Java Fundamentals and Syntax

**Concepts:**

- Introduction to Java, its purpose (Write Once, Run Anywhere), and the Java Virtual Machine (JVM). * Setting up the environment with the Java Development Kit (JDK) and an IDE (like IntelliJ or Eclipse).
- Basic syntax, including the `main` method signature (`public static void main(String[] args)`) and explicit type declarations.
- Variables and fundamental data types: `int`, `double`, `char`, `boolean`.
- Input/Output using `System.out.println()` and the `Scanner` class.
- Arithmetic (`+`, , , `/`, `%`) and relational (`==`, `!=`, `<`, `>`, `<=`, `>=`) operators.

**Practice Questions:**

1. Declare variables for your favorite book's title (`String`), the number of pages (`int`), and the price (`double`). Print a formatted summary of the book to the console.
2. Write a program that takes two integers from the user using the `Scanner` class, multiplies them, and prints the result.
3. Write a program that asks the user for a length and width (as `double`s) and calculates the perimeter of a rectangle.
4. Write a program that takes two integers from the user and checks if the first number is less than or equal to the second. Print the result as a boolean value (`true` or `false`).

## Day 2: Control Flow and Logic

**Concepts:**

- Conditional statements: `if`, `else if`, `else`.
- Loops: `for` loop (including the enhanced `for` loop for collections) and `while` loop.
- The `break` and `continue` keywords.
- Logical (`&&`, `||`, `!`) and bitwise (`&`, `|`, `^`, `~`, `<<`, `>>`) operators.
- The `switch` statement for multi-way branching.

**Practice Questions:**

1. Create a program that asks the user for their age and determines if they are a minor (under 18), an adult (18-64), or a senior citizen (65+).
2. Write a program that uses a `for` loop to print a countdown from 10 to 1, followed by "Lift-off!".
3. Write a program that simulates a login using a `switch` statement based on a login attempt status code (e.g., 0=Success, 1=Bad Username, 2=Bad Password).
4. Write a program that checks if a user-input number is divisible by both 3 and 5.

## Day 3: Data Structures and Collections

**Concepts:**

- Introduction to the Java Collections Framework (JCF). * `ArrayList`: Resizable-array implementation of the `List` interface (ordered, mutable).
- `HashMap`: Implementation of the `Map` interface (key-value pair collection, unordered).
- `HashSet`: Implementation of the `Set` interface (unordered collection of unique elements).
- Primitive Arrays: Fixed-size, statically typed collections.

**Practice Questions:**

1. Create an `ArrayList` of your five favorite fruits (`String`). Use an enhanced `for` loop to print each fruit on a new line.
2. Write a program that asks the user for five numbers and stores them in a primitive `double[]` array. Then, calculate and print the average of the numbers.
3. Create a `HashMap` of five states and their capitals. Ask the user for a state and print its capital. Handle the case where the state is not found.
4. Write a program that takes a sentence from the user and uses a `HashMap` to count how many times each unique word appears.

## Day 4: Functions, Methods, and Packages

**Concepts:**

- Defining and calling methods (functions) inside a class.
- Method arguments, return types, and method overloading.
- Scope and access modifiers (`public`, `private`, `protected`).
- Packages: Organizing related classes and interfaces.
- Importing and using classes from standard packages (e.g., `java.lang.Math`, `java.util.Random`).

**Practice Questions:**

1. Define a static method `isEven(int number)` that takes a number as an argument and returns `true` if it's even, and `false` otherwise.
2. Write a non-static method `calculateArea(double length, double width)` within a utility class that returns the area of a rectangle.
3. Create a package named `com.myutils` and define a class within it that contains a static method to generate a random integer within a user-defined range. Import and use this class in your main program.
4. Write a static method `reverseString(String s)` that takes a string and returns its reversed version using the `StringBuilder` class.

## Day 5: Object-Oriented Programming (OOP)

**Concepts:**

- **The four pillars of OOP:** Encapsulation, Inheritance, Polymorphism, and Abstraction.
- Defining classes and creating objects using the `new` keyword.
- Constructors (the Java equivalent of `__init__`) and the `this` keyword.
- Class (static) and instance attributes (fields) and methods.
- Basic inheritance using the `extends` keyword.
- Method Overriding and the `@Override` annotation.

**Practice Questions:**

1. Define a `Dog` class with private attributes for `name` and `age`. Include a constructor and a public method `bark()` that prints a sound. Use getters and setters for the attributes.
2. Create a `Car` class with properties `make` and `model`. Include a method `displayInfo()` that prints both. Create two different car objects.
3. Create an abstract class `Shape` with an abstract method `area()`. Create a concrete subclass `Square` that implements and overrides this method to return the area of a square.
4. Write a program that simulates a simple `BankAccount` class with `deposit` and `withdraw` methods. Throw an `IllegalArgumentException` if a withdrawal would result in a negative balance.

## Day 6: File Handling and Exception Management

**Concepts:**

- Reading from and writing to files using `FileWriter`, `FileReader`, `BufferedReader`, and `PrintWriter`.
- The **try-with-resources** statement for automatic resource closing.
- Checked vs. Unchecked Exceptions (e.g., `IOException` vs. `NullPointerException`).
- Exception handling with `try`, `catch`, `finally`, and `throws`.
- Common exceptions: `FileNotFoundException`, `IOException`, `NumberFormatException`.

**Practice Questions:**

1. Write a program that prompts the user for their name and then writes "Hello, [Name]!" to a file called `greeting.txt`.
2. Create a program that reads the contents of a file named `story.txt` and prints each line. Use a `try-catch` block to handle a `FileNotFoundException`.
3. Write a program that asks the user for two numbers and performs division. Use a `try-catch` block to handle a `NumberFormatException` (if they enter text) and an `ArithmeticException` (for division by zero).
4. Create a simple program that reads a file and counts the total number of characters in it, not including whitespace.

## Day 7: Practical Project: Build a CLI Contact Book Application

**Goal:** Build a functional command-line contact book where users can manage contacts.

- **Functionality:** The app should allow a user to add a contact (Name, Phone, Email), view all contacts, and search for a contact by name.
- **Data Structure:** Use an `ArrayList<Contact>` where `Contact` is a custom class.
- **OOP:** Define the `Contact` class (Day 5 concepts) and manage the list of contacts in a `ContactManager` class.
- **User Interface:** Implement a simple command-line interface with a `while` loop that presents a menu of options using the `Scanner` class.
- **File I/O:** Use file handling (e.g., `FileOutputStream` and `ObjectOutputStream`) to save the list of `Contact` objects to a binary file (`contacts.ser`) at the end of the session and load it when the program starts. *Alternatively, use simple text file I/O for simplicity.*
- **Error Handling:** Use `try-catch` blocks to handle potential errors, such as I/O problems or user entering invalid menu options.
</aside>