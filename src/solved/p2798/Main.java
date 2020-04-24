package solved.p2798;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] cardNum = new int[n];
        st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < n; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        Solution solution = new Solution();
        bw.write(String.valueOf(solution.solute(n, m, cardNum)));
        bw.flush();
        bw.close();
    }

    public static class Solution {
        private int n, m;
        private int[] cardNum;
        private int answer;

        public int solute(int n, int m, int[] cardNum) {
            this.n = n;
            this.m = m;
            this.cardNum = cardNum;
            answer = Integer.MAX_VALUE;
            bruteforce(0, 0, 0);
            return answer;
        }

        private void bruteforce(int index, int sum, int count) {
            if (answer == m) return;
            if (count == 3) {
                if (sum <= m && Math.abs(sum - m) < Math.abs(answer - m)) {
                    answer = sum;
                }
                return;
            }
            if (index == n) return;
            bruteforce(index + 1, sum, count);
            bruteforce(index + 1, sum + cardNum[index], count + 1);
        }
    }

}
