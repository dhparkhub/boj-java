package solved.p1193;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int x = Integer.parseInt(st.nextToken());
        int i = 0;
        while (x > 0) {
            x -= ++i;
        }

        String answer;
        if (i % 2 == 0) {
            answer = String.format("%d/%d", x + i, 1 - x);
        } else {
            answer = String.format("%d/%d", 1 - x, x + i);
        }

        bw.write(answer);
        bw.flush();
        bw.close();
    }

}
