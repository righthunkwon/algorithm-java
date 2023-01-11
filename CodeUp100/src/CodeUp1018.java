import java.util.Scanner;

public class CodeUp1018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		System.out.printf("%s", a);
	}
	
}

	/*
		scanf("%d:%d", &h, &m);
		scanf() 함수는 콜론(:)기호를 기준으로 두 수가 각 변수에 저장된다.
	*/

	/*
		public class Main {

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in); 
				
				String time[] = scan.next().split(":"); // 리스트 time을 생성해서 입력값을 추가해주는 과정
				System.out.println(time[0] + ":" + time[1]);
			} 
		}
	 */