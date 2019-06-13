import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 
		int T = scan.nextInt();
		while (T-- > 0) {
 
			int N = 0;
			if (scan.hasNext()) {
				N = scan.nextInt();
			}
 
			int[] A = new int[N];
			int[] AB = new int[10000000];
			Arrays.fill(AB, 0);
			for (int i = 0; i < N; i++) {
				if (scan.hasNext()) {
					A[i] = scan.nextInt();
					AB[A[i] - 1] = 1;
				}
			}
			int count = 0;
			for (int i = 0; i < 100003; i++) {
 
				if (AB[i] == 1) {
					count++;
				}
 
			}
 
			System.out.println(count);
		}
	}
}