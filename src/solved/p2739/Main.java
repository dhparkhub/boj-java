package solved.p2739;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 9; i++) {
            System.out.println(String.format("%d * %d = %d", n, i, n * i));
        }
    }

}