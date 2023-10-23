package level_00_basic;

import java.util.Scanner;

// 스테판 쿼리
// 가위1 바위2 보3
public class P_14654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		int win1 = 0; // 1번 연승
		int win2 = 0; // 2번 연승
		int max = 0; // 최대 연승
		for (int i = 0; i < n; i++) {
			if ((arr1[i]==1 && arr2[i]==3) || (arr1[i]==2 && arr2[i]==1) || (arr1[i]==3 && arr2[i]==2)) {  
				win1++;
				max = Math.max(max, Math.max(win1, win2));
				win2 = 0;
			} else if ((arr2[i]==1 && arr1[i]==3) || (arr2[i]==2 && arr1[i]==1) || (arr2[i]==3 && arr1[i]==2)) {
				win2++;
				max = Math.max(max, Math.max(win1, win2));
				win1 = 0;
			} else {
				if (win1 > 0) {
					win2++;
					max = Math.max(max, Math.max(win1, win2));
					win1 = 0;
				} else if (win2 > 0) {
					win1++;
					max = Math.max(max, Math.max(win1, win2));
					win2 = 0;
				}
			}
		}
		if (n==1) max = 1;
		System.out.println(max);
	}
}
