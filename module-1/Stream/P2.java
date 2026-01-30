/* Write a Java Stream one-liner to sort Students objects by id in descending order and print them. */


import java.util.ArrayList;
import java.util.List;

class Students implements Comparable<Students>{
	int id;
	String name;
	double marks;
	public Students(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Students s) {
		return this.id - s.id;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}
public class P2 {
	public static void main(String[] args) {
		
		List<Students> st = new ArrayList<Students>();
		st.add(new Students(3, "Murali", 75.5));
		st.add(new Students(4, "Aditya", 85.5));
		st.add(new Students(1, "Vishnu", 80.5));
		st.add(new Students(5, "Pramod", 90.5));
		st.add(new Students(2, "Suraj", 55.5));
        st.stream().sorted((s1, s2) -> s2.id - s1.id).forEach(System.out::println);
		
	}
}