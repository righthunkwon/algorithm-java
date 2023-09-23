package level_08_math;

import java.util.Scanner;

// 11 12 13 14 15 ...
// 21 22 23 24 25 ...
// 31 32 33 34 35 ...
// 41 42 43 44 45 ...
// 51 52 53 54 55 ... 

// 분수찾기
// 경우의 수 나누기
// 홀수 그룹은 분자가 감소하고 분모가 증가
// 짝수 그룹은 분자가 증가하고 분모가 감소
public class P_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int line = 1;
		int tmp = x;
		while (true) {
			tmp -= line;
			if (tmp <= 0)
				break;
			line++;
		}
		
		// 첫 번째 행의 값을 기준으로
		int criteria = 0;
		for (int i = 1; i < line; i++) {
			criteria += i;
		}
		criteria += 1;
		int idx = Math.abs(x - criteria);

		if (line % 2 == 0) {
			int bunja = 1 + idx;
			int bunmo = line - idx;
			System.out.println(bunja + "/" + bunmo);
		} else {
			int bunja = line - idx;
			int bunmo = 1 + idx;
			System.out.println(bunja + "/" + bunmo);
		}
	}
}
