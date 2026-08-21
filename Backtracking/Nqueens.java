package Backtracking;

public class Nqueens {

    public static void nQueens(char board[][],int row){

        if(row==board.length){
            printBoard(board);
            return board;
        }

        for(int j=0;j<row;j++){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'X';
        }

    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board,0);
        printBoard()
    }
}
