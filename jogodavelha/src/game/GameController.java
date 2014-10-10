/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Bruno
 */
public class GameController {
    public char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    public int turn;
    GameController(int player){
        this.turn = player;        
    }
    
    public boolean checkWinner(){
        return true;
    }
    
    public void setMove(int[] pos){
        if(this.turn == 0) board[pos[0]][pos[1]] = 'X';
        else board[pos[0]][pos[1]] = 'O';        
    }
    
    public void printBoard(){
        System.out.println(board);
    }
}