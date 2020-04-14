package solved.p10430;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        sb.append((a + b) % c + "\n");
        sb.append(((a % c) + (b % c)) % c + "\n");
        sb.append((a * b) % c + "\n");
        sb.append(((a % c) * (b % c)) % c);
        System.out.println(sb.toString());
    }

}
