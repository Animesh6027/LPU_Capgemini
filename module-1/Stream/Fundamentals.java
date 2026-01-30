/* 
Stream:
    Stream is a Java 8 feature used to process collection data in a functional way without using loops.
    Stream does not store data.
    It works on collections data.
    Stream processes data one by one.
    Stream does not change the original collection.
    
Basic Stream flow: Collection -> Stream -> Operations -> Result
eg: List() -> Stream() -> Filter() -> forEach()

Basic methods of stream:
stream(): Converts a collection into a stream so we can process data in a functional way.
filter(): Used to filter data based on a condition.
forEach(): Used to iterate through each element of the stream and perform an action(commanly used for printing).
map(): Used to transform each element of the stream into another form.
collect(): Used to gather the processed data back into a collection.
sorted(): Used to sort the elements of the stream(uses comparable).
sorted(comparator): Used to sort the elements of the stream based on a custom comparator.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Students {
    int id;
    String name;
    double marks;
    Students(int id, String name, double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
public class Fundamentals {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("To print all numbers one by one: ");
        numbers.stream().forEach(System.out::println);

        System.out.println("\nTo print even numbers one by one: ");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("\n To print odd numbers with extra value 3:");
        numbers.stream().filter(n -> n%2 != 0).map(n -> n + 3).forEach(System.out::println);

        System.out.println("\nTo find even numbers and collect them into a list:");
        List<Integer> even_collector = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even_collector);

        List<String> names = Arrays.asList("Aditya", "Vishnu", "Devansh", "Animesh", "Mohit");
        System.out.println("\n print objects end with sh using stream:");
        names.stream().filter(n -> n.endsWith("sh")).forEach(System.out::println);

        List<Students> students = Arrays.asList(
            new Students(1, "Alice", 85.5),
            new Students(2, "Bob", 90.0),
            new Students(3, "Charlie", 78.0)
        );

        System.out.println("\n print only those who got marks more than 80 using stream");
        students.stream().filter(s -> s.marks > 80).forEach(System.out::println);
        
    }
}