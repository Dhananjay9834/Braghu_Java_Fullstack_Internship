
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Dhananjay");
        students.add("Pratik");
        students.add("Deepak");
        students.add("Krushna");

        System.out.println("Students: " + students);

        students.remove("Dhananjay");

        System.out.println("After removing: " + students);

        System.out.println("First student: " + students.get(0));

        System.out.println("Total students: " + students.size());
    }
}