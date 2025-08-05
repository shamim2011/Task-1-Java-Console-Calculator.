### Interview Questions:

***1.What is method overloading?***  
**Ans:**  ✅ Method Overloading in Java
Method Overloading is a feature in Java that allows a class to have more than one method with the same name, as long as their parameter lists are different (either in number, type, or order of parameters).

🔍 Key Points:
It improves code readability and reusability.

It happens at compile time → also called Compile-Time Polymorphism or Static Polymorphism.

Return type can be different, but it alone can't be used to overload a method.

✅ How Can Methods Be Overloaded?
By changing the number of arguments

By changing the data type of arguments

By changing the order of arguments (if types are different)

***2.How do you handle divide-by-zero?***  
**Ans**  1. Using if check (for integers or doubles)
if (denominator != 0) {
    int result = numerator / denominator;
} else {
    System.out.println("Cannot divide by zero.");
}
2. Using try-catch block (for integers)
try {
    int result = num1 / num2;
} catch (ArithmeticException e) {
    System.out.println("Error: Division by zero is not allowed.");
}
📝 Note: ArithmeticException is only thrown for integer division, not for double division.

3. For double values
No exception is thrown, but result is:

Infinity if divided by 0.0

NaN (Not a Number) if 0.0 / 0.0

double result = 10.0 / 0.0;   // result = Infinity


***3.Difference between == and .equals()?***  
**Ans**  
Use == for:

Comparing primitive types

Checking if two object references point to the same object  

Use .equals() for:  

Comparing values/content of two objects
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);        // false (different objects)
System.out.println(a.equals(b));   // true  (same content)

***4.What are the basic data types in Java?***  
**Ans**   
In Java, the basic (or primitive) data types are:

byte – 8-bit signed integer (range: -128 to 127)  
short – 16-bit signed integer (range: -32,768 to 32,767)  
int – 32-bit signed integer (range: -2,147,483,648 to 2,147,483,647)  
long – 64-bit signed integer (range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)  
float – 32-bit floating point number (single precision)  
double – 64-bit floating point number (double precision)  
char – 16-bit Unicode character (range: '\u0000' to '\uffff')  
boolean – represents true or false values  
***5.How is Scanner used for input?***  
**Ans**  
Scanner scanner = new Scanner(System.in); creates a scanner to read input from the keyboard.  
Methods like nextInt() and nextLine() read different types of input.  
Always close the scanner with scanner.close(); when done.  
***6.Explain the role of a loop.***  
**Ans**  
🔁 Role of a Loop in Java
A loop in Java is used to execute a block of code repeatedly as long as a specified condition is true.  
It helps reduce code duplication and makes programs more efficient and dynamic.  
✅ Why Use Loops?  
To repeat tasks automatically  

To iterate over arrays, lists, or collections  

To process input/output continuously  

To perform tasks like searching, counting, etc.  
for loop -> When the number of iterations is known  
while loop	-> When the condition is checked before each run  
do-while loop	-> Executes at least once, checks condition later  
for-each loop	-> Used to traverse arrays or collections  
***7.Difference between while and for loop?***  
**Ans**  
***8.What is the JVM?***  
**Ans**  
***9.How is Java platform-independent?***  
**Ans**  
***10.How do you debug a Java program?***  
**Ans**  
