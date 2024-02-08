import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

       
        System.out.println("Set of Fruits: " + fruits);

        System.out.println("Accessing elements in a Set: Sets do not have indices.");

        
        fruits.remove("Banana");

        
        System.out.println("Updated Set of Fruits: " + fruits);

        
        System.out.println("Fruits using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
