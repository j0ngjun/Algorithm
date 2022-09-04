package LeetCode.L20220904;

public class P1_695 {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int maxArea = 0;

            for(int r = 0; r < grid.length; r++) {
                for(int c = 0; c < grid[0].length; c++) {
                    if(grid[r][c] == 1) {
                        int area = expand(grid, r, c, 1);
                        maxArea = Math.max(area, maxArea);
                    }
                }
            }

            return maxArea;
        }

        private int expand(int[][] grid, int r, int c, int area) {
            // 방문 했거나 범위를 벗어날 때
            if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != 1)
                return 0;

            // 방문 체크
            grid[r][c] = 0;

            area += expand(grid, r+1, c, 1);
            area += expand(grid, r-1, c, 1);
            area += expand(grid, r, c+1, 1);
            area += expand(grid, r, c-1, 1);

            return area;
        }
    }
}
