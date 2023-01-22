import java.util.Scanner;

public class CodeUp1060 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a & b);
	}

}

	/*
		비트 연산자(bit operator)
		
				&	: 모두 1이면 1을 반환(and)
				|	: 하나라도 1이면 1을 반환(or)
				^	: 서로 다르면 1을 반환(xor)
				~	: 1이면 0으로, 0이면 1로(not)
				<<	: 왼쪽으로 이동(left shift)
				>>	: (부호를 유지하면서) 오른쪽으로 이동 (right shift)
		
	*/
