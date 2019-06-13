import java.util.*;
public class editdistance {

	
	public static int editDistance(String s1, String s2){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	*/
      return edit(s1,s2);
	}
  
  static int edit(String s1,String s2)
  {
    if(s1.length()==0)
      return s2.length();
    if(s2.length()==0)
      return s1.length();
 
    int m=s1.length();
	int n=s2.length();
	int storage[][]=new int[m+1][n+1];
	for(int i=0;i<=m;i++)
	{
		storage[i][0]=i;
	}
	for(int j=0;j<=n;j++)
	{
		storage[0][j]=j;
	}
	
	for(int i=1;i<=m;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(s1.charAt(m-i)==s2.charAt(n-j))
				storage[i][j]=storage[i-1][j-1];
			else
			{
				int option1=1+storage[i-1][j];
				int option2=1+storage[i-1][j-1];
				int option3=1+storage[i][j-1];
				storage[i][j]=Math.min(option1,Math.min(option2,option3));
			}
		}
	}
	return storage[m][n];
  }
  
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  String s1=sc.next();
  String s2=sc.next();
 System.out.println(editDistance(s1,s2));
  }
}