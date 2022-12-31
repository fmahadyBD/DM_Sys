
import java.util.Stack;
public class Stacks {
    public  void stack() {
        Stack<Integer> stack = new Stack<>();

        // push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // display the stack
        System.out.println("Stack: " + stack);

        // pop an element from the stack
        int element = stack.pop();
        System.out.println("Popped element: " + element);

        // display the stack
        System.out.println("Stack: " + stack);
    }
}
