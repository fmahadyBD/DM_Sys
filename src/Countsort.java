    import java.util.Scanner;
public class Countsort {


    public static void countsot() throws Exception {
        // int a[] = { 1,1,2,2,3,4,5,6,7,8,9,10};
        int max = 0;
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the array Element:");
        for (int i = 0; i < size; i++) {
           

            a[i] = sc.nextInt();
        }

        int j;

        int b[] = new int[size];

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

        // for (int i = 1; i < max; i++) {

        // c[i] += c[i - 1];
        // System.out.println("Here a[i]: " + c[i]);
        // }

        // for (int i = a.length-1; i >=0; i--) {
        // b[--c[a[i]]]=a[i];
        System.out.println("The result of counting sort: ");

        for (int i = 0; i <= max; i++) {

            if (c[i] != 0) {

                while (c[i] != 0) {
                    System.out.println(i);
                    --c[i];
                }
            }

        }

        sc.close();

    }

}

