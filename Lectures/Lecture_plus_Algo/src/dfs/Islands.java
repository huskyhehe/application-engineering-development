package dfs;

public class Islands {
    public int numIslands(char[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[0].length; j ++) {
                if (grid[i][j] == '1') {
                    dfsGrid(grid, i, j);
                    res ++;
                }
            }
        }
        return res;
    }

    public void dfsGrid(char[][] grid, int row, int col) {
        int nRow = grid.length;
        int nCol = grid[0].length;

        if (row < 0 || col < 0 || row >= nRow || col >= nCol || grid[row][col] == '0') return;

        grid[row][col] = '0';
        dfsGrid(grid, row - 1, col);
        dfsGrid(grid, row + 1, col);
        dfsGrid(grid, row, col - 1);
        dfsGrid(grid, row, col + 1);
    }
}
