import java.util.Scanner;

public class CodeUp1079 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String str[] = s.split(" ");
		String a = "q";
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
			if(str[i].equals(a)) { // =="q"는 사용할 수 없다.
				break;
			}
		}
	}

}

	/*
		equals() vs ==
			
			equals와 == 은 어떤 차이점이 있을까요.
			기본적으로 이 둘은 모두 양 쪽에 있는 내용을 비교한 값을 boolean type으로 반환한다는 공통점을 가집니다.
			하지만 차이점이 분명 존재합니다.


			1) 형태의 차이 : 메소드 vs 연산자
	
				가장 단순한 차이점은 형태의 차이입니다.
				'equals()' 는 '메소드' 입니다. 객체끼리 내용을 비교할 수 있도록 합니다.
				'==' 은 비교를 위한 '연산자' 입니다.


			2) 비교의 대상 : 내용 자체 vs 주소값
			
				차이점이라 말할만한 내용으로는, 비교할 수 있는 대상에 대한 부분입니다.
				'equals 메소드'는 비교하고자 하는 대상의 '내용 자체'를 비교하지만,
				'== 연산자'는 비교하고자 하는 대상의 '주소값'을 비교합니다.

				주소값이라는 것은 확실하게 집주소나 이메일주소처럼 확정적으로 정해져서 보여지는 것은 아니지만
				대상을 구별할 수 있게하는 값이라고 알아두시면 됩니다.

				이는 Call By Reference, Call By Value에 대한 공부를 하시면 이해할 수 있는 부분입니다.
				CBV(Call By Value. 이하 CBV) 는 기본적으로 대상에 주소값을 가지지 않는 것으로 값을 할당받는 형태로 사용됩니다. 
				예를 들어 int, float, double, byte 등 primitive type에 해당됩니다.

				CBR(Call By Reference. 이하 CBR) 는 대상을 선언했을 때, 주소값이 부여됩니다.
				그래서 어떠한 객체를 불러왔을 때는 그 주소값을 불러온다고 봅니다.
				Class, Object(객체)가 CBR에 해당됩니다.

				예를 들어, String 클래스를 이용해 문자열을 생성해보겠습니다.

				String a = "aaa";
				String b = a;
				String c = new String ("aaa");
				
				a, b, c 모두 "aaa"라는 내용을 가지고 있지만, 주소값에 대해서는 다른 값을 가지는 변수가 존재합니다.
				해당 사례에서는 a와 b는 같은 주소값을 공유하지만, c는 이와 다른 주소값을 갖습니다.
				
				위의 내용을 다 이해하셨다면 equals, == 을 이용한 아래의 내용이 어떻게 출력되는지 봅시다.


				System.out.println(a.equals(b));
				System.out.println(a==b);
				System.out.println(a==c);
				System.out.println(a.equals(c));


				정답은
				
				첫번째는 a와 b가 가지고 있는 내용을 비교하였으므로 true
				두번째는 a와 b가 가지고 있는 주소값을 비교하고 있으므로 true
				세번째는 a와 c가 가지고 있는 주소값을 비교하고 있으므로 false
				네번째는 a와 c가 가지고 있는 내용을 비교하였으므로 true

				물론 b.equals(c) 는 true, b==c 의 값은 false 라는 사실은 다 아시죠?
				지금까지 equals()와 ==의 차이점에 대해 알아보았습니다.
	*/
