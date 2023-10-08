package level_00_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모음의 개수
public class P_1264 {

	private static int ans;
	private static char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			ans = 0;
			String s = br.readLine();
			s = s.toLowerCase();
			if (s.equals("#")) break;
			char[] ch = s.toCharArray();
			for (char c : ch) {
				for (int i = 0; i < 5; i++) {
					if (c == vowel[i]) {
						ans++;
						continue;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
