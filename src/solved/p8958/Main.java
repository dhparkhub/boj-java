package solved.p8958;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String input = sc.next();
            int total = 0;
            int score = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'O') {
                    total += ++score;
                } else {
                    score = 0;
                }
            }
            sb.append(total + "\n");
        }

        sc.close();
        System.out.println(sb.toString());
    }

}
