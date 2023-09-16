package level_08_math;

import java.util.Scanner;

// 중앙 이동 알고리즘
// 중복되는 점을 제거하면서 점의 개수를 저장
// 직접 그림을 그려보고 규칙을 찾아서 문제를 풀이하자(점화식 마인드).

// 한 변에 있는 점의 개수의 제곱이 총 점의 개수
// 한 변의 점의 개수는 2, 3, 5, 9, 17, ...과 같이 증가한다.
// 첫번째: 3 = 2 + (2 - 1)
// 두번째: 5 = 3 + (3 - 1)
// 세번째: 9 = 5 + (5 - 1)
// 네번째: 17 = 9 + (9 - 1)
public class P_2903 {
	private static int n, side;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 변환 단계
		side = getSide(0, 2); // 한 변의 길이
		System.out.println(side * side);
	}

	private static int getSide(int phase, int num) { // 단계, 한 변의 길이
		// 기저부분(종료조건)
		if (phase == n) {
			return num;
		}
		
		// 재귀부분(반복수행)
		num = num + (num - 1);
		return getSide(phase+1, num);
	}
}
