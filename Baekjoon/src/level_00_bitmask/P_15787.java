package level_00_bitmask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 비트마스크
// 존재를 1로, 존재하지 않음을 0으로 표현
// 즉, 비트마스크는 이진수를 이용하여 두 가지 정보를 표현하는 것

// 비트마스크의 상태를 변경하기 위한 다양한 연산은
// 비트연산으로 효율적으로 구현 가능한데, 이것이 비트마스크를 사용하는 이유

// (1) 비트 연산 기본
// & : and (둘다 1이면 1)
// | : or (하나라도 1이면 1)
// ^ : xor (다르면 1, 같으면 0)
// ~ : not (1은 0, 0은 1)
// <<, >>, >>> : shift (a를 b비트 만큼 이동)

// (2) 비트 연산 응용(집합)
// 유튜브 보고 정리
/*
 * 원소 추가 : A |= (1 << k)
 * 원소 삭제 : A &= ~(1 << k)
 * 원소 조회 : A & (1 << k)
 * 

 * 
 * 
 * */

// 기차가 어둠을 헤치고 은하수를
// 사람이 있음을 1로, 없음을 0으로 표현

public class P_15787 {
	public static void main(String[] args) throws IOException {
		// 입력이 최대 100,000개이므로 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 중복을 없애기 위한 Set 사용
		Set<Integer> set = new HashSet<>();

		// 입력
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 기차의 수
		int m = Integer.parseInt(st.nextToken()); // 명령의 수
		int[] train = new int[n + 1]; // 기차 
		int order, tidx, sidx; // 명령, 기차번호, 좌석번호

		// 구현
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			order = Integer.parseInt(st.nextToken()); // 명령
			tidx = Integer.parseInt(st.nextToken()); // 기차번호

			switch (order) {
			case 1:
				sidx = Integer.parseInt(st.nextToken()); // 좌석번호
				train[tidx] |= 1 << sidx;
				break;
			case 2:
				sidx = Integer.parseInt(st.nextToken()); // 좌석번호
				train[tidx] &= ~(1 << sidx);
				break;
			case 3:
				// 기차를 좌측으로 한 칸 밀기 위해 << 1 연산 수행
				// 기차 좌석이 20자리로 제한되어 있으므로 21비트 이상은 제거
				train[tidx] <<= 1;
				train[tidx] &= ((1 << 21) - 1);
				break;
			case 4:
				// 기차를 우측으로 한 칸 밀기 위해 >> 1 연산 수행
				train[tidx] >>= 1;
				train[tidx] &= ~1;
				break;
			}
		}
		
		// 중복 자료를 제거 후 정답 출력
		for (int i = 1; i <= n; i++) {
			set.add(train[i]);
		}
		System.out.println(set.size());
	}
}