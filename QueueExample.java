import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Mango");

       
        System.out.println("Queue elements: " + queue);

        
        String head = queue.poll();
        System.out.println("Head of the Queue: " + head);

       
        System.out.println("Updated Queue elements: " + queue);

        
        String peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);

       
        System.out.println("Queue elements using for-each loop:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
