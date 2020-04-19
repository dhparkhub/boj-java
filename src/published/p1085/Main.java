package published.p1085;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        br.close();

        int dist1 = Math.min(x, w - x);
        int dist2 = Math.min(y, h - y);
        bw.write(String.valueOf(Math.min(dist1, dist2)));
        bw.flush();
        bw.close();
    }

}
