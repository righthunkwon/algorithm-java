import java.util.Scanner;

public class S_1970 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt(); // 거스름돈
			int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
			int[] ans = new int[8];

			for (int i = 0; i < 8; i++) {
				ans[i] = n / money[i];
				n %= money[i];
			}

			System.out.printf("#%d\n", t);
			for (int i = 0; i < 8; i++) {
				System.out.print(ans[i] + " ");
			}
			System.out.println();
		}
	}
}
