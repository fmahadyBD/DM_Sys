import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        int a;
        System.out.println("\n\n\nWecome to The Data Structure project");
        System.out.println("Name of Developer:Mahady Hasan Fahim");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter The your chooese:\n");
            System.out.println("Prees 1 for Sorting\n");
            System.out.println("Press 2 for Searching\n");
            System.out.println("Press 3 for stack\n");
            System.out.println("Press 4 for Queue\n");
            System.out.println("Press 5 for LinkedList\n");
            System.out.println("Press 6 for Tree\n");

            a = sc.nextInt();

            switch (a) {
                case 1:

                    Sorting ObjectSort = new Sorting();
                    ObjectSort.sort();
                    break;
                case 2:
                    Search Objectsearch = new Search();
                    Objectsearch.search();
                    break;
                case 3:

                    Stack objectctStack = new Stack();
                    objectctStack.stack();

                    break;
                case 4:
                    Queue objQueue = new Queue();
                    objQueue.queue();
                    break;
                case 5:
                    LinkedList obLinkedList = new LinkedList();
                    obLinkedList.linkedlist();
                    break;
                case 6:

                    break;
                case 7:

                    break;

                default:

                    break;
            }
            sc.close();

        }
    }
}
