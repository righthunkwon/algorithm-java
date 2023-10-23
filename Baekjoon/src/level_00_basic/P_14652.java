package level_00_basic;

import java.util.Scanner;

// 나는 행복합니다~
// 2차원 배열을 만들면 m은 30000까지 이므로 메모리를 초과한다.
public class P_14652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int row = k / m;
		int col = k % m;
		System.out.println(row + " " + col);
	}
}
