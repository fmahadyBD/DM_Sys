import java.util.LinkedList;
import java.util.Scanner;

public class llist {
    public int linkedlist() {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
          System.out.println("Enter 1 command for insertion frist: ");
          System.out.println("Enter 2 command for insertion Last: ");
          System.out.println("Enter 3 command for insertion Position: ");
          System.out.println("Enter 4 command for Detetion frist: ");
          System.out.println("Enter 5 command for Detetion Last: ");
          System.out.println("Enter 6 command for Detetion Position: ");
          System.out.println("Enter 7 command for Disply: ");
          System.out.println("Enter 8 command for Return Home: ");

         int command = scanner.nextInt();
    
          if (command==1) {
            System.out.println("Enter an integer: ");
            int n = scanner.nextInt();
            list.addFirst(n);
          } else if (command==2) {
            System.out.println("Enter an integer: ");
            int n = scanner.nextInt();
            list.addLast(n);
          } else if (command==3) {
            System.out.println("Enter a position: ");
            int index = scanner.nextInt();
            System.out.println("Enter an integer: ");
            int n = scanner.nextInt();
            list.add(index, n);
          } else if (command==4) {
            list.removeFirst();
          } else if (command==5) {
            list.removeLast();
          } else if (command==6) {
            System.out.println("Enter a position: ");
            int index = scanner.nextInt();
            list.remove(index);
          } else if (command==7) {
            System.out.println(list);
          } else if (command==8) {
            App obj=new App();
            try {
                App.main(new String[]{});
            } catch (Exception e) {
           
                e.printStackTrace();
            }
            break;
          } else {
            System.out.println("Invalid command");
          }
        }
    
        scanner.close();
        return 0;
      }

}
