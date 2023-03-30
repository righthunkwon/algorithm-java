package level_6;

import java.util.Scanner;

public class P_3003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] chess = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<chess.length; i++) {
			int whitePieces = scan.nextInt();
			System.out.println(chess[i]-whitePieces);
		}
		
	}

}

	/*
		입력방법
		
			(1) Scanner 클래스
				
					1. Scanner 클래스를 import 해준다. (import java.util.Scanner;)
					2. 객체를 생성해준다. (Scanner scan = new Scanner(System.in);
					3. 변수의 자료형에 맞게 입력해준다.
			
			(2) BufferedReader
			
					(2-1) readLine(); 은 행 하나를 읽어온다.
					(2-2) read(); 는 문자 1개만 읽어온다.
					
						read() 의 경우 키보드로 입력한 문자 한 개를 아스키코드(문자)로 읽어 정수형태로 반환된다.
						즉, 0 을 입력하더라도 문자로 인식하여 실제 변수에는 아스키코드 값인 48 이 저장된다.
						이처럼 read() 메소드는 슬픈 사연이 있기에 BufferedReader 을 쓸 때는 주로 readLine() 으로 쓰게 된다. 
						
						readLine() 을 통해 입력 받아 연산하는 방법 두 가지가 있다.
						앞서 말했듯이 readLine() 은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있다.
						
						문자열 분리 방법에는 두 가지가 있다.
						StringTokenizer 클래스를 이용하는 방법과 split()을 이용하는 방법 두 가지가 있는데,
						결론만 말하자면 StringTokenizer가 성능면에서 좋다.
						StringTokenizer 또한 java.util 패키지에 있으므로 import 해준 다음 객체 생성을 해준다.
						
						객체를 생성 할 때 StringTokenizer( "문자열" , 구분자 ); 을 해주면 된다.
						구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
						이때 반환시킨 문자열은 반환됨과 동시에 해당 객체에서 사라지게 된다.
						그리고 문자열을 반환했으니 Integer.parseInt()로 int 형으로 변환시켜준다.
						
						
						
							예시 코드 1(권장)
						
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					 		String str = br.readLine();
							StringTokenizer st = new StringTokenizer(str," ");
							int a = Integer.parseInt(st.nextToken());
							int b = Integer.parseInt(st.nextToken());
						
						
							예시 코드 2
						
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
							String[] str = br.readLine().split(" ");
							int a = Integer.parseInt(str[0]);
							int b = Integer.parseInt(str[1]);

	*/
