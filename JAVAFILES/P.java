import java.util.*;
class P
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t!=0)
        {
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
				if(i==1 || i==n)
				{
					for(int y=1;y<=n;y++)
						System.out.print("#");
				}
				else
				{
                for(int j=1;j<=n;j++)
                {
                    if(i>1 && i<n && j>1 && j<n)
                        System.out.print("*");
                    else
                        System.out.print("#");
                }
				}
                System.out.println();
            }
			t--;
            System.out.println();
        }
	}
}