class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }
        Queue<int[]> q = new LinkedList<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid.get(r).get(c) == 1) {
                    q.offer(new int[]{r, c});
                    dist[r][c] = 0;
                }
            }
        }
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        boolean[][] visited = new boolean[n][n];
        pq.offer(new int[]{0, 0, dist[0][0]});
        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int r = cell[0];
            int c = cell[1];
            int safe = cell[2];
            if (visited[r][c]) continue;
            visited[r][c] = true;
            if (r == n - 1 && c == n - 1) {
                return safe;
            }
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    int newSafe = Math.min(safe, dist[nr][nc]);
                    pq.offer(new int[]{nr, nc, newSafe});
                }
            }
        }
        return 0;
    }
}