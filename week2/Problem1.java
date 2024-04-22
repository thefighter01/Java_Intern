import mahmoud.javatasks.task2;

import java.io.*;
import java.util.StringTokenizer;

public class Problem1 {
    static Long INF = 1_000_000_000_000_000_000L;


    public static void solve(int tc) throws IOException{
        int n = sc.nextInt();
        int neededNumber = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < n; ++i){
            if (a[i] == neededNumber && i > 4){
                ans = i; break;
            }
        }
        pw.println(ans);
        pw.flush();


    }
    public static void main(String[] args) throws IOException {
        int tt ,tc; tc = 0; tt = 1;
        //tt = sc.nextInt();
        while(tt-- > 0) solve(++tc);
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
    static Scanner sc = new Scanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
}

