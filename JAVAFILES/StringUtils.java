    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import org.apache.commons.lang3.StringUtils;
 class StringUtils {
	
	public static String[] warehouseScalability(String[] input1,String[] input2)
    {
	//Write code here
	int rep=input2.length;
	int pos,pos2;
	int time[]=new int[input1.length];
	String final1[]=new String[input1.length];
	String output1[]=new String[input1.length];
	Arrays.fill(time,0);
	while(rep>0)
	{
	for(int i=0;i<input1.length;i++)
	{
	int max=0,min=100000,mintime=10000000;
	String a1=input1[i].substring(0,StringUtils.ordinalIndexOf(input1[i],"#",1));
	String a2=input1[i].substring(StringUtils.ordinalIndexOf(input1[i],"#",1)+1,input1[i].length());
	for(int j=0;j<input2.length;j++)
	{
	String b1=input2[j].substring(0,StringUtils.ordinalIndexOf(input2[i],"#",1));
	String b2=input2[j].substring(StringUtils.ordinalIndexOf(input2[i],"#",1)+1,StringUtils.ordinalIndexOf(input2[i],"#",2));
	String b3=input2[j].substring(StringUtils.ordinalIndexOf(input2[i],"#",2)+1,StringUtils.ordinalIndexOf(input2[i],"#",3));
	String b4=input2[j].substring(StringUtils.ordinalIndexOf(input2[i],"#",1)+1,input2[j].length());
	
	if(a2==b1)
	{
	if(Integer.parseInt(b2)>max)
	{
	max=Integer.parseInt(b2);
	pos=j;
	}
	else if(Integer.parseInt(b2)<max)
	{
	;
	}
	else
	{
	if(Integer.parseInt(b3)<min)
	{
	min=Integer.parseInt(b3);
	pos=j;
	}
	}
	}
	}

	if(rep<=(rep-input1.length))
	{
	for(int k=0;k<input1.length;k++)
	{
	if(a2==input1[k].substring(input1[k].indexOf('#')+1,input1[k].length()))
	{
	if(time[k]<mintime)
	{
		mintime=time[k];
	pos2=k;
	}
	}
	}
	}
	else
		pos2=i;
	
	time[pos2]=time[pos2]+(int)input2[pos].substring(StringUtils.ordinalIndexOf(input2[pos],"#",2)+1,StringUtils.ordinalIndexOf(input2[pos],"#",3));
	final1[pos2]+="#"+input2[pos].substring(input2[pos].lastIndexOf('#')+1,input2[pos].length());
	input2[pos]=" ";
	rep--;
	}
	}
	for(int x=0;x<final1.length;x++)
	{
		String a1=input1[x].substring(0,StringUtils.ordinalIndexOf(input1[x],"#",1));
		output1[x]=a1+final1[x];
	}
	return output1;
	}
	
	
	 public static void main(String[] args) throws IOException
	 {
        Scanner in = new Scanner(System.in);
        String[] output = null;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        String[] ip1 = new String[ip1_size];
        String ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            try {
        ip1_item = in.nextLine();
            } catch (Exception e) {
        ip1_item = null;
            }
            ip1[ip1_i] = ip1_item;
        }
        int ip2_size = 0;
        ip2_size = Integer.parseInt(in.nextLine().trim());
        String[] ip2 = new String[ip2_size];
        String ip2_item;
        for(int ip2_i = 0; ip2_i < ip2_size; ip2_i++) {
            try {
        ip2_item = in.nextLine();
            } catch (Exception e) {
        ip2_item = null;
            }
            ip2[ip2_i] = ip2_item;
        }
		output = warehouseScalability(ip1,ip2);
        for(int output_i=0; output_i < output.length; output_i++) {
            System.out.println(String.valueOf(output[output_i]));
        }
    }
}

    
