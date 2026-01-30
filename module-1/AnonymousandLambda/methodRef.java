/*
Method Reference:
    Method references is just a shortcut for a lambda expression that only calls an existing method.
    If a lambda expression contains only one statement and that statement simply calls an existing method, the a method reference can be used to make the code more readable.
    Method references works only when lambda directy calls one existing method.
    Syntax:
        ClassName::methodName

    eg:
        // Lambda expression
        I2 ref1 = (a, b) -> Integer.sum(a, b);
        system.out.println("Lambda Sum = " + ref1.add(10, 20));

        ** Instead of above lambda expression we can use below method reference **

        // Method reference
        I2 ref2 = Integer :: sum;
        system.out.println("Method Reference Sum = " + ref2.add(10, 20));

*/

import java.util.List;

interface I2 {
    int add(int a, int b);
}

public class methodRef {
    public static void main(String[] args) {
        // Lambda expression
        I2 ref1 = (a, b) -> a + b;
        System.out.println("Lambda Sum = " + ref1.add(10, 20));

        // Method reference
        I2 ref2 = Integer::sum;
        System.out.println("Method Reference Sum = " + ref2.add(10, 20));

        List<String> names = List.of("Aditya", "Devansh", "Vishnu", "Animesh", "Mohit");
        System.out.println("\n--Using Lambda--");
        names.forEach(name -> System.out.println(name));
        // Method Reference
        System.out.println("\n--Using Method Reference--");
        names.forEach(System.out::println);
    }
}