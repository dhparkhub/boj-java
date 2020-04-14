package solved.p2941;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i >= 2) {
                String temp = s.substring(i, i + 2);
                if (temp.equals("c=")) {
                    i++;
                } else if (temp.equals("c-")) {
                    i++;
                } else if (temp.equals("d-")) {
                    i++;
                } else if (temp.equals("lj")) {
                    i++;
                } else if (temp.equals("nj")) {
                    i++;
                } else if (temp.equals("s=")) {
                    i++;
                } else if (temp.equals("z=")) {
                    i++;
                }
            }
            if (s.length() - i >= 3) {
                String temp = s.substring(i, i + 3);
                if (temp.equals("dz=")) {
                    i += 2;
                }
            }
            count++;
        }
        System.out.println(count);
    }

}
