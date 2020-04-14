package solved.p1316;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 0;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            boolean[] visited = new boolean[26];
            Arrays.fill(visited, false);

            boolean groupWord = true;
            for (int i = 0; i < s.length(); i++) {
                while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
                if (visited[s.charAt(i) - 'a']) {
                    groupWord = false;
                    break;
                }
                visited[s.charAt(i) - 'a'] = true;
            }

            count = groupWord ? count + 1 : count;
        }

        System.out.println(count);
    }

}
