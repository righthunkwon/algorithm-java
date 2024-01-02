package level_08_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소공배수
// 유클리드 호제법
// 최대공약수(GCD)를 빠르게 구하는 방법
// https://www.youtube.com/watch?v=Obs-HC5j5bI&ab_channel=%EC%88%98%ED%95%99%EC%B1%84%EB%84%90%EC%91%A4%ED%8A%9C%EB%B8%8C

// R = A % B 일 때
// GCD(A,B) = GCD(B,R) 이용
// ex) GCD(12345, 123
// 	   = GCD(123, 45)
// 	   = GCD(45, 33)
// 	   = GCD(33, 12)
// 	   = GCD(12, 9)
// 	   = GCD(9, 3)
// 	   = GCD(3, 0)
// 	   = 3

// 최소공배수(LCM)
// 최소공배수는 GCD를 응용해서 구함
// 두 수 A, B의 최대공약수를 G라고 하면
// 최소공배수와 최대공약수의 곱은 두 수의 곱과 동일

// 최소공배수 = 두 수의 곱 / 두 수의 최대공약수
public class P_1934 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println(A * B / gcd(A, B));
		}
	}

	public static int gcd(int a, int b) {
		// 0의 약수는 모든 수이므로
		// 0과 어떤 수의 최대공약수를 구하면 해당 수는 어떤 수 그 자체가 됨
		if (b == 0) {
			return a;
		} 
		
		// b가 0이 아닐 경우
		// 최대공약수를 계속해서 구한다
		else {
			return gcd(b, a % b);
		}
	}
}
