// WAJP to print objects that ends with "sh" from the names list using forEach.

import java.util.ArrayList;
import java.util.List;

// public class P2 {
//     public static void main(String[] args) {
//         List<String> names = new ArrayList<>();
//         names.add("Aditya");
//         names.add("Devansh");
//         names.add("Vishnu");
//         names.add("Animesh");
//         names.add("Mohit");
//         names.add("Pawan");
//         names.add("Nitish");
//         names.add("Kabir");

//         names.forEach(name -> {
//             if(name.endsWith("sh"))
//                 System.out.println(name);
//         });

//     }
// }


// WAJP to print only even objects from the numbers list using forEach.
// public class P2 {
//     public static void main(String[] args) {
//         List<Integer> nums = new ArrayList<>();
//         nums.add(10);
//         nums.add(15);
//         nums.add(20);
//         nums.add(25);
//         nums.add(30);

//         nums.forEach(num -> {
//             if(num %2 ==0){
//                 System.out.println(num);
//             }
//         });
//     }
// }

//WAJP to print list of students having marks greater than 85 using forEach.
public class P2 {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(1, "Alice", 85.5));
        students.add(new Students(2, "Bob", 90.0));
        students.add(new Students(3, "Charlie", 78.0));
        students.add(new Students(4, "David", 92.5));
        students.add(new Students(5, "Eve", 88.0));

        students.forEach(student -> {
            if(student.marks > 85){
                System.out.println(student);
            }
        });
    }
}
