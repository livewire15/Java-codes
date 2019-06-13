import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.*;

/**
author Livewire
//
using fatsreader
**/

class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    public static long mod=1000000007;
    public static long fac[]=new long[100001];

    void solve()
    {
        //Start code
        //use ni for int,long,na for int array,ns for string.
        fac[0]=1;
         for(int i=1;i<=100000;i++)
        {
            fac[i]=(fac[i-1]*(long)i)%mod;
        } 
        int t=ni();
        while(t-->0)
        {
            int n=ni();
            long p=ni();
            int k=ni();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=ni();
            }
            Arrays.sort(arr);
            long count=0;
            for(int i=0;i<n;i++)
            {
                long val=arr[i]*p;
                int idx=upperBound(arr,arr.length,val);
                idx=idx-1;

                    if(idx-i+1<k)
                        continue;
                    else
                    {
                        //out.println("idx "+(idx));
                        long temp=nCrModPFermat(idx-i,k-1,mod);
                        //out.println("temp "+temp);
                        count=count+temp%mod;
                        count=count%mod;
                    }
            }
            out.println(count);
        }
    }

public static int upperBound(int[] array, int length, long value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
  
  static long power(long x, long y, long p) 
    {  
        long res = 1; 
        x = x % p;      
        while (y > 0) 
        { 
            if (y % 2 == 1) 
                res = (res * x) % p; 
            y = y >> 1;
            x = (x * x) % p; 
        } 
        return res; 
    } 
    static long modInverse(long n, long p) 
    { 
        return power(n, p-2, p); 
    } 
    static long nCrModPFermat(long n, long r, long p) 
    { 
        if (r == 0) 
            return 1; 
        return (fac[(int)n]* modInverse(fac[(int)r], p) % p * modInverse(fac[(int)(n-r)], p) % p) % p; 
    }

    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
}
