package recursive;
import java.util.Scanner;

public class P_17478 {
	
	// 배열 선언(반복되는 텍스트를 처리하는 용도)
	static String sArr[];
	
	// 변수 선언(언더바를 처리하는 용도)
	static String underBar = "";
	
	// 재귀함수
	static void recursive(int num) {
		// _의 수를 임시 변수에 대입(마지막 언더바를 처리하기 위함)
		String underBarTemp = underBar;
		
		// 재귀호출 중지(num이 0일 때)
		if (num==0) {
			// 재귀호출을 중지하기 전 텍스트 출력
			System.out.println(underBarTemp+sArr[0]);
			System.out.println(underBarTemp+sArr[4]);
			System.out.println(underBarTemp+sArr[5]);
			return;
		}
		
		// 텍스트 출력
		for(int i=0; i<4; i++) {
			System.out.println(underBarTemp+sArr[i]);
		}
		underBar += "____";
		
		// 재귀호출
		recursive(num-1);
		System.out.println(underBarTemp+sArr[5]);
	}
	
	// 메인 메소드
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt(); // 반복 횟수
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		
		// 배열
		sArr = new String[6];
		sArr[0] = "\"재귀함수가 뭔가요?\"";
		sArr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		sArr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		sArr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		sArr[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		sArr[5] = "라고 답변하였지.";
		
		recursive(cnt);
	}

}
