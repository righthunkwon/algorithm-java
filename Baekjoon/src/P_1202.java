import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 보석 도둑

// 1. 보석은 무게 순으로 오름차순 정렬
// 2. 가방의 최대 무게를 입력받은 뒤 오름차순 정렬
// 3. 가격 순서대로 내림차순 정렬하는 우선순위 큐 생성
// 4. 반복문을 수행하며 현재 가방이 담을 수 있는 최대 무게보다 작거나 같은 무게를 가진 보석을 우선순위 큐에 담기
// 5. 가장 가격이 비싼 우선순위 큐의 제일 첫번째 요소를 꺼내 누적합
public class P_1202 {
    
    private static class Gem {
        int m;
        int v;
        
        public Gem(int m, int v) {
            this.m = m;
            this.v = v;
        }
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        ArrayList<Gem> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = scan.nextInt();
            int v = scan.nextInt();
            list.add(new Gem(m, v));
        }
        Collections.sort(list, (o1, o2) -> o1.m - o2.m); //무게순 정렬
        
        int[] weight = new int[k];
        for(int i = 0; i < k; i++) {
            weight[i] = scan.nextInt();
        }
        Arrays.sort(weight);
        
        long total = 0;
        int listIdx = 0;
        PriorityQueue<Gem> pq = new PriorityQueue<>((o1, o2) -> o2.v - o1.v); //가격순 정렬
        for(int i = 0; i < k; i++) {
            while(listIdx < n && list.get(listIdx).m <= weight[i]) {
                Gem current = list.get(listIdx++);
                pq.add(new Gem(current.m, current.v));
            }
            if(!pq.isEmpty()) total += pq.poll().v;
        }
        System.out.println(total);
    }

}
