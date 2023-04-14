import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private int x;
    private int y;


    Player(String name, char sym) {
        this.name = name;
        this.symbol = sym;
    }

    public void get_move() {
        System.out.println("Enter your move (e.g. 0 2): ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
    }
    public boolean is_valid_move(Board board) {
        return this.x <= 2 && this.y <= 2 && board.grid[this.x][this.y] == ' ';
    }
    public void set_name(String name) {
        this.name = name;
    }
    public void set_symbol(char symbol) {
        this.symbol = symbol;
    }
    public char get_Symbol(){
        return symbol;
    }
    public int get_x(){
        return x;
    }
    public int get_y(){
        return y;
    }
    public String get_name(){
        return "Player: "+ name;
    }
    public char get_symbol() {
        return symbol;
    }
}
