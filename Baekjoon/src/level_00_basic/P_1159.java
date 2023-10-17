package level_00_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 농구 경기
public class P_1159 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		Queue<Character> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			arr[s.charAt(0)-'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] >= 5) {
				q.add((char) ((char) i + 'a'));
			}
		}
		if (q.isEmpty()) System.out.println("PREDAJA");
		else for (char ch : q) System.out.print(ch);
	}
}
