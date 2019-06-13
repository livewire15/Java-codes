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

class MATCH2 {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    
    void solve()
    {
        //Start code
        //use ni for int,long,na for int array,ns for string.  
        int n=ni();
        int m=ni();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            String ss=ns();
            for(int j=0;j<m;j++)
            {
                a[i][j]=Character.getNumericValue(ss.charAt(j));
            }
        }
        int sm=0;
        if(n>m)
        {
            sm=m;
        }
        else
        {
            sm=n;
        }
        int st=2;int ansti=0,anstj=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                while(help(a,i,j,i+st,j+st,n,m))
                {
                    ansti=i;
                    anstj=j;
                    st++;
                }
            }
        }
        st--;
        int arr[]=new int[sm+1];
        Arrays.fill(arr,0);
        while(st<sm)
        {
            int ul=Integer.MAX_VALUE,ur=Integer.MAX_VALUE,ll=Integer.MAX_VALUE,lr=Integer.MAX_VALUE;
            if(ansti>0 && anstj>0)
            {
                ul=0;
                int r=ansti,j=anstj;
                for(int i1=j;i1<j+st;i1++)
                {
                    if(a[r-1][i1]==a[r][i1])
                        ul++;
                }
                if(a[r][j-1]==a[r][j])
                    ul++;
                if(a[r-1][j-1]!=a[r][j])
                    ul++;
            }

            if(ansti>0 && anstj+st<=m)
            {
                ur=0;
                int r=ansti,j=anstj;
                for(int i1=j;i1<j+st;i1++)
                {
                    if(a[r-1][i1]==a[r][i1])
                        ur++;
                }
                if(a[r][j+st-1]==a[r][j+st])
                    ur++;
                if(a[r][j+st-1]!=a[r-1][j+st])
                    ur++;
            }
            if(ansti+st<=n && anstj>0)
            {
                ll=0;
                int r=ansti+st-1,j=anstj;
                for(int i1=j;i1<j+st;j++)
                {
                    if(a[r][i1]==a[r+1][i1])
                        ll++;
                }
                if(a[r][j]==a[r][j-1])
                    ll++;
                if(a[r][j]!=a[r+1][j-1])
                    ll++;
            }
            if(ansti+st<=n && anstj+st<=m)
            {
                lr=0;
                int r=ansti+st-1,j=anstj;
                for(int i1=j;i1<j+st;j++)
                {
                    if(a[r][i1]==a[r+1][i1])
                        lr++;
                }
                if(a[r][j+st]==a[r][j+st-1])
                    lr++;
                if(a[r][j+st-1]!=a[r+1][j+st])
                    lr++;
            }
            ArrayList<Pair> al=new ArrayList<>();
            al.add(new Pair(ul,1));
            al.add(new Pair(ur,2));
            al.add(new Pair(ll,3));
            al.add(new Pair(lr,4));
            Collections.sort(al,new Mycomparator());
            Pair p=al.get(0);
            if(p.val2==1){
                anstj--;
                ansti--;
            }
            else if(p.val2==2){
                ansti--;
            }else if(p.val2==3){
                anstj--;
            }
            st++;
            arr[st]=p.val1+arr[st-1];
        }
        int q=ni();
        while(q!=0)
        {
             int query=ni();
             int index=upperBound(arr,arr.length-1,query);
             out.println(arr[index-1]);
             q--;
        }
    }
    public static int upperBound(int[] array, int length, int value) {
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
        if(low!=0)
        {
            if(array[low-1]==value)
            {
                low=low-1;
            }
        }
        return low;
    }
    boolean help(int a[][],int i,int j,int endi,int endj,int n,int m)
    {
        if(endi>=n || endj>=m)
            return false;
        for(int i1=i;i1<endi-1;i1++)
        {
            for(int j1=j;j1<endj-1;j1++)
            {
                if(a[i1][j1]!=a[i1+1][j1] && a[i1][j1]!=a[i1][j1+1])
                    continue;
                return false; 
            }
        }
        if(a[endi-1][endj-1]!=a[endi-2][endj-1])
            return true;
        return false;
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

class Pair
{
    int val1,val2;
    Pair(int val1,int val2)
    {
        this.val1=val1;
        this.val2=val2;
    }
}

class Mycomparator implements Comparator<Pair>
{
    public int compare(Pair a,Pair b)
    {
        return a.val1-b.val1;
    }
}
