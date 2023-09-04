package level_06_advanced1;

import java.util.Scanner;

// 그룹 단어 체커
// 떨어져서 나오면 안 된다.
public class P_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 단어의 수
		String[] words = new String[n]; // 단어 배열

		// 그룹단어를 만족하지 못하면
		// 단어의 수를 감소시켜 최종적으로 정답 출력
		int ans = n; 

		// 배열 요소 입력
		// 단어 전체 반복문
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();

			// 개별 단어 반복문
			char[] letter = new char[words[i].length()];
			for (int j = 0; j < words[i].length(); j++) {
				letter[j] = words[i].charAt(j);
			}

			// 카운트 배열을 활용한 판단
			int[] alphabet = new int[26];
			
			// 첫 값 입력
			alphabet[letter[0]-97]++;
			for (int j = 1; j < words[i].length(); j++) {
				
				// 사전에 이미 입력되었을 때
				// 직전의 단어가 반복되는 구조면 문제가 없지만
				// 직전의 단어가 반복되지 않았을 경우 그룹단어가 아니므로 단어의 수에서 하나를 빼준다.
				if (alphabet[letter[j]-97] > 0) {
					if (letter[j-1] == letter[j]) {
						alphabet[letter[j]-97]++;
					} else {
						ans--;
						break;
					}
				} 
				
				// 사전에 입력되지 않았을 때
				// 안심하고 카운트 배열의 값을 증가시킨다.
				else {
					alphabet[letter[j]-97]++;
				}
			}
		}
		
		// 정답 출력
		System.out.println(ans);
	}
}