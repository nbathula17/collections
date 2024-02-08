import java.util.LinkedList;
import java.util.List;

public class linkedexample {
    public static void main(String[] args) {
       
        List<String> fruits = new LinkedList<>();

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        
        System.out.println("List of Fruits: " + fruits);

        
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

        
        fruits.remove("Banana");

            System.out.println("Updated List of Fruits: " + fruits);

        
        System.out.println("Fruits using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
