package solved.p2577;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a * b * c;

        int[] numCount = new int[10];
        Arrays.fill(numCount, 0);

        while (temp != 0) {
            numCount[temp % 10]++;
            temp /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numCount[i]);
        }
    }

}
