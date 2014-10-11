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
    public int checkWinner(){
        
        for (int i = 0; i < 3; i++) {
            if(board[i][0] == 'X' && board[i][1] == 'X' &&board[i][2] == 'X') return 0;
            if(board[0][i] == 'X' && board[1][i] == 'X' &&board[2][i] == 'X') return 0;
            if(board[i][0] == 'O' && board[i][1] == 'O' &&board[i][2] == 'O') return 1;
            if(board[0][i] == 'O' && board[1][i] == 'O' &&board[2][i] == 'O') return 1;
        }
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') return 0;
        if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') return 1;
        if(board[0][3] == 'X' && board[1][1] == 'X' && board[3][0] == 'X') return 0;
        if(board[0][3] == 'O' && board[1][1] == 'O' && board[3][0] == 'O') return 1;

        
        return -1;
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
