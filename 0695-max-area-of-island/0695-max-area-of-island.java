class Solution {
    int n, m;
    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, grid));
                }
            }
        }
        return maxArea;
    }

    public int dfs(int x, int y, int[][] grid) {
        if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y] == 0) {
            return 0;
        }
        grid[x][y] = 0;
        int area = 1;
        area += dfs(x - 1, y, grid);
        area += dfs(x + 1, y, grid);
        area += dfs(x, y - 1, grid);
        area += dfs(x, y + 1, grid);
        return area;
    }
}
