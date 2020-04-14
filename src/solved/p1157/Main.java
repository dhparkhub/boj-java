package solved.p1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int[] visited = new int[26];
        Arrays.fill(visited, 0);

        int maxUsed = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = Character.toUpperCase(s.charAt(i));
            visited[temp - 'A']++;
            maxUsed = Math.max(maxUsed, visited[temp - 'A']);
        }

        char mostUsed = '?';
        for (int i = 0; i < 26; i++) {
            if (visited[i] == maxUsed) {
                if (mostUsed == '?') {
                    mostUsed = (char) (i + 'A');
                } else {
                    mostUsed = '?';
                    break;
                }
            }
        }

        System.out.println(mostUsed);
    }

}
