import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrograms {

    public static void main(String[] args) {

        // HashMap example
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Dhananjay");
        students.put(102, "Ashwini");
        students.put(103, "Ashish");

        System.out.println("HashMap:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        // Get value using key
        System.out.println("Student 101: "
                + students.get(101));

        // Check key
        System.out.println("Contains key 102: "
                + students.containsKey(102));

        // Remove entry
        students.remove(103);

        System.out.println("After removing 103: "
                + students);


        // TreeMap example
        TreeMap<Integer, String> sortedStudents =
                new TreeMap<>();

        sortedStudents.put(103, "Ashish");
        sortedStudents.put(101, "Dhananjay");
        sortedStudents.put(102, "Ashwini");

        System.out.println("\nTreeMap:");

        for (Map.Entry<Integer, String> entry
                : sortedStudents.entrySet()) {

            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}