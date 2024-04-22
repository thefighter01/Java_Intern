import java.io.*;
import java.util.StringTokenizer;

public class Problem2 {
    private static Long sumOfArray(int [] a){
        Long ans = 0L;
        int n = a.length;
        for (int i = 0; i < n; ++i) ans+=a[i];
        return ans;
    }
    private static double calcAverage(Long up , int bot){
        assert (bot > 0);
        return (up * 1.0) / bot;
    }
    public static void solve(int tc) throws IOException{
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        Long sum = sumOfArray(a);
        double ans = calcAverage(sum , n);
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
