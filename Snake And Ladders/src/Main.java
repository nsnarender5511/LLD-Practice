import com.narender.snakeAndLadders.Board;
import com.narender.snakeAndLadders.Player;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        board.create();

        Player p1 = new Player("Shakti", "Red");
        Player p2 = new Player("Narender", "Green");

        board.play(p1, p2);

    }
}