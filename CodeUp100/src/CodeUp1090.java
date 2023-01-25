import java.util.Scanner;

public class CodeUp1090 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		System.out.println(a*(long)Math.pow(r, n-1));
	}

}

	/*
		Math.pow(밑, 지수)
			
			base	 : 밑
			exponent : 지수
			
			Math.pow() 함수는base^exponent처럼 base에 exponent를 제곱한 값을 반환합니다.
			
			pow()는 Math의 정적 메서드이므로 Math객체를 생성하여 그 메서드로 사용하지 말고, 
			항상 Math.pow()로 사용하십시오. (Math에는 생성자가 없습니다). 
			만약 밑(base) 값이 음수이고 지수(exponent)가 정수가 아닌 경우 결과는 NaN입니다.
	*/
