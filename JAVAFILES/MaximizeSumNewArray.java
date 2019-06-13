import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int[] ar = new int[N];
			for (int j = 0; j < N; j++) {
				ar[j] = in.nextInt();
			}
			int[][] dp = new int[N][2];
			for (int h = 0; h < N - 1; h++) {
				dp[h + 1][0] = Math.max(dp[h][0], dp[h][1] + ar[h] - 1);
				dp[h + 1][1] = Math.max(dp[h][0] + ar[h + 1] - 1, dp[h][1]
						+ ar[h + 1] - ar[h]);
			}
			System.out.println(Math.max(dp[N - 1][0], dp[N - 1][1]));
		}

	}
}
