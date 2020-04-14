package published.p1065;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (isHanSoo(i)) {
                k++;
            }
        }
        bw.write(String.valueOf(k));
        bw.flush();
    }

    private static boolean isHanSoo(int n) {
        if (n < 100) {
            return true;
        } else if (n < 1000) {
            int x = n % 10;
            int y = (n / 10) % 10;
            int z = n / 100;
            if (x - y == y - z) {
                return true;
            }
        }
        return false;
    }

}
