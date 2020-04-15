package solved.p2581;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // sieve of eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) continue;
            for (int j = 2; i * j <= n; j++) {
                isPrime[i * j] = false;
            }
        }

        int minPrime = -1;
        int sumOfPrimes = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                minPrime = minPrime == -1 ? i : minPrime;
                sumOfPrimes += i;
            }
        }

        String answer = minPrime == -1 ? "-1" : String.format("%d\n%d", sumOfPrimes, minPrime);
        System.out.println(answer);
    }

}
