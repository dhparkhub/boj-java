package solved.p2562;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            if (temp > maxValue) {
                maxValue = temp;
                maxIndex = i;
            }
        }

        System.out.println(String.format("%d\n%d", maxValue, maxIndex));
    }

}
