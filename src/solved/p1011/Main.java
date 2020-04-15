package solved.p1011;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(getMinMove(y - x)));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static int getMinMove(int n) {
        int temp = (int) Math.sqrt(n);
        if (temp == Math.sqrt(n)) {
            return temp * 2 - 1;
        } else if (n <= (int) Math.pow(temp, 2) + temp) {
            return temp * 2;
        }
        return temp * 2 + 1;
    }

}
