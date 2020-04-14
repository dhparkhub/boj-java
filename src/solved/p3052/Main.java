package solved.p3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] remainder = new boolean[42];
        Arrays.fill(remainder, false);

        int count = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int temp = num % 42;
            if (!remainder[temp]) {
                count++;
                remainder[temp] = true;
            }
        }

        System.out.println(count);
    }

}
