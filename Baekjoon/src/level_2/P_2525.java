package level_2;

import java.util.Scanner;

public class P_2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 현재 시간과 분을 하나의 분으로 변환한 뒤,
		// 소요되는 분을 더한 뒤 이를 다시 시와 분으로 변환하여 출력
		
		// 입력받는 시각
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		// 입력받은 시각(분)
		int min = A*60 + B;
		
		// 소요된 시간
		int input = scan.nextInt();

		// 결과 시각(분)
		int resultMin = min + input;
		
		// 결과 시각(시+분)
		int hour = (resultMin / 60) % 24; // 24시 이상일 경우 0시부터 시작 
		int minute = resultMin % 60;
		
		System.out.println(hour + " " + minute);
	}

}
