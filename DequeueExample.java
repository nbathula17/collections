import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
    public static void main(String[] args) {
       
        Deque<String> deque = new ArrayDeque<>();

        
        deque.addFirst("Apple");
        deque.addFirst("Banana");

        
        deque.addLast("Orange");
        deque.addLast("Mango");

       
        System.out.println("Deque elements: " + deque);

        
        String firstElement = deque.pollFirst();
        System.out.println("First element of the Deque: " + firstElement);

        
        String lastElement = deque.pollLast();
        System.out.println("Last element of the Deque: " + lastElement);

        
        System.out.println("Updated Deque elements: " + deque);

        
        String peekedFirst = deque.peekFirst();
        String peekedLast = deque.peekLast();
        System.out.println("Peeked first element: " + peekedFirst);
        System.out.println("Peeked last element: " + peekedLast);

        
        System.out.println("Deque elements using for-each loop:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}
