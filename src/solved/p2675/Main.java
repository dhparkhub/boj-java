package solved.p2675;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (p-- > 0) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int i = 0; i < s.length(); i++) {
                bw.write(new String(new char[r]).replace("\0", String.valueOf(s.charAt(i))));
            }
            bw.newLine();
        }
        bw.flush();
    }

}
