import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board board = new XO_Board(3);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, please enter your name:");
        String p1_name = scanner.next();

        System.out.println("Now choose either X or O:");
        char p1_sym = scanner.next().charAt(0);
        p1_sym = Character.toUpperCase(p1_sym);

        char p2_sym = (p1_sym == 'X') ? 'O' : 'X';
        p2_sym = Character.toUpperCase(p2_sym);

        System.out.println("Player 2, please enter your name:");
        String p2_name = scanner.next();

        Player player1 = new Player(p1_name, p1_sym), player2 = new Player(p2_name, p2_sym);

        GameManager game = new GameManager(board, player1, player2);
        game.play();
    }
}
