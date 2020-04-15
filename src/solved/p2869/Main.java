package solved.p2869;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        br.close();

        int answer = (v - a) / (a - b);
        if ((v - a) % (a - b) > 0) {
            answer++;
        }

        bw.write(String.valueOf(answer + 1));
        bw.flush();
        bw.close();
    }

}
