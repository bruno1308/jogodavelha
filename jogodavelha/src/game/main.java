/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Bruno
 */
public class main {
    public static void main(String[] args) {
        GameController gc = new GameController(0);
        gc.printBoard();
        System.out.println("\n\n");
        int move[] = {0,0};
        gc.setMove(move);
        gc.setMove(move);
        gc.printBoard();
        //bruno viadao
    }
}
