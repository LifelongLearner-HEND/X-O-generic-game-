abstract public class Board {
    protected int n;
    protected char[][] grid;
    Board(int n){
        this.n = n;
        grid = new char[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j <n;j++){
                grid[i][j] = ' ';
            }
        }
    }

    public void update_board(int x,int y, char symbol){
        grid[x][y] = symbol;
    }

    abstract boolean is_winner();
    abstract boolean is_draw();

    public void display_board(){

        for(int i = 0;i < n;i++){
            for(int j = 0;j <n;j++){
                if (j < n - 1)
                    System.out.print(grid[i][j] + " " + '|');
                else
                    System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
