package level_03_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P_11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st; 
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write("Case #" + i + ": ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}


/*
	IOException(자바 입출력 예외처리)
	
		IOException 는 스트림, 파일 및 디렉터리를 사용하여 정보에 액세스하는 동안 
		throw된 예외에 대한 기본 클래스이다.
		
		컴퓨터 프로그램이 실행될 때 언제 어떤 문제가 발생할지 모르는 일이기 때문에 
		프로그램을 만들 때는 예외로 발생하는 상황에 대처해야 하는데 
		자바는 입력과 출력을 할 때 발생할 수 있는 예외에 대해서 까다롭게 규정하고 있다. 
		
		그래서 입력과 출력을 다루는 메서드에 예외처리가 없다면 컴파일 에러가 발생하게 된다.
		그런데, 우리가 흔히 사용하는 출력인 print(), println(), printf()에는
		별도의 예외처리를 해준 기억이 없을 것이다. 
		
		그 이유는 자바에서 print(), println(), printf() 메서드에만 
		자체적으로 예외처리를 해놨기 때문이다. 이것들을 제외하고는 모두 따로 예외처리를 해줘야 한다.
		
		가령, readLine()과 같은 메소드를 사용한다면 반드시 
		IOException 예외처리를 해줘야 하고, 이를 해주지 않으면 
		에러가 발생하게 된다. 이를 위해서는 먼저 java.io.*;를 import 해주고 
		예외가 발생할 수 있는 메서드에 IOException을 throws 해주면 된다.
		
		
		(참고)
			상속관계 : Object → Exception → SystemException → IOException

*/
