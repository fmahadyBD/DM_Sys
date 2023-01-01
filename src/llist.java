import java.util.LinkedList;
import java.util.Scanner;

public class llist {
    public int linkedlist() {
        int a, u, u1;
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("\n\n\nWecome to The Linked list class");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The your chooese:\n");
        System.out.println("Prees 1 for Insert First\n");
        System.out.println("Press 2 for Insert posiotion\n");
        System.out.println("Press 3 for Insert last\n");
        System.out.println("Press 4 for Delete First\n");
        System.out.println("Press 5 for Delete posiotion\n");
        System.out.println("Press 6 for Delete last\n");
        System.out.println("Press 7 for Return home\n");

        a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Enter the value that you want to add:");
                u = sc.nextInt();
                list.addFirst(u);
                break;
            case 2:
                System.out.println("Enter the position:");
                System.out.println("Enter the value that you want to add:");
                u = sc.nextInt();
                u1 = sc.nextInt();
                list.add(u1, u);
                break;
            case 3:
                System.out.println("Enter the value that you want to add:");
                u = sc.nextInt();
                list.addLast(u);
                break;
            case 4:
                list.removeFirst();
                break;
            case 5:
                System.out.println("Enter the value that you want to add:");
                u = sc.nextInt();
                System.out.println("Enter the position for delete:");
                list.remove(0);
                u1 = sc.nextInt();
                break;
            case 6:
                list.removeLast();
                break;
            case 7:
                App obj = new App();
                try {
                    App.main(new String[] {});
                } catch (Exception e) {

                    e.printStackTrace();
                }

                break;

            default:

                break;
        }
        sc.close();

        return 0;

    }

}
