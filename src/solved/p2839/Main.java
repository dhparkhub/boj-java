package solved.p2839;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                k += n / 5;
                break;
            }
            n -= 3;
            k++;
        }
        bw.write(String.valueOf(n >= 0 ? k : -1));
        bw.flush();
    }

}
