package level_5;

import java.util.Scanner;
 
public class P_10809 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 알파벳을 담을 배열 세팅
		int[] arr = new int[26];
		
		// 초기값 세팅(-1로 초기화)
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String str = scan.nextLine();
		
		// str.chatAt(0) = b
		// str.chatAt(1) = a
		// str.chatAt(2) = e
		// str.chatAt(3) = k
		// str.chatAt(4) = j
		// str.chatAt(5) = o
		// str.chatAt(6) = o
		// str.chatAt(7) = n
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화(동일문자 처리)
				arr[ch - 'a'] = i;
			}
			// arr[1] = 0
			// arr[0] = 1
			// arr[4] = 2
			// arr[10] = 3
			// arr[9] = 4
			// arr[14] = 5
			// arr[14] = 6 (처리X) (동일문자 : o이므로 처리하지 않는다.)
			// arr[13] = 7
		}
 
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}
}