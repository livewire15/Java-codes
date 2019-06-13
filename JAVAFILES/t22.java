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
    
    void solve()
    {
        //Start code
        //use ni for int,long,na for int array,ns for string. 
         int t=ni();
        while(t-->0)
        {
            int n=ni();
            int k=ni();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=ni();
            } 
            long num[]=new long[n];
            for(int i=0;i<n;i++)
            {
                num[i]=fastModulo(k,arr[i]);
            }
            //Arrays.sort(num);
            HashMap<Long,Integer> map=new HashMap<Long,Integer>();
            for(int i=0;i<n;i++)
            {
            map.put(num[i],i);
            }
            int position[]=new int[n];
            position[0]=map.get(num[0]);//get index and stored in position array.
        for(int i=1;i<n;i++)
        {
            position[i]=Math.max(position[i-1],map.get(num[i]));//If index of previous element is greater then all the elements till that
            //index cannot be partitioned.
        }

            long sum[]=new long[n];
            sum[0]=num[0];
            for(int i=1;i<n;i++)
            {
                sum[i]=sum[i-1]+num[i];
            }

int ans=0;
long max=0;
for(int i=0;i<n;i++)
        {
            if(position[i]==i)//means no further occurence of this element is present, then we can partition here.
            {
                long prod=(sum[n-1]-sum[i])*sum[i];
                if(prod>max)
                {
                    max=prod;
                    ans=i+1;
                }
            }
        }
        out.println(ans);
    }
}

static long fastModulo(int a,int b)
{
    if(b==0)
        return 1;
    if(b%2==0) //when even
        return fastModulo((a*a),b/2);
    else //when odd
        return ((a)*fastModulo((a*a),b/2));
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
