class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        int INF = 1000000006;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    res[i][j] = 0;
                    q.add(new int[]{i, j});
                } else {
                    res[i][j] = INF;
                }
            }
        }
        int[] dirRow = {0, 0, -1, 1};
        int[] dirCol = {-1, 1, 0, 0};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            for (int k = 0; k < 4; k++) {
                int nr = r + dirRow[k];
                int nc = c + dirCol[k];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (res[nr][nc] > res[r][c] + 1) {
                        res[nr][nc] = res[r][c] + 1;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }
        return res;
    }
}