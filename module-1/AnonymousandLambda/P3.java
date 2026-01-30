import java.util.List;

class Emp{
    int id;
    String name;
    double salary;
    public Emp(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
public class P3 {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
            new Emp(1, "Aditya", 50000),
            new Emp(2, "Vishnu", 60000),
            new Emp(3, "Devansh", 55000)
        );

        System.out.println("-- Employee Details --");
        employees.forEach(emp -> emp.printDetails());

        System.out.println("\n-- Using Method Reference --");
        employees.forEach(Emp::printDetails);
    }
}
