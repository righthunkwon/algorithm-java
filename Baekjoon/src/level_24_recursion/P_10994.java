package level_24_recursion;

import java.util.Scanner;

// 별 찍기 - 19
// 배열을 만든 뒤 전부 공백으로 초기화하고 이후에 별을 입력하고 마지막에 한 번에 출력한다.

// 가로 및 세로 4(n-1)+1 (단, n=0,1,2,3, ...)
// 1 - 1*1
// 2 - 5*5
// 3 - 9*9
// 4 - 13*13
public class P_10994 {
	private static int n;
	private static int row;
	private static int col;
	private static int size;
	private static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 변수 및 배열 세팅
		n = sc.nextInt();
		size = 4 * (n - 1) + 1;
		arr = new char[size][size];

		// 배열 요소 입력(공백으로 초기화)
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = ' ';
			}
		}

		// 재귀 실행('*'입력)
		recursion(0, size);

		// 배열 출력
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void recursion(int st, int ed) {
		// 기저부분(종료조건)
		if (ed == 1) {
			arr[0][0] = '*';
			return;
		}

		// 재귀부분(반복수행)
		// st ed
		// 0 9
		// 2 7
		// 4 5
		for (int i = st; i < ed; i++) {
			arr[st][i] = '*'; // 위 가로줄
			arr[ed - 1][i] = '*'; // 아래 가로줄
			arr[i][st] = '*'; // 왼쪽 세로줄
			arr[i][ed - 1] = '*'; // 오른쪽 세로줄
		}
		recursion(st + 2, ed - 2);
	}
}