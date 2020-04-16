import java.util.Scanner;

public class Main {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println((int) Math.pow(2, n) - 1);
        hanoi(n, 1, 2, 3);
        System.out.println(sb.toString());
    }

    public static void hanoi(int n, int s, int m, int e) {
        if (n == 1) {
            sb.append(String.format("%d %d", s, e)).append("\n");
            return;
        }
        hanoi(n - 1, s, e, m);
        sb.append(String.format("%d %d", s, e)).append("\n");
        hanoi(n - 1, m, s, e);
    }

}
