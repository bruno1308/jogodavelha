/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class main {
    public static void main(String[] args) {
        GameController gc = new GameController(0);
        int winner = gc.checkWinner();
        while( winner == -1){
            gc.printBoard();
            System.out.println("\n\n");
            Scanner input = new Scanner(System.in);
            int row = input.nextInt();
            int column = input.nextInt();
            int move[] = {row, column};
            gc.setMove(move);
            winner = gc.checkWinner();
        }
        System.out.println("WINNER IS PLAYER "+winner);
        //bruno viadao
    }
}
