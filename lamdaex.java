import java.util.ArrayList;
import java.util.List;

public class lamdaex {
    public static void main(String[] args) {
       
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("List of Fruits: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

        
        fruits.removeIf(fruit -> fruit.equals("Banana"));

        System.out.println("Updated List of Fruits: " + fruits);

        System.out.println("Fruits using lambda expression:");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}


