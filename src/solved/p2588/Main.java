package solved.p2588;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = b;
        while (temp != 0) {
            System.out.println(a * (temp % 10));
            temp /= 10;
        }
        System.out.println(a * b);
    }

}
