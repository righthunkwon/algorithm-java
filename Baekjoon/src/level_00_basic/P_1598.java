package level_00_basic;

import java.util.Scanner;

// 꼬리를 무는 숫자 나열
// 세로의 거리 차이 - 나머지의 차이
// 가로의 거리 차이 - 몇 번째 열에 있는지 4로 나눈 몫으로 판단 후 이를 계산한 차이

// 1 5 9  ... 4로 나눈 나머지가 1
// 2 6 10 ... 4로 나눈 나머지가 2
// 3 7 11 ... 4로 나눈 나머지가 3
// 4 8 12 ... 4로 나눈 나머지가 0(4로 판단)
public class P_1598 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // 숫자 1
		int n2 = sc.nextInt(); // 숫자 2
		
		// 세로 거리(cdiff)
		int c1 = n1 % 4;
		int c2 = n2 % 4;
		if (c1 == 0) c1 = 4;
		if (c2 == 0) c2 = 4;
		int cdiff = Math.abs(c1 - c2);
		
		// 가로 거리(rdiff)
		int r1 = 0; // n1의 열 번호
		while (n1 > 0) {
			n1 -= 4;
			r1++;
		}
		int r2 = 0; // n2의 열 번호
		while (n2 > 0) {
			n2 -= 4;
			r2++;
		}
		int rdiff = Math.abs(r1 - r2);		
		int ans = cdiff + rdiff;
		System.out.println(ans);
	}
}
