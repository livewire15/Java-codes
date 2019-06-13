import java.util.*;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++)
        {
            arr[(int)s.charAt(i)-97]++;
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            if(arr[i]%2!=0)
            {
                al.add(arr[i]);
            }
        }
        System.out.println(al.size()/2);
    }
}