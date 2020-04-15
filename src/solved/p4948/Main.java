package solved.p4948;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean[] isPrime = new boolean[246913];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // sieve of eratosthenes
        for (int i = 2; i * i <= 246913; i++) {
            if (!isPrime[i]) continue;
            for (int j = 2; i * j <= 246913; j++) {
                isPrime[i * j] = false;
            }
        }

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n;
        while ((n = sc.nextInt()) != 0) {
            int count = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        sc.close();
        System.out.println(sb.toString());
    }

}
