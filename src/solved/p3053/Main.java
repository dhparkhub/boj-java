package solved.p3053;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        System.out.println(r * r * Math.PI);
        System.out.println(2 * Math.pow(r, 2));
    }

}
