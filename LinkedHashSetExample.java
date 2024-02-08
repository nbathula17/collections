import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
       
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

       
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
      
        
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        
        linkedHashSet.add("Banana");

        
        System.out.println("LinkedHashSet elements after adding duplicate: " + linkedHashSet);

        
        linkedHashSet.remove("Orange");

        
        System.out.println("LinkedHashSet elements after removal: " + linkedHashSet);
    }
}
