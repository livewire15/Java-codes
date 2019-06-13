public class solution {
	public static void printSubsets(int input[]) {
		// Write your code here

		subset(input,"",input.length);
	}
  
  static void subset(int arr[],String s,int l)
  {
    if(l==0)
    {
     System.out.println(s);
    }
    else
    {
      subset(arr,s,l-1);
      subset(arr,arr[l-1]+" "+s,l-1);       
    }
    }
	}
