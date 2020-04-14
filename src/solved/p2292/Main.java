package solved.p2292;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = 1;
        int temp = 1;
        for (int i = 0; ; i++, k++) {
            if (n - (temp += 6 * i) <= 0) {
                break;
            }
        }
        bw.write(String.valueOf(k));
        bw.flush();
    }

}
