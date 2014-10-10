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
    public char[][] board = {{'e','e','e'},{'e','e','e'},{'e','e','e'}};
    public boolean turn;
    GameController(int player){
        if(player == 0){
          this.turn = true;  
        }        
        else {
            this.turn = false;
        }
    }
    
    public boolean checkWinner(){
        return true;
    }
    
    public boolean isValid(int[] pos){
        if(pos[0] >= 0 && pos[0] < 3 && pos[1] >=0 && pos[1] < 3 && board[pos[0]][pos[1]] == 'e'){
            return true;
        }
        return false;
    }
    
    public boolean setMove(int[] pos){
        if(isValid(pos)){
        if(this.turn == true) {
            board[pos[0]][pos[1]] = 'X';
        }
        else {
            board[pos[0]][pos[1]] = 'O';
        }  
        turn = !turn;
        return true;
        }
        else{
            return false;
        }
    }
    
    public void printBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if(j!=2)
                    System.out.print("|");
            }
            if(i!=2)
            System.out.print("\n-|-|-\n");
        }
        
    }
}
