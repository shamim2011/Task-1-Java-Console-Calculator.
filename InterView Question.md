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
***5.How is Scanner used for input?***  
**Ans**  
***6.Explain the role of a loop.***  
**Ans**  
***7.Difference between while and for loop?***  
**Ans**  
***8.What is the JVM?***  
**Ans**  
***9.How is Java platform-independent?***  
**Ans**  
***10.How do you debug a Java program?***  
**Ans**  
