package published.p2446;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            int temp = 2 * (n - i) - 1;
            for (int j = 0; j < temp; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            int temp = 2 * (n - i) - 1;
            for (int j = 0; j < temp; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

}
