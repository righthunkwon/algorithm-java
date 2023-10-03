package level_13_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 나이순 정렬
// 클래스를 정의하고 정의한 클래스를 바탕으로 
// Comparator를 활용하여 정렬하면 기분이 좋다.
public class P_10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 멤버 입력
		int n = Integer.parseInt(br.readLine());
		List<Member> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			list.add(new Member(age, name));
		}
		
		Collections.sort(list, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				return m1.age - m2.age; // 오름차순
			}
		});
		
		for (Member member : list) {
			System.out.printf("%d %s\n", member.age, member.name);
		}
	}
}

class Member {
	int age;
	String name;
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}
}