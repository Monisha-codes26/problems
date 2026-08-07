class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length, n = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        int spc = image[sr][sc];
        image[sr][sc] = color;
        visited[sr][sc] = true;
        q.offer(new int[] { sr, sc });
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int i = temp[0], j = temp[1];
            if (i - 1 >= 0 && image[i - 1][j] == spc && !visited[i - 1][j]) {
                image[i - 1][j] = color;
                visited[i - 1][j] = true;
                q.offer(new int[] { i - 1, j });
            }
            if (j - 1 >= 0 && image[i][j - 1] == spc && !visited[i][j - 1]) {
                image[i][j - 1] = color;
                visited[i][j - 1] = true;
                q.offer(new int[] { i, j - 1 });
            }
            if (i + 1 < m && image[i + 1][j] == spc && !visited[i + 1][j]) {
                image[i + 1][j] = color;
                visited[i + 1][j] = true;
                q.offer(new int[] { i + 1, j });
            }
            if (j + 1 < n && image[i][j + 1] == spc && !visited[i][j + 1]) {
                image[i][j + 1] = color;
                visited[i][j + 1] = true;
                q.offer(new int[] { i, j + 1 });
            }
        }
        return image;
    }
}
