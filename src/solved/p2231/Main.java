package solved.p2231;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        br.close();

        int answer = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (getDivisionSum(i) == n) {
                answer = i;
                break;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static int getDivisionSum(int n) {
        int ret = n;
        while (n != 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }

}
