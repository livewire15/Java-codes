import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.text.DecimalFormat;

public class bus_stops {

    // Complete the minimumTimeToEnd function below.
    static void minimumTimeToEnd(ArrayList<Long> x, long w, long v, int q) {
        // Take the descriptions of the people from standard input and print the answers to standard output
        for(int i=0;i<q;i++)
        {
            long p1=scanner.nextLong();
            long t1=scanner.nextLong();
            long v1=scanner.nextLong();
            long last_stop=0;
            float time=0;
            if(p1==t1)
            {
				//System.out.println(x.contains(p1));
                if(x.contains(p1))
                {
                    last_stop=x.get(x.size()-1);
                    time=(float)(last_stop-p1)/(float)v;
					//System.out.println(last_stop+" ggggg"+v);
                }
                else
                {
                    for(int j=0;j<x.size();j++)
                    {
                        long stop1=0,stop2=0;
                        if(x.get(j)>p1)
                        {
                           stop2=x.get(j);
                            //int val1=Maths.abs(stop1-p1)/v1;
                            float time1=(float)stop1/(float)v+w+(float)(last_stop-stop1)/(float)v;
                            float time2=(float)stop2/(float)v+w+(float)(last_stop-stop2)/(float)v;
                            time=(time1<time2)?time1:time2;
                            break;
                        }
                        else
                        {
                            stop1=x.get(j);
                        }
                    }
                }
            }
            else
            {
                if(p1>t1)
                {
                    if(x.contains(p1))
                    {
                        float time1=(float)(p1-t1)/(float)v+(float)(last_stop-p1)/(float)v;
                        float time2=(float)(last_stop-p1)/(float)v1+t1;
                        time=(time<time2)?time1:time2;
                    }
                    else
                    {
                    for(int j=0;j<x.size();j++)
                    {
                        long stop1=0,stop2=0;
                        if(x.get(j)>p1)
                        {
                           stop2=x.get(j);                       
                            float time1=(float)(stop1-t1)/(float)v+(float)(last_stop-stop1)/(float)v;
                            float time2=(float)(float)(stop2-t1)/(float)v+(float)(last_stop-stop2)/(float)v;
                            time=(time1<time2)?time1:time2;
                            break;
                        }
                        else
                        {
                            stop1=x.get(j);
                        }
                    }
                    }
                }
                else
                {
                    if(x.contains(p1))
                    {
                       float time1=(float)p1/(float)v+w+(float)(last_stop-p1)/(float)v;
                        float time2=(float)(last_stop-p1)/(float)v1;
                        time=(time1<time2)?time1:time2;
                    }
                    else
                    {
                     for(int j=0;j<x.size();j++)
                    {
                        long stop1=0,stop2=0;
                        if(x.get(j)>p1)
                        {
                            stop2=x.get(j);                       
                            float time1=(float)stop1/(float)v+w+(float)(last_stop-stop1)/(float)v;
                            float time2=(float)stop2/(float)v+w+(float)(last_stop-stop2)/(float)v;
                            float time3=(float)(last_stop-p1)/(float)v1;
                            time=(time1<time2)?time1:time2;
                            if(time>time3)
                                time=time3;
                            break;
                        }
                        else
                        {
                            stop1=x.get(j);
                        }
                    }   
                    }
                }
                
            }
            DecimalFormat df=new DecimalFormat("0.0000000000");
           System.out.println(df.format(time));
            
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<Long> al=new ArrayList<>();

        String[] xItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int xItr = 0; xItr < n; xItr++) {
            long xItem = Long.parseLong(xItems[xItr]);
            al.add(xItem);
        }

        String[] wv = scanner.nextLine().split(" ");

        long w = Long.parseLong(wv[0]);

        long v = Long.parseLong(wv[1]);

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        minimumTimeToEnd(al, w, v, q);

        scanner.close();
    }
}
