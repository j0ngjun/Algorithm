package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B20220824_2447 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        arr = new char[N][N];

        recur(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j  = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void recur(int x, int y, int N, boolean blank) {
        // 공백칸일 경우
        if(blank) {
            for(int i = x; i < x + N; i++) {
                for(int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더 이상 쪼갤 수 없는 최소 단위 블록일 때
        if(N == 1) {
            arr[x][y] = '*';
            return;
        }

		// N = 27일 경우 한 블록의 사이즈는 9이고,
		// N = 9일 경우 한 블록의 사이즈는 3이듯
		// 해당 블록의 한 칸을 담을 변수를 의미 size = N / 3
        // 가운데 공백을 위한 3*3 배열에서 중간 값인 5를 체크하기 위한 변수 count
        int size = N / 3;
        int count = 0;
        for(int i = x; i < x + N; i += size) {
            for(int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) { // 공백 칸일 경우
                    recur(i, j, size, true);
                } else {
                    recur(i, j, size, false);
                }
            }
        }
    }
}
