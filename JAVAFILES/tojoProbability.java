import java.util.*;
class TojoProbability{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
			int n=s.nextInt(),m=s.nextInt();
			double res=n+m-1;
			System.out.println(res);
		}
	}
} 