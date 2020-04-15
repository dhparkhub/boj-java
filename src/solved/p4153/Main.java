package solved.p4153;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[3];
            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());
            if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
                break;
            }
            Arrays.sort(nums);
            if ((int) Math.pow(nums[0], 2) + (int) Math.pow(nums[1], 2) == (int) Math.pow(nums[2], 2)) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
