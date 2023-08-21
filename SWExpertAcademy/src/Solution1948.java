import java.util.Scanner;

public class Solution1948 {
	static int[] totaldate = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int bmonth = sc.nextInt(); // before month
			int bdate = sc.nextInt(); // before date
			int amonth = sc.nextInt(); // after month
			int adate = sc.nextInt(); // after date

			// 총 날짜의 수(1+2+3)
			// 1. bmonth의 남은 날짜
			int bmonthdate = 0;
			if (bmonth == amonth) {
				bmonthdate = adate - bdate + 1;
			} else if (bmonth < amonth) {
				bmonthdate = totaldate[bmonth] - bdate + 1;
			}

			// 2. bmonth+1이상 amonth-1이하 달의 날짜
			int betweendate = 0;
			if (amonth - bmonth > 1) {
				for (int i = bmonth + 1; i <= amonth + -1; i++) {
					betweendate += totaldate[i];
				}
			}

			// 3. amonth의 날짜
			int amonthdate = 0;
			if (bmonth == amonth) {
				amonthdate = 0;
			} else if (bmonth < amonth) {
				amonthdate = adate;
			}

			// 총 날짜
			int ans = bmonthdate + betweendate + amonthdate;
			System.out.printf("#%d %d\n", t, ans);
		}
	}
}
