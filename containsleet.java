package demo;

import java.util.Scanner;
import java.util.HashSet;

public class containsleet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int i = 0; i < n; i++) {

            int roll = sc.nextInt();

            if (set.contains(roll)) {
                duplicate = true;
                break;
            } else {
                set.add(roll);
            }
        }

        System.out.println(duplicate);

        sc.close();
    }
}