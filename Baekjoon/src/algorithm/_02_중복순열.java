package algorithm;

import java.io.*;
import java.util.*;

// 중복순열은 순열의 코드에서 방문처리만 지워주면 된다.
public class _02_중복순열 {
	static int n; // 전체 후보의 수
	static int r; // 뽑아야 하는 수의 개수
	static int[] arr; // 뽑을 숫자가 담긴 전체 배열
	static int[] num; // 뽑은 숫자를 저장하는 배열

	// 5개 중에서 3개를 뽑아 나열하는 경우의 수(중복 가능)
	public static void main(String[] args) {

		// 전체 후보
		n = 5;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1; // 입력되는 수는 1,2,3,4,5 로 가정
		}

		// 뽑을 후보
		r = 3;
		num = new int[3];

		// 순열
		perm(0);
	}

	public static void perm(int cnt) { // cnt: 뽑은 수
		// 종료조건
		if (cnt == r) {
			System.out.println(Arrays.toString(num));
			return;
		}

		// 반복수행
		for (int i = 0; i < arr.length; i++) {
			num[cnt] = arr[i];
			perm(cnt + 1);
		}
	}
}
