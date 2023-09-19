package level_08_math;

import java.util.Scanner;

// 분산처리
// 직접 연산하되 조건을 부여해서 이를 가능하게 구현
public class P_1009_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int a, b, cnum;
		
		for (int t = 1; t <= tc; t++) {
			a = sc.nextInt();
			b = sc.nextInt();
			cnum = 1;

			// 어떤 수의 a^b는 a를 b번 곱해준 것이다.
			// 어떤 수의 일의 자리는 10으로 나눈 나머지로 구할 수 있다.
			// 어떤 수의 일의 자리는 해당하는 일의 자리를 어떤 수로 곱했는지에 따라 결정되므로 일의 자리만 반복해서 살펴본다.
			for (int i = 0; i < b; i++) {
				cnum = (cnum * a) % 10;
			}
			
			// 0번 데이터는 10번 컴퓨터가 처리해주므로 이를 반영한다.
			if (cnum == 0) {
				cnum = 10;
			}
			System.out.println(cnum);
		}
		sc.close();
	}
}