class Solution {
    int n, m;
    int oC, nC;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        n = image.length;
        m = image[0].length;
        oC = image[sr][sc];
        nC = color;
        if (oC== nC) return image;
        dfs(sr, sc, image);
        return image;
    }
    public void dfs(int x, int y, int[][] image) {
        if (x < 0 || y < 0 || x >= n || y >= m) return;
        if (image[x][y]!=oC) return;
        image[x][y] = nC;
        dfs(x - 1, y, image);
        dfs(x + 1, y, image);
        dfs(x, y - 1, image);
        dfs(x, y + 1, image);
    }
}
