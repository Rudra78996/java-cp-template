import java.io.*;
import java.util.*;

public class Main{
    /*
     * RUDRA PRATAP SINGH
     */
    static long lMAX = Long.MAX_VALUE;
    static int intMAX = Integer.MAX_VALUE;
    static int intMIN = Integer.MIN_VALUE;
    static long lMIN = Long.MIN_VALUE;
    static final long MOD = 1_000_000_007;

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static long lcm(int a, int b) {
        return (long) a * (b / gcd(a, b));
    }

    public static long modPow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    public static int binarySearch(int[] arr, int key) { 
        int low = 0, high = arr.length - 1; 
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1; 
            else high = mid - 1; 
        } 
        return -1; 
    }
    public static int lowerBound(int[] arr, int key) { 
        int low = 0, high = arr.length; 
        while (low < high) { 
            int mid = (low + high) / 2; 
            if (arr[mid] < key) low = mid + 1; 
            else high = mid; 
        } 
        return low; 
    }
    public static int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length; 
        while (low < high) { 
            int mid = (low + high) / 2;
            if (arr[mid] <= key) low = mid + 1;
            else high = mid; 
        }
        return low; 
    }
    static class FastReader {BufferedReader br;StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
    
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    
        double nextDouble() {
            return Double.parseDouble(next());
        }
    
        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
        int[] array(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = nextInt();
            return arr;
        }
       
        long[] arrayLong(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = nextLong();
            return arr;
        }
        int[][] array2D(int r, int c){
            int arr[][] = new int[r][c];
            for(int i=0; i<r; i++) arr[i] = array(c);
            return arr;
        }
    }
    
    static class FastWriter{
        private final BufferedWriter bw;
        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        public void print(Object object) throws IOException {
            bw.append("" + object);
        }
        public void println(Object object) throws IOException{
            print(object);bw.append("\n");
        }
        public void printArray(int arr[]) throws IOException{
            StringBuilder sb = new StringBuilder("");for(int i=0;i<arr.length;i++) {    sb.append((arr[i])+" ");}println(sb.toString());
        }
        public void printLongArray(long arr[]) throws IOException{
            StringBuilder sb = new StringBuilder("");for(int i=0;i<arr.length;i++) {    sb.append(arr[i]+" ");}println(sb.toString());
        }
        public void print2DArray(int arr[][]) throws IOException{
            for(int i=0;i<arr.length;i++) {for(int j=0;j<arr[0].length;j++) { print((arr[i][j]+" ")); } println("");}
        }
        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while (t-- > 0) {
            solve(in, out);
        }
        out.close();
    }
    // X=============================CODE===============================X //
    
    public static void solve(FastReader sc, FastWriter out) throws Exception {
        
    }
}