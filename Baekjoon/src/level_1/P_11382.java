package level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_11382 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		System.out.println(A+B+C);
	}

}

/*
	IOException
	
		IOException은 Input/Output 예외를 의미합니다. 
		즉, 파일이나 네트워크 연결 등의 Input/Output 작업에서 예외가 발생했을 때 해당 예외를 나타내는 클래스입니다. 
		
		IOException은 자바의 java.io 패키지에 속한 예외 클래스로, 
		파일 또는 네트워크와 같은 외부 자원을 다룰 때 주로 발생합니다. 
		
		예를 들어, 파일이 존재하지 않거나 읽을 수 없는 경우, 파일을 쓰기 위해 사용 권한이 없는 경우, 
		파일을 삭제하려고 할 때 다른 프로세스가 이미 해당 파일을 사용 중인 경우 등이 모두 IOException을 발생시키는 상황입니다.

		IOException은 checked exception으로, 메소드에서 IOException을 처리하지 않으면 컴파일 오류가 발생합니다. 
		따라서 파일이나 네트워크와 같은 외부 자원을 다룰 때는 IOException을 처리하는 코드를 반드시 작성해야 합니다.
*/
