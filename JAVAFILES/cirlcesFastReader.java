import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

class MATCH2 {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    
    void solve()
    {
    ///////
    int n=ni();
    int q=ni();
    int x[]=new int[n];
    int y[]=new int[n];
    int r[]=new int[n];
    
    for(int i=0;i<n;i++)
    {
    x[i]=ni();
    y[i]=ni();
    r[i]=ni();
    }
    int left[]=new int[2000005];
    int right[]=new int[2000005];
   for(int i=0;i<=2000004;i++)
   {
    left[i]=0;
    right[i]=0;
   }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {     
            int rmin=Math.min(r[i],r[j]);
            int rmax=Math.max(r[i],r[j]);
            double min=0,max=0;
            double dist=Math.sqrt(Math.pow((x[i]-x[j]),2)+Math.pow((y[i]-y[j]),2));
            if(dist+rmin<rmax)
            {
                min=rmax-dist-rmin;
            }
            else if(dist<=r[i]+r[j])
            {
                min=0;
            }
            else
            {
                min=dist-r[i]-r[j];
            }
            int min1=(int)Math.ceil(min);
            max=dist+r[i]+r[j];
            int max1=(int)Math.floor(max);
            left[min1]++;
            right[max1]++;
        }
    }
    int dp[]=new int[1000001];
    dp[0]=left[0];
    
    for(int i=1;i<=1000000;i++)
    {
        dp[i]=dp[i-1]+left[i]-right[i-1];
    }

    while(q-->0)
    {
        int k=ni();
        out.println(dp[k]);
    }
      ///////  
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
    
    public static void main(String[] args) throws Exception { new MATCH2().run(); }
    
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
