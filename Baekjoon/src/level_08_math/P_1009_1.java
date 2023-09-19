package level_08_math;

import java.util.Scanner;

// 분산처리
// 경우의 수 나누고 배열로 만들어서 처리
public class P_1009_1 {

	// 1: 1
	// 2: 2 4 8 6
	// 3: 3 9 7 1
	// 4: 4 6
	// 5: 5
	// 6: 6
	// 7: 7 9 3 1
	// 8: 8 4 2 6
	// 9: 9 1
	// 10: 10

	private static int[] arr1 = { 0, 1 };
	private static int[] arr2 = { 0, 2, 4, 8, 6 };
	private static int[] arr3 = { 0, 3, 9, 7, 1 };
	private static int[] arr4 = { 0, 4, 6 };
	private static int[] arr5 = { 0, 5 };
	private static int[] arr6 = { 0, 6 };
	private static int[] arr7 = { 0, 7, 9, 3, 1 };
	private static int[] arr8 = { 0, 8, 4, 2, 6 };
	private static int[] arr9 = { 0, 9, 1 };
	private static int[] arr10 = { 0, 10 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int data;

		for (int t = 1; t <= tc; t++) {
			String a = sc.next();
			int b = sc.nextInt();
			int dnum = a.charAt(a.length() - 1) - '0';

			switch (dnum) {
			case 0:
				System.out.println(10);
				break;
			case 1:
				System.out.println(1);
				break;
			case 2:
				data = b % (arr2.length - 1);
				if (data == 0) {
					System.out.println(arr2[arr2.length - 1]);
				} else {
					System.out.println(arr2[data]);
				}
				break;
			case 3:
				data = b % (arr3.length - 1);
				if (data == 0) {
					System.out.println(arr3[arr3.length - 1]);
				} else {
					System.out.println(arr3[data]);
				}
				break;
			case 4:
				data = b % (arr4.length - 1);
				if (data == 0) {
					System.out.println(arr4[arr4.length - 1]);
				} else {
					System.out.println(arr4[data]);
				}
				break;
			case 5:
				System.out.println(5);
				break;
			case 6:
				System.out.println(6);
				break;
			case 7:
				data = b % (arr7.length - 1);
				if (data == 0) {
					System.out.println(arr7[arr7.length - 1]);
				} else {
					System.out.println(arr7[data]);
				}
				break;
			case 8:
				data = b % (arr8.length - 1);
				if (data == 0) {
					System.out.println(arr8[arr8.length - 1]);
				} else {
					System.out.println(arr8[data]);
				}
				break;
			case 9:
				data = b % (arr9.length - 1);
				if (data == 0) {
					System.out.println(arr9[arr9.length - 1]);
				} else {
					System.out.println(arr9[data]);
				}
				break;
			}
		}
	}
}