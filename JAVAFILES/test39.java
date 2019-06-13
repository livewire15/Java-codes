import java.util.*;
class test39
{
	 public static void main(String[] args) 
	 {
        Scanner sc = new Scanner(System.in);
        String unit[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String ten[]={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety","Ten","Eleven","Twelve","Thirteen","Fourteen"
        ,"Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String hundred[]={"Hundred","Thousand"};
        int n=sc.nextInt();
        int prev=0,p=0;
        String ans="",ans1="";
        while(n>0)
        {
        	int r=n%10;
        	if(p==0)
        		ans=unit[r]+" "+ans;
        	if(p==1)
        	{
        		if(r==1)
        			{
        				ans="";
        				ans1=ten[prev+10]+" "+ans;
        				ans=ans+" "+ans1;
        			}
        			else
        			{
        				ans=ten[r]+" "+ans;
        			}
        	}
        	if(p==2)
        	{
        		if(r!=0)
        		{
        		ans=unit[r]+" "+hundred[0]+" "+ans;
        		}
        	}
        	if(p==3)
        	{
        		if(prev==0)
        			ans=unit[r]+" "+hundred[1]+ans;
        		else
        			ans=unit[r]+" "+hundred[1]+" "+ans;
        	}

        	p++;
        	prev=r;
        	n/=10;
        }
        System.out.println(ans);
    }
}
