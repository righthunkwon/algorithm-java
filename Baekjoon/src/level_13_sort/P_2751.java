package level_13_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P_2751 {
	public static void main(String[] args) {

		// 문제 상황
		// (1) Bubble sort : 시간 초과 (시간복잡도: O(n^2))
		// (2) Arrays.sort : 시간 초과 (시간복잡도: O(n log n) ~ O(n^2))
		// (3) Bubble sort & BufferedReader : 시간 초과 (시간복잡도: O(n^2))

		// 해결책
		// Collections.sort()
		//		: 합병 및 삽입정렬(hybrid sorting algorithm) (시간복잡도: O(n) ~ O(n log n)) 
		//		: 단, List 계열 자료구조 활용 권장
		//		: Scanner로 입력받아도 되지만, 
		//		  출력은 BufferedWriter를 활용하든지, StringBuilder를 통해 한 번에 출력해야 시간 초과가 나지 않는다.
		
		// 참고 지식
		// StringBuilder를 사용하는 이유
		// 		: 문자열을 합치는 코드 예시
		// 		: String str1 = "싸피생은 ";
		// 		: String str2 = "배고프다.";
		// 		: String result = str1 + srt2;
		//		: System.out.println(result); => 싸피생은 배고프다.
		//		: 이 과정에서 str1, str2는 GC가 처리하고, result라는 새로운 String 객체가 생성된다.
		
		// 		: Java에서 String 객체는 변경이 불가능하다. 한 번 생성되면 내용을 바꿀 수 없다.
		// 		: 따라서 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터가 처리한다.
		// 		: 이 과정에서 메모리 할당과 해제가 발생하므로, 문자열을 합치는 작업, 즉 String 객체끼리 더하는 작업이 많아진다면 성능적으로 좋지 않은 것이다.

		// 		: 하지만, 변경 불가능한 문자열을 생성하는 String과 달리,
		//		: StringBuilder는 내부적으로 변경 가능한 문자열을 만들어주기 때문에
		// 		: 문자열을 합치는 작업 시 성능 저하를 막는 하나의 대안으로서 활용할 수 있다.
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		// 배열의 길이 지정 & ArrayList 배열 선언
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		// 배열 입력 반복문
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		// 배열 정렬
		Collections.sort(list);

		// 향상된 for문으로 StringBuilder에 문자열 추가
		for (int value : list) {
			sb.append(value).append('\n');
		}
		
		// 배열 출력
		System.out.println(sb);
	}

}
