package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B20220823_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        System.out.println(factorial(N));
    }

    public static int factorial(int N) {
        // N이 1보다 작을 경우 1반환
        if(N <= 1)
            return 1;
        // N * 팩토리얼(N-1) 재귀 순환
        else
            return N * factorial(N-1);
    }
}
