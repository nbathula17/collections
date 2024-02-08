import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
       
        SortedSet<String> sortedSet = new TreeSet<>();

        
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Orange");
        sortedSet.add("Mango");

       
        System.out.println("SortedSet elements: " + sortedSet);

        
        sortedSet.add("Banana");

        
        System.out.println("SortedSet elements after adding duplicate: " + sortedSet);

        
        sortedSet.remove("Orange");

        
        System.out.println("SortedSet elements after removal: " + sortedSet);
    }
}
