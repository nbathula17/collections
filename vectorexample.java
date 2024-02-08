import java.util.Vector;

public class vectorexample {
    public static void main(String[] args) {
       
        Vector<String> vector = new Vector<>();

       
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Mango");

        
        System.out.println("Vector elements: " + vector);

        
        System.out.println("First element: " + vector.get(0));
        System.out.println("Second element: " + vector.get(1));

        
        vector.remove("Banana");

       
        System.out.println("Updated Vector elements: " + vector);

        
        System.out.println("Vector elements using for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}
