/*
forEach():
The forEach() method is used to iterate through elements of a collection or stream and perform actions on each element.
Syntax:
    collection.forEach(element -> {
        // Action to be performed on each element
    });
*/
import java.util.Arrays;
import java.util.List;
public class forEachMethod {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        System.out.println("NAMES OF FRUITS:" + fruits);
        // Using forEach() to print each fruit
        fruits.forEach(fruit -> System.out.println(fruit));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("NUMBERS:" + numbers);
        // Using forEach() to calculate and print the square of each number
        numbers.forEach(number -> System.out.println(number));

        // List<Students> students = Arrays.asList(
        //     new Students(1, "Alice", 85.5),
        //     new Students(2, "Bob", 90.0),
        //     new Students(3, "Charlie", 78.0)
        // );
        // System.out.println("STUDENTS DETAILS:" + students);
        // // Using forEach() to print details of each student
        // students.forEach(student -> System.out.println(student));
    }
}
