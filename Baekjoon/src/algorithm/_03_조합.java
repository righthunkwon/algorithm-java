package algorithm;

import java.io.*;
import java.util.*;

public class _03_조합 {
	static int n; // 전체 후보의 수
	static int r; // 뽑아야 하는 수의 개수
	static int[] arr; // 뽑을 숫자가 담긴 전체 배열
	static int[] num; // 뽑은 숫자를 저장하는 배열

	// 중복 없이 5개 중에서 3개를 뽑는 경우의 수
	public static void main(String[] args) {
		
		// 전체 후보
		n = 5;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1; // 입력되는 수는 1,2,3,4,5 로 가정
		}
			
		// 뽑을 후보
		r = 3;
		num = new int[3]; // 5개 중 3개를 뽑아 조합 만들기

		// 조합
		comb(0, 0);
	}

	public static void comb(int cnt, int idx) { // cnt: 뽑은 수, idx: 배열 기준 인덱스 
		// 종료조건
		if (cnt == r) {
			System.out.println(Arrays.toString(num));
			return;
		}

		// 반복수행
		for (int i = idx; i < arr.length; i++) { // idx와 i 혼동 주의
			num[cnt] = arr[i];
			comb(cnt + 1, i + 1);
		}
	}
}
