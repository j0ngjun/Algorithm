package LeetCode;

public class L20220824_1582 {
    // 같은 행, 같은 열에 1이 1개만 있을 경우 +1 반환
    class Solution {
        public int numSpecial(int[][] mat) {
            // 열, 행에 1의 갯수를 체크하기 위한 변수 선언
            int[] row = new int[mat.length];
            int[] col = new int[mat[0].length];
            int count = 0;

            // 주어진 행렬을 돌면서 1일 경우 해당하는 열과 행의 값 1 증가
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == 1) {
                        row[i]++;
                        col[j]++;
                    }
                }
            }

            // 다시 행렬을 돌면서 1일 경우에 해당하는 열과 행의 값이 1일 경우에만 count + 1
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == 1) {
                        if (row[i] == 1 && col[j] == 1)
                            count++;
                    }
                }
            }
            return count;
        }
    }
}
