import java.util.HashMap;
import java.util.Map;

public class hashmapP {
    public static void main(String[] args) {
        // Initial capacity 16, Load factor 0.75
        Map<Integer, String> employeeMap = new HashMap<>();

        // 1. Adding elements (put)
        // Internally: hash(101) is calculated, masked with (16-1), and stored
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");

        // 2. Overwriting a value
        // Internally: hashCode(101) is the same, .equals(101) returns true, 
        // so the old Value "Alice" is replaced by "John"
        employeeMap.put(101, "John");

        // 3. Retrieval (get) - O(1)
        System.out.println("Employee 101: " + employeeMap.get(101));

        // 4. Checking existence
        System.out.println("Contains ID 105? " + employeeMap.containsKey(105)); // O(1)
        
        // 5. Iterating through Entries
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}