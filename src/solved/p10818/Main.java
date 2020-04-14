package solved.p10818;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int min = 1000000;
        int max = 1;

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }

        System.out.println(String.format("%d %d", min, max));
    }

}
