static class Task {

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			String s = in.next();
			int n = s.length();
			int c0 = 0;
			int c1 = 0;
			int c2 = 0;
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == '1') c1++;
				else if (s.charAt(i) == '2') {
					a[c2] = 2;
					c2++;
				} else {
					if (c2 == 0) c0++;
					else {
						a[c2] = 0;
						c2++;
					}
				}
			}
			for (int i = 0; i < c0; i++) out.print('0');
			for (int i = 0; i < c1; i++) out.print('1');
			for (int i = 0; i < c2; i++) out.print(a[i] == 0 ? '0' : '2');
			out.println();
		}