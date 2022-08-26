package BaekJoon.B20220823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int N) {
        // 0번째 피보나치 수는 0
        if(N == 0)
            return 0;
        // 1번째 피보나치 수는 1
        if(N == 1)
            return 1;

        // N-1번째 피보나치 수와 N-2번째 피보나치 수 재귀 순환
        return fibonacci(N-1) + fibonacci(N-2);
    }
}
