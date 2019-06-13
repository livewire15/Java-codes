import java.util.*;
class BOB 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	String s=sc.next();
        String p=sc.next();
        int bo=0,b=0,o=0;
    	for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='b' && p.charAt(i)=='o')||(s.charAt(i)=='o' && p.charAt(i)=='b'))
                bo++;
            else if(s.charAt(i)=='b' || p.charAt(i)=='b')
                b++;
            else if(s.charAt(i)=='o' || p.charAt(i)=='o')
                o++;
        }
        if((b==2 && o==1) ||(b==2 && bo==1)||(b==1 && bo==1 && o==1) ||(bo==3)|| (bo==2 && o==1) ||(bo==2 && b==1))
            System.out.println("yes");
        else
             System.out.println("no");
    }
}
}