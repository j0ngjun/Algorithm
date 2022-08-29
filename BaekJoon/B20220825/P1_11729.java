package BaekJoon.B20220825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 최종 옮긴 숫자는 2의 N승 -1
        sb.append((int) (Math.pow(2, N) - 1)).append("\n");
        recur(N, 1, 2, 3);
        System.out.println(sb);
    }

    // N : 원판의 갯수, start : 출발지, mid : 거치는 곳, end : 목적지
    public static void recur(int N, int start, int mid, int end){
        // 이동할 원판 수가 1일 때
        if(N == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        // A -> C로 옮길때,
        // 1. N-1개를 A에서 B로 이동 (start의 N-1개의 원판을 mid로 옮긴다.)
        recur(N - 1, start, end, mid);
        // 2. 1개를 A에서 C로 이동 (start의 N번째 원판을 end로 옮긴다.)
        sb.append(start).append(" ").append(end).append("\n");
        // 3. N-1개를 B에서 C로 이동 (mid의 N-1개의 원판을 end로 옮긴다.
        recur(N - 1, mid, start, end);
    }
}
