package published.p2447;

import java.util.Scanner;

public class Main {
    private static boolean[][] map = new boolean[6561][6561];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        solve(0, 0, n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j] ? '*' : ' ');
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }

    private static void solve(int x, int y, int n) {
        if (n == 1) {
            map[x][y] = true;
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                int mn = n / 3;
                int mx = x + i * mn;
                int my = y + j * mn;
                solve(mx, my, mn);
            }
        }
    }

}
