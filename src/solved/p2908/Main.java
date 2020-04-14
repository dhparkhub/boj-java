package solved.p2908;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        System.out.println(a.compareTo(b) > 0 ? a : b);
    }

}
