package level_00_basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 주사위
public class P_1233 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int[] arr1 = new int[n1 + 1];
		int[] arr2 = new int[n2 + 1];
		int[] arr3 = new int[n3 + 1];
		for (int i = 1; i <= n1; i++) {
			arr1[i] = i;
		}
		for (int i = 1; i <= n2; i++) {
			arr2[i] = i;
		}
		for (int i = 1; i <= n3; i++) {
			arr3[i] = i;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n2; j++) {
				for (int k = 1; k <= n3; k++) {
					int tmp = arr1[i] + arr2[j] + arr3[k];
					if (!map.containsKey(tmp)) {
						map.put(tmp, 1);
					} else {
						map.put(tmp, map.get(tmp) + 1);
					}
				}
			}
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int key : map.keySet()) {
			max = Math.max(map.get(key), max);
		}
		for (int key : map.keySet()) {
			if (max == map.get(key)) {
				min = Math.min(key, min);
			}
		}
		System.out.println(min);
	}
}
