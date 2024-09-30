package tictactoegame;

public class Demo {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        System.out.println("Winner is: " + ticTacToeGame.startGame());
        ticTacToeGame.printFinalResult();
    }
}
