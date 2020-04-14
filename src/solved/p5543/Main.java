package solved.p5543;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minCostHb = 2000;
        for (int i = 0; i < 3; i++) {
            int temp = sc.nextInt();
            minCostHb = Math.min(minCostHb, temp);
        }
        int minCostCk = 2000;
        for (int i = 0; i < 2; i++) {
            int temp = sc.nextInt();
            minCostCk = Math.min(minCostCk, temp);
        }
        sc.close();
        System.out.println(minCostHb + minCostCk - 50);
    }

}
