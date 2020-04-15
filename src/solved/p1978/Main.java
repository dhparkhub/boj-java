import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();

        Solution solution = Solution.getInstance();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (solution.isPrime(temp)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static class Solution {
        private static Solution instance;
        private final boolean[] cache;

        private Solution() {
            cache = new boolean[1001];
            Arrays.fill(cache, true);
            cache[0] = cache[1] = false;
            // sieve of eratosthenes
            for (int i = 2; i * i <= 1000; i++) {
                if (!cache[i]) continue;
                for (int j = 2; j <= 1000 / i; j++) {
                    cache[i * j] = false;
                }
            }
        }

        public static Solution getInstance() {
            if (instance == null) {
                instance = new Solution();
            }
            return instance;
        }

        public boolean isPrime(int n) {
            return cache[n];
        }
    }

}
