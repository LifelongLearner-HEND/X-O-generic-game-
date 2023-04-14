public class XO_Board extends Board  {
    XO_Board(int n) {
        super(n);
    }

    @Override
    boolean is_winner() {
        // check if there is a winner in the rows
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != ' ') {
                return true;
            }
        }
        // check if there is a winner in the columns
        for (int i = 0; i < n; i++) {
            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != ' ') {
                return true;
            }
        }
        // check if there is a winner in the diagonals
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != ' ') {
            return true;
        }
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != ' ') {
            return true;
        }
        return false;
    }
    boolean is_draw() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
