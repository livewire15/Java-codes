import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

 class cj {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Rishit obj = new Rishit();
        obj.calc(1, in, out);
        out.close();
    }
 }
 
     class Rishit
	{
		public void calc(int testNumber, FastReader in, PrintWriter out)
			{
				int t=in.nextInt();
for(int j=1;j<=t;j++)
{
int n=in.nextInt();
long rf[]=new long[n];
long arr[]=in.nextllArray(n);
for(int h=0;h<n;h++)
	rf[h]=arr[h];
Arrays.sort(rf);
int n1=0,n2=0;
if(n%2==0)
{
n1=n/2; //odd
n2=n/2; //even
}
else
{
n1=n/2; //odd
n2=n/2+1; //even
}
long arr1[]=new long[n1];//odd
long arr2[]=new long[n2];//even

int k1=0,k2=0;
for(int i=0;i<n;i++)
{
if(i%2==0)
{
arr2[k2++]=arr[i];
}
else
{
arr1[k1++]=arr[i];
}
}
Arrays.sort(arr1);
Arrays.sort(arr2);
k1=0;
k2=0;
for(int m=0;m<n;m++)
{
if(m%2==0)
{
arr[m]=arr2[k1++];
}
else
{
arr[m]=arr1[k2++];
}
}
int flag=0,pos=0;
for(int h=0;h<n;h++)
{
	if(rf[h]!=arr[h])
	{
			flag=1;
			pos=h;
			break;
	}
}
if(flag==0)
out.println("Case #"+j+":"+" "+"OK");
else
out.println("Case #"+j+":"+" "+pos);
}
		}
	}
    
 
     class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
 
        public FastReader(InputStream stream) {
            this.stream = stream;
        }
 
        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
 
        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

	public String next() {
            return nextString();
        }
	
	 public String nextString() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = pread();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        public long nextLong() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public long[] nextllArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLong();
            }
            return array;
        }
 
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
