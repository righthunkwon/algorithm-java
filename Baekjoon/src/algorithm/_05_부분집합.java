package algorithm;

import java.io.*;
import java.util.*;

public class _05_부분집합 {
	static int n; // 뽑아야 하는 수의 개수
	static int[] arr; // 뽑을 숫자가 담긴 전체 배열
	static boolean[] visited; // index에 해당하는 숫자가 사용됐는지 저장하는 배열

	public static void main(String[] args) {

		n = 3;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1; // 입력되는 수는 1,2,3 으로 가정
		}

		n = 3; // 1 ~ 3개를 뽑아 부분집합 만들기
		visited = new boolean[3];

		// 부분집합
		subset(0);
	}

	public static void subset(int cnt) {
		// 종료 조건
		if (cnt == n) {
			for (int i = 0; i < n; i++) {
				if (visited[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			return;
		}

		visited[cnt] = true;
		subset(cnt + 1);
		visited[cnt] = false;
		subset(cnt + 1);
	}
}
