import java.util.Scanner;

public class trip_min {

	
	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
      int sum=0;
      int arr[][]=new int[n+1][3];
	  int b[]=new int[n];
      int i=0,j=0;
      for(i=0;i<n;i++)
      {
  		for(j=0;j<3;j++)
        {
         arr[i][j]=sc.nextInt(); 
        }
      }
      
      sum+=arr[0][2];   
	  b[0]=-1;
      int value=0,count=1,ptr=0;
      float total=0;
      j=0;
      while(count<n)
      {
        float min=(float)Integer.MAX_VALUE;
      for(i=1;i<n;i++)
      {
        if(b[i]!=-1)
        {
        float dist=(float)Math.sqrt(Math.pow(arr[i][0]-arr[j][0],2)+Math.pow(arr[i][1]-arr[j][1],2));
		String str1 = String.format("%.6f", dist);
		dist=(Float.parseFloat(str1));
        if(dist<min)
        {
          min=dist;
          value=arr[i][2];
          ptr=i;
	    }
      }
      }
	    b[ptr]=-1;
        sum+=value;
        total+=min;
		System.out.println(sum+" "+total);
        j=ptr;
        count++;
      }
	  float ans=(float)(sum-total);
	  String str = String.format("%.6f", ans);
      System.out.println(str);
       
      }

}