package published.p1002;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int d1 = (int) (Math.pow(x1 - x2, 2) + (int) Math.pow((y1 - y2), 2));
            int d2 = (int) Math.pow(r1 + r2, 2);
            int d3 = (int) Math.pow(r1 - r2, 2);

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                bw.write("-1");
            } else if (d1 > d2) {
                bw.write("0");
            } else if (d1 == d2) {
                bw.write("1");
            } else if (d1 > d3) {
                bw.write("2");
            } else if (d1 == d3) {
                bw.write("1");
            } else if (d1 < d3) {
                bw.write("0");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
