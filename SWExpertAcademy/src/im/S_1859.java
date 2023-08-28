package im;

import java.util.Scanner;
 
// 백만장자 프로젝트
// 앞에서부터가 안 되면 뒤에서부터 해보자.
// 다른 최댓값이 나오면 최댓값의 경신을, 최댓값이 나오지 않으면 차이만큼 저장한다.
public class S_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // test case
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt(); // 입력할 정수의 개수
            int[] arr = new int[n]; // 값을 비교할 배열
 
            // 배열에 값 입력
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            // 배열의 뒤부터 최대값을 저장하며 차이를 ans에 더하며 저장
            long max = 0;
            long ans = 0; // case가 100만 회가 10000개 이므로 100억을 넘어 long으로 자료형 선언
            for (int i = n - 1; i >= 0; i--) {
                if (max < arr[i]) {
                    max = arr[i];
                } else if (max > arr[i]) {
                    ans += max - arr[i]; 
                }
 
            }
            System.out.printf("#%d %d\n", t, ans);
        }
    }
}