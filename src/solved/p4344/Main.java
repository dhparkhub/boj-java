package solved.p4344;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        while (c-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] nums = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
                sum += nums[i];
            }

            double average = (double) sum / n;
            int[] temp = Arrays.stream(nums).filter(i -> (double) i > average).toArray();

            double percentage = (double) (100 * temp.length) / nums.length;
            bw.write(String.format("%.3f", percentage) + "%");
            bw.newLine();
        }
        bw.flush();
    }

}
