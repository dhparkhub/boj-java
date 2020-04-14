package solved.p1110;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int temp = n;
        int count = 1;
        while ((temp = cycle(temp)) != n) {
            count++;
        }

        System.out.println(count);
    }

    private static int cycle(int n) {
        int x = n % 10;
        int y = ((n / 10) + (n % 10)) % 10;
        return 10 * x + y;
    }

}
