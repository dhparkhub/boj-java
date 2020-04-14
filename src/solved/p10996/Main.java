package solved.p10996;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 * n; i++) {
            int temp = i % 2;
            for (int j = 0; j < n; j++) {
                if (j % 2 == temp) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

}
