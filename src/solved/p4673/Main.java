package solved.p4673;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean[] visited = new boolean[10000];
        Arrays.fill(visited, false);

        for (int i = 1; i < 10000; i++) {
            int temp = d(i);
            visited[temp] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<10000; i++) {
            if (!visited[i]) {
                sb.append(String.format("%d\n", i));
            }
        }

        System.out.println(sb.toString());
    }

    private static int d(int n) {
        int ret = n;
        while (n != 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret < 10000 ? ret : 0;
    }

}
