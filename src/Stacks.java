import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    /**
     * @return
     * @throws Exception
     */
    public int stack() throws Exception {
        int a, u;
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value you want to push");

       for(;;){
            System.out.println("Enter The your chooese:\n");
            System.out.println("Prees 1 for Push\n");
            System.out.println("Press 2 for Pop\n");
            System.out.println("Press 3 for Disply\n");
            System.out.println("Press 4 for Return Home\n");

            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Push a value:\n");
                    a = sc.nextInt();
                    stack.push(a);
                    break;
                case 2:
                    int element = extracted(stack);
                    System.out.println("Popped element: " + element);
                    break;
                case 3:
                    System.out.println("Stack: " + stack);
                    break;
                case 4:
                App obj=new App();
                App.main(new String[]{});
                    break;
                default:
                    break;
            }
        }
       // sc.close();

    }

    private Integer extracted(Stack<Integer> stack) {
        return stack.pop();
    }
}
