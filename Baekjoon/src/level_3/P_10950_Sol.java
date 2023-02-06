package level_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P_10950_Sol {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}

}

/*
	(1) 풀이 해설
	
		아무래도 BufferedReader 은 문자열로 받아들이게 되는데 우리가 원하는 건 한 줄에 정수 2개이니 공백을 기준으로 문자열을 분리해주어야 한다. 
		이를 위해 필자는 StringTokenizer 을 사용했다. ( split() 메소드보다 성능이 더 좋다! )
		또한 배열을 따로 생성하여 저장했다가 다시 출력하는 방식보다는 StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한 번에 출력해주는 방식을 택했다.
	
	
	(2) InputStream -> InputStreamReader -> BufferedReader
		: BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			inputStream, inputStreamReader, BufferedReader로 차례대로 인자값으로 받아와서 사용해야한다. 
			그리고 readLine()이라는 메서드를 사용한다. 이는 InputStream부터 인자값을 받아가며 처리해야되서 다소 복잡하지만, 
			많은 데이터를 입력받는 경우에는 아래 기술한 Scanner보다 메모리 사용면에서 효율적이다.
		
		
	(3) StringTokenizer
	
			StringTokenizer 클래스는 문자열을 지정한 구분자로 문자열을 쪼개주는 클래스이다. 
			이렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부른다.
			StringTokenizer를 사용하기 위해서는 java.util.StringTokenizer를 import해야 한다.
	
	
	(4) StringBuilder
		
			자바에서 문자열하면 String을 대개 많이 떠올리고 사용할 것이다.
			그런데 이 문자열이 1개 이상 있고, 이들을 더해야 한다면 어떤 방법을 쓸 수 있을까?
			간단하게는 + 를 활용할 수 있다. 하지만, String 객체끼리 더하는 이 방법은 메모리 할당과 해제를 발생시키고 성능을 떨어뜨린다.
	
			왜 그럴까? 자바에서 String 객체는 변경 불가능하다. 한 번 생성되면 내용을 바꿀 수 없단 뜻이다. 
			따라서 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터로 들어간다.
	
			100만 개의 문자열을 연결해야 하는 상황이 왔다고 가정하자. 그리고 100만 개의 문자열을 추가로 생성했다고 하자.
			문자열끼리 연결하는 작업 시에는 내부적으로 여러 작업이 발생하고, 기존 문자열 값의 길이에 추가된 문자열의 크기를 더한 크기의 새로운 문자열이 생성된다. 
			이걸 100만 번 수행해야 하니 메모리를 많이 잡아먹게 되는 건 어찌보면 그렇게 되겠구나 싶다.
	
			이 경우 고려해볼 수 있는 것 중 하나가 이 포스팅의 주제인 StringBuilder다. 
			Stirng은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업 시 하나의 대안이 될 수 있다.
			
			StringBuilder의 사용방법은 다음과 같다.
		
			
			1. 선언
			
				StringBuilder sb = new StringBuilder(): 객체 선언
				StringBuilder sb = new StringBuilder("aaa" 처럼 문자열을 바로 넣을 수도 있다.
			
			2. 주요 메소드 활용
			
				.append(): 문자열을 추가한다. (sb.append("bbb"), sb.append(4))
				
				.insert(int offset, String str): offset 위치에 str을 추가한다. (sb.insert(2, "ccc"))
				
				.replace(): 첫번째와 두번째 파라미터로 받는 숫자 인덱스에 위치한 문자열을 대체한다. (.replace(3, 6, "ye"))
				
				.substring(int start, (int end)): 인덱싱. 파라미터가 하나라면 해당 인덱스부터 끝까지, 두개라면 시작점과 끝점-1 까지 인덱싱 (sb.substring(5), sb.substring(3, 7))
				
				.deleteCharAt(int index): 인덱스에 위치한 문자 하나를 삭제한다. (sb.deleteCharAt(3))
				 
				.delete(int start, int end): start 부터 end-1 까지의 문자를 삭제한다. (sb.delete(3, sb.length()))
				
				.toString(): String으로 변환한다. (sb.toString())
				
				.reverse(): 해당 문자 전체를 뒤집는다. (sb.reverse())
				
				.setCharAt(int index, String s): index 위치의 문자를 s로 변경
				
				.setLength(int len): 문자열 길이 조정, 현재 문자열보다 길게 조정하면 공백으로 채워짐, 현재 문자열보다 짧게 조정하면 나머지 문자는 삭제
				
				.trimToSize(): 문자열이 저장된 char[] 배열 사이즈를 현재 문자열 길이와 동일하게 조정, String 클래스의 trim()이 앞 뒤 공백을 제거하는 것과 같이 공백 사이즈를 제공하는 것,
				 			   배열의 남는 사이즈는 공백이므로, 문자열 뒷부분의 공백을 모두 제거해준다고 보면 됨
	
	
*/
