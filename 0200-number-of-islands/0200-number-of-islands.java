class Solution {
    public int numIslands(char[][] grid) {
        // Initialize return variable
        int count = 0;

        // Traverse grid
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    BFS(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void BFS(char[][] grid, int row, int col) {
        // Base Case: Check out of bounds or 0
        if(row < 0 || row > grid.length - 1 || col < 0 || col > grid[row].length - 1 || grid[row][col] == '0')
            return;
        
        // Mark as visitied
        grid[row][col] = '0';

        // Call BFS
        BFS(grid, row - 1, col); // Up
        BFS(grid, row + 1, col); // Down
        BFS(grid, row, col - 1); // Left
        BFS(grid, row, col + 1); // Right

    }
}