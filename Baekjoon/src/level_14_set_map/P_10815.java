package level_14_set_map;

import java.io.*;
import java.util.*;

// 숫자 카드
public class P_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// key를 Integer로 선언할 경우 HashMap에서는 이를 내부적으로
		// Integer.valueOf() 함수를 호출하여 Integer형으로 변환하는 과정을 거치므로
		// Key를 Integer보다 String으로 선언하는 것이 조금 더 성능 측면에서 효율적이다.
		HashMap<String, Integer> hm = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			hm.put(st.nextToken(), 0);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			if (hm.get(st.nextToken()) != null) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb);
	}
}
