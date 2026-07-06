package demo;


import java.util.Scanner;

public class lee_movezero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int nonZeroElement = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                arr[nonZeroElement] = arr[i];
                nonZeroElement++;
            }
        }

        // Fill remaining positions with zeros
        while (nonZeroElement < n) {
            arr[nonZeroElement] = 0;
            nonZeroElement++;
        }

        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
