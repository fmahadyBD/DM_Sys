import java.util.*;

class Queues {

    // Structure of a Node
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else
            q.rear.link = temp;

        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }

        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.printf("\nElements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public void queue() throws Exception {
        int b, u;
        // Create a queue and initialize front and rear
        Queue q = new Queue();
        q.front = q.rear = null;

        // Inserting elements in Circular Queue
        System.out.println("Wecome to Queue System");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter The your chooese:\n");
            System.out.println("Prees 1 for Enqueue\n");
            System.out.println("Press 2 for Dequeue\n");
            System.out.println("Press 3 for Disply\n");
            System.out.println("Press 4 for Return to Home\n");

            b = sc.nextInt();

            switch (b) {
                case 1:
                    System.out.println("Enter the value for enQueue:");
                    u = sc.nextInt();
                    enQueue(q, u);
                    break;
                case 2:
                    System.out.printf("\nDeleted value = %d", deQueue(q));
                    break;
                case 3:
                    displayQueue(q);
                    break;
                case 4:
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

        }

    }
}
