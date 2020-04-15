package published.p2775;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        Solution solution = Solution.getInstance();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(solution.getPeople(k, n)));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static class Solution {
        private static Solution instance;
        private final int[][] cache;

        private Solution() {
            cache = new int[15][15];
        }

        public static Solution getInstance() {
            if (instance == null) {
                instance = new Solution();
            }
            return instance;
        }

        public int getPeople(int k, int n) {
            if (n == 0) return 0;
            if (k == 0) return n;
            if (cache[k][n] > 0) return cache[k][n];
            return cache[k][n] = getPeople(k - 1, n) + getPeople(k, n - 1);
        }
    }

}
