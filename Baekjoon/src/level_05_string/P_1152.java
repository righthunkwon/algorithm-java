package level_05_string;

import java.util.Scanner;

public class P_1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		str = str.trim(); // 양쪽 공백을 삭제한 str을 str에 다시 담는다.
		if(!str.isEmpty()) {
			String[] num = str.split(" ");
			System.out.println(num.length);
		} else {
			System.out.println(0);
		}
	}
/*
	StringTokenizer

		단어의 앞에도 공백이 있을 수 있기 떄문에 공백처리를 해줘야한다는 문제점이 있어 공백을 기준으로 단순히 나누는 방법으로는 에러가 발생한다.
		이는 StringTokenizer를 사용하여 분리 기준을 공백으로 지정해주면 공백을 기준으로 누눠 토큰에 저장하므로 쉽게 해결할 수 있다.
		StringTokenizer를 사용하면 문자열의 처음과 마지막의 공백에 대해 별다른 예외처리를 안해줘도 되니 매우 편리한 방법이다.
		StringTokenizer 에 들어간 토큰, 즉 문자열의 개수를 세어주는 메소드를 출력하면 문제는 끝난다.
		StringTokenizer 을 사용하기 위해서는 java.util.StringTokenizer; 을 import 해주어야 한다.

		만약 여러분들이 split함수를 써서 통과를 하고 싶다면 trim()혹은 strip() 을 통해 양쪽 공백을 지운 뒤 해당 문자열이 '빈 문자열'인지 확인하여 빈 문자열이라면 0을 출력하고 그 외에는 split()함수를 통해 String[] 배열로 반환하여 배열의 길이를 출력해주어야 한다.
		
	split
	
		split을 활용하여 쓸 경우 틀렸다고 나온다는 질문이 많아 이 부분에 대해 추가로 설명을 하겠다.
		가장 쉽게 예외 케이스를 먼저 알려드리자면 공백만 입력받아보면 된다. 
		공백만 입력받았을 경우에 분명 단어의 개수는 0으로 출력은 0이 되어야 정답이지만, split 함수를 사용하여 출력해보면 1이 나올 것이다.

		이는 String클래스의 split함수에 대한 이해와 빈 문자열이 무엇인지를 이해해야한다.

		먼저, 다음과 같은 과정을 거친다고 가정해보자.
		String s = scan.nextLine();  (BufferedReader의 readLine()도 가능)

		그리고 공백(" ") 을 입력받는다.
		그러면 s 는 공백(" ")을 담고 있는 문자열일 것이다.

		그리고 보통 앞 뒤 공백을 없애기 위해 trim() 혹은 strip() 함수를 쓸 것이다.
		그럼 s 변수는 무엇으로 바뀔까?
		바로 '빈 문자열'이다.

		예로들어 s = s.strip(); 을 하게 된다면, s는 ""(빈 문자열)로 바뀐다는 것이다. 
		이 부분이 중요한데, strip() 함수에 의해 공백 문자열(" ")이 빈 문자열("")로 대치된다는 것이지 null하고는 다르다.
		즉, 빈 문자열("")과 null은 다른 것이라는 뜻이다.

		예로들어 
		String a = "";
		String b = null;

		이렇게 두 개가 있다고 해보자.

		위 두 문자열 변수의 차이를 보면, a는 빈 문자열이기는 하지만 실제 값(빈 값)을 갖는 인스턴스화 된 문자열이다. 쉽게 말해서 빈 문자열을 갖는 문자열이다.
		반면에 b는 null로 할당 자체가 되지 않음을 의미한다. 즉, 인스턴스화 되지 않기에 참조하고있는 것 자체가 없다.

		그러면 다시 돌아와서 strip() 혹은 trim()에 의해 공백이 빈 문자열로 대치 되었다면, 0의 길이를 갖고있는 String 변수라는 뜻이다.
		이 부분을 간과하는 분들이 많아 아마 많이 틀리셨을 수도 있다. 
		그럼 여기까지 s = "" 이라는 것을 확인 할 수 있겠다.

		그렇기 때문에 만약 여러분들이 split함수를 써서 통과를 하고 싶다면 
		trim()혹은 strip() 을 통해 양쪽 공백을 지운 뒤, 
		해당 문자열이 '빈 문자열'인지 확인하여 빈 문자열이라면 0을 출력하고 
		그 외에는 split()함수를 통해 String[] 배열로 반환하여 배열의 길이를 출력해주어야 한다.
*/
}
