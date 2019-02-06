import java.util.Scanner;
import java.util.HashMap;

public class miles {
	public static void main(String agrs[]) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.next();
			if (s.equals("###")) {
				break;
			} else {
				map.put(s, n++);
			}
		}
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		String s1 = sc.next();
		String s2 = sc.next();
		int m1 = map.get(s1);
		int m2 = map.get(s2);
		System.out.println(a[m1][m2]);
	}
}
