import java.util.Scanner;

public class Sorting {

    public int sort() throws Exception {
        int size;
        int b;

        System.out.println("Wecome to Sorting System");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter the array Element:");

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter The your chooese that you want to oparation:\n");
        System.out.println("Prees 1 for Buubble\n");
        System.out.println("Press 2 for count\n");
        System.out.println("Press 3 for Selection\n");
        System.out.println("Press 4 for Insertion\n");
        System.out.println("Press othres for Return to Home\n");

        b = sc.nextInt();

        switch (b) {
            case 1:
                bubleSort(a);
                break;
            case 2:
                count(a);
                break;
            case 3:
                selection(a);
                break;
            case 4:
                Insersiton(a);
                break;
            default:

                App obj = new App();
                App.main(new String[] {});
                break;
        }

        sc.close();
        App obj = new App();
        App.main(new String[] {});
        return 0;

    }

    public int bubleSort(int[] numbers) throws InterruptedException {

        System.out.println("___________________Welcome to BubbleSort Method.________________________");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("The result of BubbleSort : ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Your Array is now Sorted.. Thanks\n");
        return 0;

    }

    public int count(int[] a) throws InterruptedException {
        int max = 0;
        System.out.println("___________________Welcome to CounSort Method.________________________");

        for (int i = 0; i <= a.length - 1; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }

        int c[] = new int[max + 1];

        for (int i = 0; i < max; i++) {

            c[i] = 0;

        }

        for (int i = 0; i < a.length; i++) {

            int temp = a[i];
            c[temp] = c[temp] + 1;

        }

        System.out.println("The result of counting sort: ");

        for (int i = 0; i <= max; i++) {

            if (c[i] != 0) {

                while (c[i] != 0) {
                    System.out.print(" " + i);
                    --c[i];
                }
            }

        }
        System.out.println("Your Array is now Sorted.. Thanks\n");

        return 0;

    }

    public int selection(int[] numbers) throws InterruptedException {

        System.out.println("___________________Welcome to SelectionSort Method.________________________");

        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("The result of Selection sort: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Your Array is now Sorted.. Thanks\n");
        return 0;

    }

    public int Insersiton(int[] numbers) throws InterruptedException {

        System.out.println("___________________Welcome to InsersitonSort Method.________________________");

        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.println("The result of Insertion sort: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Your Array is now Sorted.. Thanks\n");

        return 0;

    }

}