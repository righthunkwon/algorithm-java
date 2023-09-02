package level_06_advanced1;

import java.util.Scanner;

public class P_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 반복문을 돌면서 해당 문자가 어떤 문자인지에 따라 해당 배열 원소를 증가시키는 방법 사용
		
		// 영문자(26자)
		int[] arr = new int[26];
		
		// 입력받는 문자열
		String s = scan.next();
		
		// 대소문자 카운트
		for(int i=0; i<s.length(); i++) {
			// 대문자와 소문자는 동일하게 취급 : 문자의 코드값을 통해 구현!!!
			// 대문자:65~90,  소문자:97~122
			if(65 <= s.charAt(i) && s.charAt(i) <=90) { // 대문자 범위
				arr[s.charAt(i) - 65]++; // 해당 인덱스의 값 1 증가
			} else { // 소문자 범위
				arr[s.charAt(i) - 97]++;
			}
		}
		
		int max = 0; // 최댓값 초기화
		char ch = '?'; // 최빈값 중복 시 출력하는 문자
		
		// 배열 순회
		for(int i=0; i<arr.length; i++) { // arr의 index: 0~25
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65); // 대문자로 출력(+65)
			} else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
