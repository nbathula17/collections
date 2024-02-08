import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();

        
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Mango");

        
        System.out.println("Stack elements: " + stack);

        
        System.out.println("Top element: " + stack.peek());

        
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

       
        System.out.println("Updated Stack elements: " + stack);

        
        System.out.println("Stack elements using while loop:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
