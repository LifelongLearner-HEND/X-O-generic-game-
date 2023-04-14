public class GameManager {
    private Board board;
    private Player player1;
    private Player player2;

    private int turn = 0;

    public GameManager(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play () {
        // while there is no winner and the board is not full
        while (!board.is_winner() && !board.is_draw()) {
            // display the board
            board.display_board();
            // get the move from the current player
            int x, y;
            if (turn % 2 == 0) {
                System.out.println(player1.get_name());
                player1.get_move();
                while (!player1.is_valid_move(board)) {
                    System.out.println("Invalid Move!");
                    player1.get_move();
                }
                // update the board with the move
                board.update_board(player1.get_x(), player1.get_y(), player1.get_symbol());
            } else {
                System.out.println(player2.get_name());
                player2.get_move();
                while (!player2.is_valid_move(board)) {
                    System.out.println("Invalid Move!");
                    player2.get_move();
                }
                // update the board with the move
                board.update_board(player2.get_x(), player2.get_y(), player2.get_symbol());
            }
            // increment the turn
            turn++;
        }
        board.display_board();
        // check if there is a winner
        if (board.is_winner()) {
            System.out.println("The winner is: " + (turn % 2 == 0 ? player2.get_name() : player1.get_name()));
        } else {
            System.out.println("The game is a draw");
        }
    }
}
