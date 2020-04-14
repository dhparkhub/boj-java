package solved.p1065;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] cache = new int[1001];
        Arrays.fill(cache, 0);

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i < 100) {
                cache[i]++;
            } else if (i < 1000) {
                int x = i % 10;
                int y = (i / 10) % 10;
                int z = i / 100;
                if (x - y == y - z) {
                    cache[i] += 1;
                }
            }
            cache[i] += cache[i-1];
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(cache[n]);
    }

}
