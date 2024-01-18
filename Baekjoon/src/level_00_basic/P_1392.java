package level_00_basic;

import java.io.*;
import java.util.*;

// 노래 악보
public class P_1392 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int[] score = new int[N];
		score[0] = Integer.parseInt(br.readLine());
		for (int i = 1; i < N; i++) {
			score[i] = score[i-1] + Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < Q; i++) {
			int q = Integer.parseInt(br.readLine());
			for (int j = 0; j < N; j++) {
				if (score[j] > q) {
					System.out.println(j+1);
					break;
				}
			}
		}
	}
}
