import java.util.*;
public class str_common_subseq {
//GeeksforGeeks
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s1=sc.next();
	  String s2=sc.next();
	  int list[][]=new int[s1.length()+1][s2.length()+1];
	  for(int i=0;i<=s1.length();i++)
	  {
	  for(int j=0;j<=s2.length();j++)
	  {
	  if(i==0 || j==0)
	  list[i][j]=0;
	  
	  else if(s1.charAt(i-1)==s2.charAt(j-1))
	  list[i][j]=list[i-1][j-1]+1;
	  
	  else
	  list[i][j]=max(list[i-1][j],list[i][j-1]);
	  }
	  }
	  System.out.println(list[s1.length()][s2.length()]);
	  }
	  
	  public static int max(int m,int n)
	  {
	  if(m>n)
	  return m;
	  else
	  return n;
	  }
}