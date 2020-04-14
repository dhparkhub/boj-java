package solved.p2884;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int nh = (m - 45 >= 0) ? h : ((h - 1) + 24) % 24;
        int nm = ((m - 45) + 60) % 60;
        System.out.println(String.format("%d %d", nh, nm));
    }

}
