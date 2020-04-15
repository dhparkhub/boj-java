import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        if (x[0] == x[1]) {
            x[3] = x[2];
        } else if (x[0] == x[2]) {
            x[3] = x[1];
        } else {
            x[3] = x[0];
        }
        if (y[0] == y[1]) {
            y[3] = y[2];
        } else if (y[0] == y[2]) {
            y[3] = y[1];
        } else {
            y[3] = y[0];
        }

        bw.write(String.format("%d %d", x[3], y[3]));
        bw.flush();
        bw.close();
    }

}
