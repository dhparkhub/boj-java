package solved.p9020;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean[] isPrime = new boolean[10001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // sieve of eratosthenes
        for (int i = 2; i * i <= 10000; i++) {
            if (!isPrime[i]) continue;
            for (int j = 2; i * j <= 10000; j++) {
                isPrime[i * j] = false;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = n / 2; j > 0; j--) {
                if (isPrime[j] && isPrime[n - j]) {
                    bw.write(String.format("%d %d", j, n - j));
                    bw.newLine();
                    break;
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
