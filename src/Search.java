import java.util.Scanner;

public class Search {

    int target;

    public void search() throws Exception {
        int size;
        int b;

        System.out.println("Wecome to Sorting System");
        Scanner sc = new Scanner(System.in);
        System.out.println("Wecome to Sorting System");

        System.out.println("Enter the array size: ");
        size = sc.nextInt();
        int a[] = new int[size];

        while (true) {
            System.out.println("Enter The your chooese:\n");
            System.out.println("Prees 1 for Liniar\n");
            System.out.println("Press 2 for Bainarary\n");
            System.out.println("Press 3 for Return to Home\n");
            b = sc.nextInt();

            System.out.println("Enter your target Value:\n");
            target = sc.nextInt();

            switch (b) {
                case 1:
                    Liniar(a);

                    break;
                case 2:
                    Bainarary(a);
                    break;
                case 3:
                    App obj = new App();
                    App.main(new String[] {});
                    break;

                default:

                    break;
            }
            sc.close();

        }

    }

    public int Liniar(int[] numbers) {

        System.out.println("___________________Welcome to Liniar Search Method.________________________");

        int index = -1; // index of the target element
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }

        return 0;

    }

    public int Bainarary(int[] numbers) {
        System.out.println("___________________Welcome to Bainarary Search Method.________________________");

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target) {
                System.out.println("Element found at index " + mid);
                break;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low > high) {
            System.out.println("Element not found");
        }

        return 0;

    }

}
