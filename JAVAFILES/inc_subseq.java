import java.util.*;
public class inc_subseq {
//GeeksforGeeks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
	  int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int list[]=new int[n];
		Arrays.fill(list,1);
		for(int i=1;i<n;i++)
		{
		for(int j=0;j<i;j++)
		{
		if(a[i]>a[j] && list[i]<list[j]+1)
		{
		list[i]=list[j]+1;
		}
		}
		}
		Arrays.sort(list);
		System.out.println(list[n-1]);
		}
		}